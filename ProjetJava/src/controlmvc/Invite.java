/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import modelmvc.DAO.Clients;
import modelmvc.DAO.Employe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelmvc.Fenetre;
import viewmvc.Interfclients;
import viewmvc.Interfclients;
import viewmvc.Interfemployes;
import viewmvc.Réservation;

/**
 *
 * @author remyj
 */
public class Invite {

    Clients client = new Clients();
    Employe employe = new Employe();

    
    //METHODE POUR DONNER LES INFORMATIONS DU MODE INVITE CLIENT
    public Clients invitebuttonclient(JButton b, JTextField t1, JPasswordField p1, JFrame f) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Fenetre().panneau("Mode invité");

                client.SetNom("Invite");
                client.SetPrenom("Invite");
            }

        });
        f.setVisible(false);
        return client;
    }

    
    //METHODE POUR DONNER LES INFORMATIONS DU MODE INVITE EMPLOYE
    public Employe invitebuttonemploye(JButton b, JTextField t1, JPasswordField p1, JFrame f) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                f.setVisible(false);
                new Fenetre().panneau("Mode invité");
                employe.SetNom("Invite");
                employe.SetPrenom("Invite");
            }

        });
        f.setVisible(false);
        return employe;
    }

}
