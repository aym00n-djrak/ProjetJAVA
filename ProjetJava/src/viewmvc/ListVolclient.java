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

public class ListVolclient extends JInternalFrame implements ActionListener {

    Dimension boutonDim = new Dimension(150, 75);
    ArrayList<City> city = new ArrayList<City>();
    CityDAOImpl citydao = new CityDAOImpl();
    JInternalFrame creavol = new JInternalFrame();

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

    public void init(JDesktopPane desktop) throws SQLException {

        desktop1 = desktop;
        city = citydao.GetAllCity();

        JButton[] buttons = new JButton[city.size()];

        for (int i = 0; i < city.size(); i++) {
            JButton btn = new JButton(city.get(i).GetNom());
            JButton btnimg = new JButton();
            JButton btnprix = new JButton("Prix : " + city.get(i).GetPrix() + " €");
            ReadImage im = new ReadImage();

            btn.setPreferredSize(boutonDim);
            btnimg.setPreferredSize(boutonDim);
            btnprix.setPreferredSize(boutonDim);

            buttons[i] = btn;

            btn.setBackground(Color.ORANGE);
            btnprix.setBackground(Color.WHITE);

            buttons[i] = btn;
            //Image img= im.getImage(i);

            btnimg.setIcon(new javax.swing.ImageIcon(im.getImage(i)));
            btn.addActionListener(this);

            pan.add(btn);
            pan.add(btnimg);
            pan.add(btnprix);

        }

        //on va mettre 400 pour la hauteur du panel comme ca le hauteur
        //des boutons est grande que du panel
        pan.setPreferredSize(new Dimension(600, 2000));

        this.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
