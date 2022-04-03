package viewmvc;

import modelmvc.DAO.Clients;
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
public class LoginClient {

    JFrame f;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2, b3, b4;

    EmailVerif verif = new EmailVerif();
    Invite invite = new Invite();
    NewMember newmember = new NewMember();

    modelmvc.Fenetre phrase = new modelmvc.Fenetre();
    CreationPageClient creationPage = new CreationPageClient();
    
    //METHODE QUI CREE LAFFICHAGE DE CONNECTION POUR UN CLIENT

    public void Login(Clients c, JLabel j) {

        f = new JFrame("Login");
        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.black);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Email");
        l1.setForeground(Color.red);
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("MDP");
        l2.setForeground(Color.red);
        l2.setBounds(50, 80, 100, 30);

        t1 = new JTextField(20);
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
        b3.setBounds(50, 170, 80, 40);

        b4 = new JButton("Créer membre");
        b4.setForeground(Color.RED);
        b4.setBounds(150, 170, 200, 40);

        f.getContentPane().add(l1);
        f.getContentPane().add(l2);
        f.getContentPane().add(b1);
        f.getContentPane().add(t1);
        f.getContentPane().add(p1);
        f.getContentPane().add(b1);
        f.getContentPane().add(b2);
        f.getContentPane().add(b3);
        f.getContentPane().add(b4);

        c = verif.verifboutonmailclient(b1, t1, p1, f, j);

        b2.addActionListener(new Eventlist());

        c = invite.invitebuttonclient(b3, t1, p1, f);

        newmember.newmemberbuttonclient(b4, f);

        f.setBounds(300, 300, 400, 300);

        f.setResizable(false);
        f.setVisible(true);
    }
}
