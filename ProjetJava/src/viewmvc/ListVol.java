package viewmvc;

import DAO.*;
import controlmvc.ShowMyImage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListVol extends JInternalFrame implements ActionListener {

    Dimension boutonDim = new Dimension(150, 75);

    JPanel pan = new JPanel();

    JScrollPane scrollPane = new JScrollPane(pan);

    public ListVol() throws SQLException {
        super("Mes destinations");

        // this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 2000);
        init();

    }

    public void init() throws SQLException {
        CityDAOImpl citydao = new CityDAOImpl();
        ArrayList<City> city = new ArrayList<City>();
        city = citydao.GetAllCity();

        JButton[] buttons = new JButton[city.size()];

        for (int i = 0; i < city.size(); i++) {
            JButton btn = new JButton(city.get(i).GetNom());
            JButton btnimg = new JButton();
            JButton btnprix = new JButton("Prix : " + city.get(i).GetPrix() + " €");
            ShowMyImage im = new ShowMyImage();

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
        InterfaceDestination intdest = new InterfaceDestination();
        JButton btn = (JButton) e.getSource();
        intdest.AffichageDestination("Voyage vers : " + btn.getText());
    }

}
