/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

import DAO.*;
import controlmvc.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author remyj
 */
public class ListVol implements ActionListener {

    public void affichagevol() {
        int x = 0, y = 0;
        JFrame f = new JFrame("Destinations");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        java.net.URL url = this.getClass().getResource("avion.png");
        CityDAOImpl citydao = new CityDAOImpl();
        ArrayList<City> city = new ArrayList<City>();
        city = citydao.GetAllCity();

        JButton[] buttons = new JButton[city.size()];
        JLabel jLabel1 = new JLabel();

        jLabel1.setText("Destinations :");
        JPanel panel = new JPanel();
        JPanel panelimg = new JPanel();

        panel.setSize(900, 900);
        panel.setLayout(new GridLayout(5, 0));

        Image icon = Toolkit.getDefaultToolkit().getImage(url);

        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(900, 900);

        f.setTitle("Destinations");

        f.getContentPane().add(jLabel1);

        for (int i = 0; i < city.size(); i++) {

            JButton btn = new JButton("Destination: " + city.get(i).GetNom());
            JButton btnprix = new JButton("Prix : " + city.get(i).GetPrix() + " €");

            btn.setBackground(Color.ORANGE);
            btnprix.setBackground(Color.WHITE);

            buttons[i] = btn;

            btn.addActionListener(this);

            panel.add(btn);
            panel.add(btnprix);
        }
        f.getContentPane().add(panel);

        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        InterfaceDestination intdest = new InterfaceDestination();
        JButton btn = (JButton) e.getSource();
        intdest.AffichageDestination("Voyage vers : " + btn.getText());

    }
}
