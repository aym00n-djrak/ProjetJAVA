/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

import DAO.Clients;
import controlmvc.*;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author remyj
 */
public class CreationPageClient {

    public JFrame f;
    JLabel l0, l1, l2;
    public JTextField t0,t1;
    public JPasswordField p1;
    JButton b1, b2, b3, b4;
    Clients c = new Clients();

    modelmvc.Fenetre phrase = new modelmvc.Fenetre();
    controlmvc.Identifiants enregistrement = new controlmvc.Identifiants();
    controlmvc.EmailVerif verif = new controlmvc.EmailVerif();

    public void Creation() throws SQLException {

        f = new JFrame("Création membre");
        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.black);

        l0 = new JLabel("IdMail");
        l0.setForeground(Color.red);
        l0.setBounds(50, 50, 100, 30);

        l1 = new JLabel("Email");
        l1.setForeground(Color.red);
        l1.setBounds(50, 80, 100, 30);

        l2 = new JLabel("MDP");
        l2.setForeground(Color.red);
        l2.setBounds(50, 110, 100, 30);

        this.t0 = new JTextField(20);
        // t1.addActionListener(this);
        this.t0.setForeground(Color.MAGENTA);
        this.t0.setBounds(200, 50, 100, 30);

        this.t1 = new JTextField(20);
        // t1.addActionListener(this);
        this.t1.setForeground(Color.MAGENTA);
        this.t1.setBounds(200, 80, 100, 30);

        this.p1 = new JPasswordField(20);
        this.p1.setForeground(Color.MAGENTA);
        this.p1.setBounds(200, 110, 100, 30);

        b1 = new JButton("Créer");
        b1.setForeground(Color.RED);
        b1.setBounds(50, 150, 100, 30);

        b2 = new JButton("Exit");
        b2.setForeground(Color.RED);
        b2.setBounds(200, 150, 100, 30);

        f.getContentPane().add(l0);
        f.getContentPane().add(l1);
        f.getContentPane().add(l2);
        f.getContentPane().add(t0);
        f.getContentPane().add(b1);
        f.getContentPane().add(t1);
        f.getContentPane().add(p1);
        f.getContentPane().add(b1);
        f.getContentPane().add(b2);

        //f.getContentPane().add(show.Show());
        f.setBounds(300, 300, 400, 300);
        f.setResizable(false);
        f.setVisible(true);

        c = verif.verifcreaboutonmailusers(b1,t0, t1, p1, f);
        b2.addActionListener(new Eventlist());

    }
}
