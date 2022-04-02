package viewmvc;

import modelmvc.DAO.PaiementDAOImpl;
import modelmvc.DAO.UsersDAOImpl;
import modelmvc.DAO.City;
import modelmvc.DAO.CityDAOImpl;
import modelmvc.DAO.ReservationDAOImpl;
import modelmvc.DAO.Reservation;
import modelmvc.DAO.Paiement;
import modelmvc.DAO.Clients;
import modelmvc.DAO.VolDAOImpl;
import modelmvc.DAO.Vol;
import modelmvc.DAO.Users;
import controlmvc.MailSender;
import controlmvc.ReadImage;
import controlmvc.ReducPaiement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListVolDispo extends JInternalFrame implements ActionListener {

    Dimension boutonDim = new Dimension(200, 75);
    ArrayList<City> city = new ArrayList<City>();

    ArrayList<Reservation> reservationliste = new ArrayList<>();
    ReducPaiement reduc = new ReducPaiement();

    CityDAOImpl citydao = new CityDAOImpl();
    JInternalFrame creavol = new JInternalFrame();
    ArrayList<Vol> vol = new ArrayList<>();
    VolDAOImpl voldao = new VolDAOImpl();

    int reduction;
    float promo;

    Clients c = new Clients();
    JPanel pan = new JPanel();

    JScrollPane scrollPane = new JScrollPane(pan);
    public int idcity, idvol;

    JDesktopPane desktop1 = new JDesktopPane();

    public ListVolDispo() throws SQLException {
        super("Mes destinations");

        // this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 2000);
        // init();

    }

    public void init(JDesktopPane desktop, int id, Clients client) throws SQLException {

        c = client;
        System.out.println("Le client est : " + c.GetPrenom());
        desktop1 = desktop;
        city = citydao.GetAllCity();

        vol = voldao.GetAllVol();

        JButton[] buttons = new JButton[city.size()];

        System.out.println("La ville choisie est :" + city.get(id).GetNom());
        reduction = reduc.ReducPaiement(c, city.get(id));
        promo = (1 - ((float) reduction / (float) (city.get(id).GetPrix()))) * 100;
        System.out.println("Chargement....");

        for (int j = 0; j < vol.size(); j++) {

            //AJOUT DES DESTINATIONS DANS UNE LISTE POUR SELECTIONNER CELLE AVEC LE MEME ID
            if (city.get(id).GetNom().equals(vol.get(j).GetDestination())) {
                JButton btn = new JButton(vol.get(j).GetDestination());
                JButton btndate = new JButton("Depart: " + vol.get(j).GetDateDepart() + " Arrivée: " + vol.get(j).GetDateArrivee());
                JButton btnheure = new JButton("De: " + vol.get(j).GetHeureDepart() + " A :" + vol.get(j).GetHeureArrivee());
                JButton compagnie = new JButton("Compagnie: " + vol.get(j).GetCompagnie());
                JButton type = new JButton("Type d'avion: " + vol.get(j).GetTypeAvion());
                JButton numvol = new JButton("Numéro de vol: " + vol.get(j).GetNumeroVol());

                JButton btnimg = new JButton();
                JButton btnprix = new JButton("Prix : " + reduction + " €");
                System.out.println("La reduc affichage est de :" + promo);
                JButton btnpromo = new JButton("Promo de: " + promo + " %");
                ReadImage im = new ReadImage();

                btn.setPreferredSize(boutonDim);
                btndate.setPreferredSize(boutonDim);
                btnheure.setPreferredSize(boutonDim);
                compagnie.setPreferredSize(boutonDim);
                type.setPreferredSize(boutonDim);
                numvol.setPreferredSize(boutonDim);

                btnimg.setPreferredSize(boutonDim);
                btnprix.setPreferredSize(boutonDim);
                btnpromo.setPreferredSize(boutonDim);

                buttons[j] = btn;

                btn.setBackground(Color.ORANGE);
                btnprix.setBackground(Color.WHITE);
                btnpromo.setBackground(Color.WHITE);

                btnimg.setIcon(new javax.swing.ImageIcon(im.getImage(city.get(id).GetId())));
                btn.addActionListener(this);

                pan.add(btn);
                pan.add(btnimg);
                pan.add(btndate);
                pan.add(btnheure);
                pan.add(compagnie);
                pan.add(type);
                pan.add(numvol);
                pan.add(btnprix);
                pan.add(btnpromo);

                idcity = id;
                idvol = vol.get(j).GetId();
            } else if (j == vol.size()) {
                JOptionPane.showMessageDialog(null, "Aucun vol n'existe pour la destination: " + city.get(id).GetNom());
                this.setVisible(false);
            }

        }
        System.out.println("Chargement terminé !");

        pan.setPreferredSize(new Dimension(600, 2000));

        this.add(scrollPane);

        desktop1.add(this).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int idreserv;
        JOptionPane.showMessageDialog(null, "Enregistrement du billet...");
        ReservationDAOImpl reservdao = new ReservationDAOImpl();

        Reservation r = new Reservation();
        JButton btn = (JButton) e.getSource();
        Vol volrecord = new Vol();
        volrecord = voldao.GetVol(idvol);
        System.out.println("L'id de la ville est : " + idcity);

        System.out.println("L'id du vol est :" + idvol);
        System.out.println("Le nom de la ville est: " + volrecord.GetDestination());

        Reservation reservation = new Reservation();
        reservation.SetNombreBillet(1);
        reservation.SetStatut("Non payé");
        reservation.SetConfirmation(0);
        reservation.SetForeignKeyVol(idvol);
        reservation.SetForeignKeyClientMembre(c.GetNumReservation());

        System.out.println("l'id reserv membre est : " + reservation.GetForeignKeyClientMembre());

        reservdao.AddReservation(reservation);

        JOptionPane.showMessageDialog(null, "Voyage vers : " + btn.getText() + " sauvegardé dans le billet,  vous allez être redirigez vers l'interface de paiement.");

        reservationliste = reservdao.GetAllReservation();

        for (int i = 0; i < reservationliste.size(); i++) {
            if (reservationliste.get(i).GetForeignKeyClientMembre() == c.GetNumReservation()) {
                r = reservdao.GetReservation(reservationliste.get(i).GetId());
            }
        }

        System.out.println("L'id de la liste est : " + r.GetId());
        setVisible(false);
        Paiementaffichage paiement = new Paiementaffichage();

        Paiement paye = new Paiement();
        PaiementDAOImpl pdao = new PaiementDAOImpl();

        //paye.SetMontant(city.get(idcity).GetPrix());
        //paye.SetMontant(reduc.ReducPaiement(c, city.get(idcity)));
        paye.SetMontant(reduction);
        paye.SetDate(volrecord.GetDateDepart());
        paye.SetForeignKeyReservationt(r.GetId());
        paye.SetForeignKeyClient(c.GetId());

        System.out.println("L'id Client est: " + c.GetId());

        System.out.println(paye.GetMontant());
        System.out.println(paye.GetDate());
        System.out.println(paye.GetForeignKeyReservation());
        System.out.println(paye.GetForeignKeyClient());

        pdao.AddPaiement(paye);

        desktop1.add(paiement).setVisible(true);

        UsersDAOImpl udao = new UsersDAOImpl();
        Users user = new Users();
        user = udao.GetUser(c.GetId());
        System.out.println(new MailSender().sendMail("marvel.history.fr@gmail.com", user.GetMail(), "Confirmation réservation vol n° " + volrecord.GetNumeroVol(), "On vous remercie pour la reservation de vol n° " + volrecord.GetNumeroVol() + ", d'identifiant: "+volrecord.GetId()+" en destination de " + volrecord.GetDestination() + " au prix de " + paye.GetMontant() + "€. Cordialement, l'administration de l'Aeroport de Monaco"));
        //voldao.DeleteVol(idvol);
        //  JOptionPane.showMessageDialog(null, "Le vol n°" + volrecord.GetNumeroVol() + " en destination de : " + btn.getText() + " a été supprimé de la base de données.");
    }

}
