package viewmvc;

import modelmvc.DAO.City;
import modelmvc.DAO.CityDAOImpl;
import modelmvc.DAO.Vol;
import modelmvc.DAO.VolDAOImpl;
import modelmvc.DAO.Clients;
import controlmvc.ReadImage;
import java.awt.Color;
import java.awt.Dimension;
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

//AFFICHAGE SEMBLABLE A LISTVOL IL AFFICHE LES DESTINATIONS PUIS UNE FOIS 
//LA DESTINATION SELECTIONNEE ON PASSERA AU VOL DISPO POUR CETTE DESTIANTION

public class ListVolclient extends JInternalFrame implements ActionListener {

    Dimension boutonDim = new Dimension(150, 75);
    ArrayList<City> city = new ArrayList<City>();
    CityDAOImpl citydao = new CityDAOImpl();
    JInternalFrame creavol = new JInternalFrame();

    Clients c = new Clients();

    JPanel pan = new JPanel();

    JScrollPane scrollPane = new JScrollPane(pan);
    public int id;

    JDesktopPane desktop1 = new JDesktopPane();

    public ListVolclient() throws SQLException {
        super("Mes destinations");

        // this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 2000);
        // init();

    }

    public void init(JDesktopPane desktop, Clients client) throws SQLException {

        c = client;

        desktop1 = desktop;
        city = citydao.GetAllCity();

        JButton[] buttons = new JButton[city.size()];
        System.out.println("Chargement....");

        System.out.println(city.size());

        for (int i = 0; i < city.size(); i++) {
            System.out.println(i);
            JButton btn = new JButton(city.get(i).GetNom());
            JButton btnimg = new JButton();
            JButton btnprix = new JButton("Prix : " + city.get(i).GetPrix() + " ???");
            ReadImage im = new ReadImage();

            btn.setPreferredSize(boutonDim);
            btnimg.setPreferredSize(boutonDim);
            btnprix.setPreferredSize(boutonDim);

            buttons[i] = btn;

            btn.setBackground(Color.ORANGE);
            btnprix.setBackground(Color.WHITE);

            buttons[i] = btn;
            //Image img= im.getImage(i);

            btnimg.setIcon(new javax.swing.ImageIcon(im.getImage(city.get(i).GetId())));
            btn.addActionListener(this);

            pan.add(btn);
            pan.add(btnimg);
            pan.add(btnprix);
        }
        System.out.println("Chargement termin??");

        //on va mettre 400 pour la hauteur du panel comme ca le hauteur
        //des boutons est grande que du panel
        pan.setPreferredSize(new Dimension(600, 2000));

        this.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        city = citydao.GetAllCity();
        VolDAOImpl vol = new VolDAOImpl();
        Vol volcity = new Vol();
        JButton btn = (JButton) e.getSource();

        for (int i = 0; i < city.size(); i++) {
            String test = city.get(i).GetNom();
            if (Objects.equals(test, btn.getText())) {
                id = i;
            } else {
                System.out.println("Nom diff??rent");
            }
        }
        System.out.println(id);
        JOptionPane.showMessageDialog(null, "Voyage vers : " + btn.getText() + " sauvegard?? dans le billet, dirig?? vous allez ??tre dirigez vers la liste des billets disponibles.");

        setVisible(false);
        try {
            ListVolDispo listedispo = new ListVolDispo();
            listedispo = new ListVolDispo();
            System.out.println("Le client est :" + c.GetPrenom());
            listedispo.init(desktop1, id, c);
        } catch (SQLException ex) {
            Logger.getLogger(ListVolclient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
