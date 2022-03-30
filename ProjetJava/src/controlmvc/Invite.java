/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import DAO.Clients;
import DAO.Employe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelmvc.Fenetre;
import viewmvc.Interfclients;
import viewmvc.Interfclients;
import viewmvc.Interfemployes;
import viewmvc.Menu;
import viewmvc.Réservation;

/**
 *
 * @author remyj
 */

public class Invite {
    Clients client= new Clients();
    Employe employe= new Employe();
    
    public void invitebuttonclient(JButton b, JTextField t1, JPasswordField p1, JFrame f, Clients c)
    {
         b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                client=c;
                f.setVisible(false);
                new Fenetre().panneau("Mode invité");

                Interfclients interfclients= new Interfclients();
                interfclients.run(c);
            }

        });
    }
        public void invitebuttonemploye(JButton b, JTextField t1, JPasswordField p1, JFrame f,Employe e)
    {
         b.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent evt) {
                f.setVisible(false);
                new Fenetre().panneau("Mode invité");

                Interfemployes interfemploye= new Interfemployes();
                interfemploye.run();
            }

        });
    }
    
    
}
