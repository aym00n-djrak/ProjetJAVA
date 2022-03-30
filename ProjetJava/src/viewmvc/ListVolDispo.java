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

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListVolDispo extends JInternalFrame implements ActionListener {

    Dimension boutonDim = new Dimension(150, 75);
    ArrayList<City> city = new ArrayList<City>();
    CityDAOImpl citydao = new CityDAOImpl();
    JInternalFrame creavol = new JInternalFrame();

    JPanel pan = new JPanel();

    JScrollPane scrollPane = new JScrollPane(pan);
    public int id;

    JDesktopPane desktop1 = new JDesktopPane();

    public ListVolDispo() throws SQLException {
        super("Mes destinations");

        // this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 2000);
        // init();

    }

    public void init(JDesktopPane desktop, int id) throws SQLException {

        desktop1 = desktop;
        city = citydao.GetAllCity();

        ArrayList<Vol> vol = new ArrayList<>();
        VolDAOImpl voldao = new VolDAOImpl();

        vol = voldao.GetAllVol();

        JButton[] buttons = new JButton[city.size()];
        
        System.out.println("La ville choisie est :"+ city.get(id).GetNom());

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

                } else {
                    JOptionPane.showMessageDialog(null, "Aucun vol n'existe pour la destination: "+city.get(id).GetNom());
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

        city = citydao.GetAllCity();
        CreerVol creavol = new CreerVol();
        VolDAOImpl vol = new VolDAOImpl();
        Vol volcity = new Vol();
        InfoVille info = new InfoVille();
        JButton btn = (JButton) e.getSource();

        for (int i = 0; i < city.size(); i++) {
            String test = city.get(i).GetNom();
            if (Objects.equals(test, btn.getText())) {
                id = i;
            } else {
                System.out.println("Nom différent");
            }
        }
        System.out.println(id);
        volcity.SetId(id);
        JOptionPane.showMessageDialog(null, "Voyage vers : " + btn.getText() + " sauvegardé dans le billet, dirigé vous allez être dirigez vers l'interface de paiement.");
        setVisible(false);
    }

}
