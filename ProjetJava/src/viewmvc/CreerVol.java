/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

import DAO.City;
import DAO.CityDAOImpl;
import DAO.Vol;
import DAO.VolDAOImpl;
import controlmvc.ConfirmationReservation;
import controlmvc.ConfirmationVol;
import controlmvc.EmailVerif;
import controlmvc.Invite;
import controlmvc.NewMember;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author remyj
 */
public class CreerVol extends JInternalFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JPasswordField p1;
    JButton b1, b2, b3, b4;

    EmailVerif verif = new EmailVerif();
    Invite invite = new Invite();
    NewMember newmember = new NewMember();

    modelmvc.Fenetre phrase = new modelmvc.Fenetre();
    CreationPageClient creationPage = new CreationPageClient();
    public Vol vol = new Vol();
    ConfirmationVol confvol = new ConfirmationVol();
     JLabel ecran = new JLabel();
/*
    public CreerVol() {
        super("Créer vol");
        CreerVol creer = new CreerVol();
        creer.InterfaceCreerVol(vol, desktop, panneau);
    }
*/
    public void InterfaceCreerVol(Vol v, JDesktopPane desktop, JPanel panneau) {

        vol = v;
        JInternalFrame creervol = new JInternalFrame("--- Creer Vol ---");

        System.out.println(vol.GetId());

        creervol.getContentPane()
                .setLayout(null);
        creervol.getContentPane()
                .setBackground(Color.black);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Compagnie");

        l1.setForeground(Color.red);

        l1.setBounds(
                50, 50, 100, 30);

        l2 = new JLabel("Date Arrivée");

        l2.setForeground(Color.red);

        l2.setBounds(
                50, 90, 100, 30);

        l3 = new JLabel("Date Départ");

        l3.setForeground(Color.red);

        l3.setBounds(
                50, 140, 100, 30);

        l4 = new JLabel("Heure Départ");

        l4.setForeground(Color.red);

        l4.setBounds(
                50, 190, 100, 30);

        l5 = new JLabel("Heure Arrivée");

        l5.setForeground(Color.red);

        l5.setBounds(
                50, 240, 100, 30);

        l6 = new JLabel("Numéro de vol");

        l6.setForeground(Color.red);

        l6.setBounds(
                50, 290, 100, 30);

        l7 = new JLabel("Type d'avion");

        l7.setForeground(Color.red);

        l7.setBounds(
                50, 290, 100, 30);

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

        t4 = new JTextField(20);

        t4.setForeground(Color.MAGENTA);

        t4.setBounds(
                200, 190, 100, 30);

        t5 = new JTextField(20);

        t5.setForeground(Color.MAGENTA);

        t5.setBounds(
                200, 240, 100, 30);

        t6 = new JTextField(20);

        t6.setForeground(Color.MAGENTA);

        t6.setBounds(
                200, 290, 100, 30);

        t7 = new JTextField(20);

        t7.setForeground(Color.MAGENTA);

        t7.setBounds(
                200, 340, 100, 30);

        b1 = new JButton("Créer Billet de Vol");

        b1.setForeground(Color.RED);

        b1.setBounds(
                300, 500, 300, 30);

        creervol.getContentPane()
                .add(l1);
        creervol.getContentPane()
                .add(l2);
        creervol.getContentPane()
                .add(l3);
        creervol.getContentPane()
                .add(l4);
        creervol.getContentPane()
                .add(l5);
        creervol.getContentPane()
                .add(l6);
        creervol.getContentPane()
                .add(b1);
        creervol.getContentPane()
                .add(t1);
        creervol.getContentPane()
                .add(t2);
        creervol.getContentPane()
                .add(t3);
        creervol.getContentPane()
                .add(t4);
        creervol.getContentPane()
                .add(t5);
        creervol.getContentPane()
                .add(t6);
        creervol.getContentPane()
                .add(t7);

        creervol.getContentPane()
                .add(b1);

        creervol.getContentPane()
                .add(t3);
        creervol.getContentPane()
                .add(t2);

        b1.addActionListener(this);

        creervol.setSize(900, 900);

        creervol.setResizable(
                false);
        creervol.setVisible(
                true);

        //Ajout au bureau 
        desktop.add(creervol).setVisible(true);
        
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VolDAOImpl voldao = new VolDAOImpl();

        vol.SetCompagnie(t1.getText());
        vol.SetDateArrivee(t2.getText());
        vol.SetDateDepart(t2.getText());

        vol.SetHeureDepart(t4.getText());
        vol.SetHeureArrivee(t5.getText());
        vol.SetNumeroVol(Integer.parseInt(t6.getText()));
        vol.SetTypeAvion(t7.getText());

        voldao.AddVol(vol);
        JOptionPane.showMessageDialog(null, "Vol bien ajoutée !");
        setVisible(false);
        JOptionPane.showMessageDialog(null, "Procédons au paiement !");
    }
}
