package viewmvc;

import modelmvc.CreaVol;
import DAO.*;
import controlmvc.ReadImage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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

public class ListVol extends JInternalFrame implements ActionListener {

    Dimension boutonDim = new Dimension(150, 75);
    ArrayList<City> city = new ArrayList<City>();
    CityDAOImpl citydao = new CityDAOImpl();
    JInternalFrame creavol = new JInternalFrame();
    
    Employe employe= new Employe();

    JPanel pan = new JPanel();

    JScrollPane scrollPane = new JScrollPane(pan);
    public int id;

    JDesktopPane desktop1 = new JDesktopPane();

    public ListVol() throws SQLException {
        super("Mes destinations");

        // this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 1000);
        // init();

    }

    public void init(JDesktopPane desktop, Employe e) throws SQLException {

        employe= e;
        
        desktop1 = desktop;
        city = citydao.GetAllCity();

        JButton[] buttons = new JButton[city.size()];
        //pan.setLayout(new GridLayout(0, 1, 0, 3));
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

            btnimg.setIcon(new javax.swing.ImageIcon(im.getImage(city.get(i).GetId())));
            btn.addActionListener(this);

            pan.add(btn);
            pan.add(btnimg);
            pan.add(btnprix);

        }
        pan.setPreferredSize(new Dimension(600, 1000));
        this.add(scrollPane);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        city = citydao.GetAllCity();
        //CreerVol creavol = new CreerVol();
        CreaVol creavol= new CreaVol();
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
        volcity.SetCompagnie("Air" + city.get(id).GetNom());

        JOptionPane.showMessageDialog(null, "La destination : " + btn.getText() + " a bien été créée dirigez vous vers l'interface de création de vol !");
        setVisible(false);
        
    }
}
