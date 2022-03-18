package viewmvc;

import controlmvc.*;
import modelmvc.Fenetre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author remyj
 */
public class Login implements ActionListener {

    JFrame f;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2, b3, b4;

    EmailVerif verif = new EmailVerif();

    modelmvc.Fenetre phrase = new modelmvc.Fenetre();
    CreationPage creationPage = new CreationPage();

    Login() {

        f = new JFrame("Login");
        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.black);

        l1 = new JLabel("Email");
        l1.setForeground(Color.red);
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("MDP");
        l2.setForeground(Color.red);
        l2.setBounds(50, 80, 100, 30);

        t1 = new JTextField(20);
        // t1.addActionListener(this);
        t1.setForeground(Color.MAGENTA);
        t1.setBounds(200, 50, 100, 30);

        p1 = new JPasswordField(20);
        p1.setForeground(Color.MAGENTA);
        p1.setBounds(200, 80, 100, 30);

        b1 = new JButton("Login");
        b1.setForeground(Color.RED);
        b1.setBounds(50, 120, 100, 30);

        b2 = new JButton("Exit");
        b2.setForeground(Color.RED);
        b2.setBounds(200, 120, 100, 30);

        b3 = new JButton("Invité");
        b3.setForeground(Color.RED);
        b3.setBounds(150, 150, 80, 40);

        b4 = new JButton("Créer membre");
        b4.setForeground(Color.RED);
        b4.setBounds(150, 200, 50, 15);

        f.getContentPane().add(l1);
        f.getContentPane().add(l2);
        f.getContentPane().add(b1);
        f.getContentPane().add(t1);
        f.getContentPane().add(p1);
        f.getContentPane().add(b1);
        f.getContentPane().add(b2);
        f.getContentPane().add(b3);
        f.getContentPane().add(b4);

        controlmvc.Identifiants check = new controlmvc.Identifiants();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
                if (verif.emailverif(t1.getText()) == false || t1.getText().isEmpty() || p1.getText().isEmpty()) {
                    if (t1.getText().isEmpty()) {
                        new Fenetre().panneau("Le champ email est vide");
                    } else if (p1.getText().isEmpty()) {
                        new Fenetre().panneau("Le champ password est vide");
                    } else if (verif.emailverif(t1.getText()) == false) {
                        new Fenetre().panneau("L'email ne correspond pas à un mail");
                    }
                } else {
                    if (check.Id(t1.getText(), p1.getText()) == true) {

                        f.setVisible(false);
                        try {
                            new Menu();
                        } catch (SQLException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
        );

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                System.exit(0);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Fenetre().panneau("Mode invité");
                try {
                    viewmvc.Menu menu = new Menu();

                } catch (SQLException ex) {
                    Logger.getLogger(Login.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Fenetre().panneau("Création d'un nouveau membre");
                try {
                    creationPage.Creation();

                } catch (SQLException ex) {
                    Logger.getLogger(Login.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        f.setBounds(300, 300, 400, 300);

        f.setResizable(false);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
