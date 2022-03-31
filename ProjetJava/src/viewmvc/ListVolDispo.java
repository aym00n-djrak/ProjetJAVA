package viewmvc;

import DAO.*;
import controlmvc.ReadImage;
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
    CityDAOImpl citydao = new CityDAOImpl();
    JInternalFrame creavol = new JInternalFrame();
    ArrayList<Vol> vol = new ArrayList<>();
    VolDAOImpl voldao = new VolDAOImpl();
    
    Clients c= new Clients();
    
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
        
        c=client;
        
        desktop1 = desktop;
        city = citydao.GetAllCity();

        vol = voldao.GetAllVol();

        JButton[] buttons = new JButton[city.size()];

        System.out.println("La ville choisie est :" + city.get(id).GetNom());

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
                JButton btnprix = new JButton("Prix : " + city.get(id).GetPrix() + " €");

                ReadImage im = new ReadImage();

                btn.setPreferredSize(boutonDim);
                btndate.setPreferredSize(boutonDim);
                btnheure.setPreferredSize(boutonDim);
                compagnie.setPreferredSize(boutonDim);
                type.setPreferredSize(boutonDim);
                numvol.setPreferredSize(boutonDim);

                btnimg.setPreferredSize(boutonDim);
                btnprix.setPreferredSize(boutonDim);

                buttons[j] = btn;

                btn.setBackground(Color.ORANGE);
                btnprix.setBackground(Color.WHITE);

                btnimg.setIcon(new javax.swing.ImageIcon(im.getImage(id)));
                btn.addActionListener(this);

                pan.add(btn);
                pan.add(btnimg);
                pan.add(btndate);
                pan.add(btnheure);
                pan.add(compagnie);
                pan.add(type);
                pan.add(numvol);
                pan.add(btnprix);

                idcity = id;
                idvol=j;
            } else if(j==vol.size()) {
                JOptionPane.showMessageDialog(null, "Aucun vol n'existe pour la destination: " + city.get(id).GetNom());
                this.setVisible(false);
            }

        }
        System.out.println("Chargement terminé !");

        //on va mettre 400 pour la hauteur du panel comme ca le hauteur
        //des boutons est grande que du panel
        pan.setPreferredSize(new Dimension(600, 2000));

        this.add(scrollPane);

        desktop1.add(this).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(null, "Enregistrement du billet...");
        ReservationDAOImpl reservdao = new ReservationDAOImpl();

        JButton btn = (JButton) e.getSource();
        Vol volrecord = new Vol();
        volrecord = voldao.GetVol(idvol);
        System.out.println("L'id de la ville est : "+idcity);
        System.out.println("L'id du vol est :" + idvol);
        System.out.println("Le nom de la ville est: "+ volrecord.GetDestination());

        Reservation reservation = new Reservation();
        reservation.SetNombreBillet(1);
        reservation.SetStatut("Non payé");
        reservation.SetConfirmation(0);
        reservation.SetForeignKeyVol(idvol);
        reservation.SetForeignKeyClientMembre(c.GetNumReservation());

        reservdao.AddReservation(reservation);
        JOptionPane.showMessageDialog(null, "Voyage vers : " + btn.getText() + " sauvegardé dans le billet,  vous allez être redirigez vers l'interface de paiement.");
        setVisible(false);
        //voldao.DeleteVol(idvol);
      //  JOptionPane.showMessageDialog(null, "Le vol n°" + volrecord.GetNumeroVol() + " en destination de : " + btn.getText() + " a été supprimé de la base de données.");
    }

}