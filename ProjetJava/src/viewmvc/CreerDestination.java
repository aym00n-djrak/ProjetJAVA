/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

import DAO.*;
import controlmvc.EmailVerif;
import controlmvc.Invite;
import controlmvc.NewMember;
import controlmvc.eventexit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author remyj
 */
public class CreerDestination implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JPasswordField p1;
    JButton b1, b2, b3, b4;

    EmailVerif verif = new EmailVerif();
    Invite invite = new Invite();
    NewMember newmember = new NewMember();

    modelmvc.Fenetre phrase = new modelmvc.Fenetre();
    CreationPage creationPage = new CreationPage();

    public void InterfaceCreeDestination() {

        f = new JFrame("Destination");

        f.getContentPane()
                .setLayout(null);
        f.getContentPane()
                .setBackground(Color.black);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Pays");

        l1.setForeground(Color.red);

        l1.setBounds(
                50, 50, 100, 30);

        l2 = new JLabel("Destination");

        l2.setForeground(Color.red);

        l2.setBounds(
                50, 90, 100, 30);

        l3 = new JLabel("Prix");

        l3.setForeground(Color.red);

        l3.setBounds(
                50, 140, 100, 30);

        t1 = new JTextField(20);

        t1.setForeground(Color.MAGENTA);

        t1.setBounds(
                200, 50, 100, 30);

        t2 = new JTextField(20);

        t2.setForeground(Color.MAGENTA);

        t2.setBounds(
                200, 90, 100, 30);

        t3 = new JTextField(20);

        t3.setForeground(Color.MAGENTA);

        t3.setBounds(
                200, 140, 100, 30);

        b1 = new JButton("Valider");

        b1.setForeground(Color.RED);

        b1.setBounds(
                300, 500, 100, 30);

        b2 = new JButton("Quitter");

        b2.setForeground(Color.RED);

        b2.setBounds(
                500, 500, 100, 30);

        f.getContentPane()
                .add(l1);
        f.getContentPane()
                .add(l2);
        f.getContentPane()
                .add(l3);
        f.getContentPane()
                .add(b1);
        f.getContentPane()
                .add(b2);
        f.getContentPane()
                .add(t1);
        f.getContentPane()
                .add(t2);
        f.getContentPane()
                .add(b1);
        f.getContentPane()
                .add(b2);
        f.getContentPane()
                .add(t3);
        f.getContentPane()
                .add(t2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setSize(900, 900);

        f.setResizable(
                false);
        f.setVisible(
                true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (b1.getText() == "Valider") {
            CityDAOImpl city = new CityDAOImpl();
            City c = new City();

            c.SetNom(t1.getText());
            c.SetPays(t2.getText());
            c.SetPrix(Integer.parseInt(t3.getText()));

            city.AddCity(c);
            JOptionPane.showMessageDialog(null, "Destination bien ajoutée !");
            f.setVisible(false);
        }

        if (b2.getText() == "Quitter") {
            System.out.println(b1);
            f.setVisible(false);
            ListVol listvol = new ListVol();
            listvol.affichagevol();

        }
    }
}
