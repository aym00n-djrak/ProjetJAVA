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

public class ListVolReserve extends JInternalFrame implements ActionListener {

    Dimension boutonDim = new Dimension(200, 75);
    ArrayList<City> city = new ArrayList<City>();

    ArrayList<Reservation> reservationliste = new ArrayList<>();

    CityDAOImpl citydao = new CityDAOImpl();
    JInternalFrame creavol = new JInternalFrame();
    ArrayList<Vol> vol = new ArrayList<>();
    VolDAOImpl voldao = new VolDAOImpl();

    Clients c = new Clients();

    JPanel pan = new JPanel();

    JScrollPane scrollPane = new JScrollPane(pan);
    public int idcity, idvol;

    JDesktopPane desktop1 = new JDesktopPane();

    public ListVolReserve() throws SQLException {
        super("Mes réservations");

        // this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 2000);
        // init();

    }

    public void init(JDesktopPane desktop, Clients client) throws SQLException {

        c = client;

        desktop1 = desktop;

        VolDAOImpl voldao = new VolDAOImpl();
        Vol vol = new Vol();

        ReservationDAOImpl rdao = new ReservationDAOImpl();
        Reservation reserv = new Reservation();

        ArrayList<Paiement> paye = new ArrayList<>();
        PaiementDAOImpl p = new PaiementDAOImpl();

        paye = p.GetAllPaiement();

        JButton[] buttons = new JButton[paye.size()];

        System.out.println("Chargement....");

        System.out.println("Id utilisateur: " + c.GetId());

        for (int i = 0; i < paye.size(); i++) {
            System.out.println("le rang est : " + i);

            //ON CHERCHE LES PAIEMENTS CORRESPONDANT AU CLIENT
            if (c.GetId() == paye.get(i).GetForeignKeyClient()) {

                //ON PREND LE NUMERO DE RESERVATION DE PAIEMENT CORRESPONDANT A LA RESERVATION
                reserv = rdao.GetReservation(paye.get(i).GetForeignKeyReservation());

                System.out.println("Id reservation paiement: " + paye.get(i).GetForeignKeyReservation());
                System.out.println("Id reservation vol: " + reserv.GetForeignKeyVol());
                vol = voldao.GetVol(reserv.GetForeignKeyVol());

                //ON CREE LES BOUTONS PERMETTANT LAFFICHAGE DES DONNEES VOULUES
                JButton btn = new JButton(vol.GetDestination());
                JButton prix = new JButton("" + paye.get(i).GetMontant() + " €");
                JButton date = new JButton(paye.get(i).GetDate());
                JButton btnimg = new JButton();
                ReadImage im = new ReadImage();

                btn.setPreferredSize(boutonDim);
                date.setPreferredSize(boutonDim);
                prix.setPreferredSize(boutonDim);
                btnimg.setPreferredSize(boutonDim);

                btn.setPreferredSize(boutonDim);
                prix.setPreferredSize(boutonDim);
                date.setPreferredSize(boutonDim);
                btnimg.setPreferredSize(boutonDim);

                buttons[i] = btn;

                btn.setBackground(Color.ORANGE);
                date.setBackground(Color.WHITE);
                prix.setBackground(Color.WHITE);

                btnimg.setIcon(new javax.swing.ImageIcon(im.getImage(vol.GetForeignKeyCity())));
                btn.addActionListener(this);

                pan.add(btn);
                pan.add(btnimg);
                pan.add(date);
                pan.add(prix);

            } else if (i == paye.size()) {
                JOptionPane.showMessageDialog(null, "Aucun paiement n'existe pour l'utilisateur: " + c.GetNom());
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
    }

}
