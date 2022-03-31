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
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListVolReserve extends JInternalFrame implements ActionListener {

    Dimension boutonDim = new Dimension(150, 75);
    ArrayList<City> city = new ArrayList<City>();
    CityDAOImpl citydao = new CityDAOImpl();
    JInternalFrame creavol = new JInternalFrame();

    Clients c = new Clients();

    JPanel pan = new JPanel();

    JScrollPane scrollPane = new JScrollPane(pan);
    public int id;

    JDesktopPane desktop1 = new JDesktopPane();

    public ListVolReserve() throws SQLException {
        super("Mes destinations");

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
            
            //ON CHERCHE LES PAIEMENTS CORRESPONDANT AU CLIENT
            if (c.GetId()== paye.get(i).GetForeignKeyClient()) {

                //ON PREND LE NUMERO DE RESERVATION DE PAIEMENT CORRESPONDANT A LA RESERVATION
                reserv = rdao.GetReservation(paye.get(i).GetForeignKeyReservation());

                System.out.println("Id reservation paiement: " + paye.get(i).GetForeignKeyReservation());
                System.out.println("Id reservation vol: " + reserv.GetForeignKeyVol());
                
                
                //ON ATTRIBUE A VOL LE NUMERO DE RESERVATION DU VOL LUI CORRESPONDANT
                vol = voldao.GetVol(reserv.GetForeignKeyVol());

                System.out.println("Id vol city: " + vol.GetForeignKeyCity());

                //ON CREE LES BOUTONS PERMETTANT LAFFICHAGE DES DONNEES VOULUES
                JButton btn = new JButton(vol.GetDestination());
                JButton prix = new JButton("" + paye.get(i).GetMontant());
                JButton date = new JButton(paye.get(i).GetDate());
                JButton btnimg = new JButton();
                ReadImage im = new ReadImage();

                btn.setPreferredSize(boutonDim);
                date.setPreferredSize(boutonDim);
                prix.setPreferredSize(boutonDim);
                btnimg.setPreferredSize(boutonDim);

                buttons[i] = btn;

                btn.setBackground(Color.ORANGE);
                prix.setBackground(Color.WHITE);

                btnimg.setIcon(new javax.swing.ImageIcon(im.getImage(vol.GetForeignKeyCity())));
                btn.addActionListener(this);

                pan.add(btn);
                pan.add(btnimg);
                pan.add(date);
                pan.add(prix);

            } else {
                System.out.println("Chargement terminé pas de paiement trouvé");
            }
            
            System.out.println("Chargement terminé");
            pan.setPreferredSize(new Dimension(600, 2000));
            this.add(scrollPane);
            desktop1.add(this).setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
