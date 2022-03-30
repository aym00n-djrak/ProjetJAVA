/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import modelmvc.Fenetre;
import viewmvc.CreationPageClient;
import viewmvc.CreationPageEmploye;
import viewmvc.LoginEmploye;

/**
 *
 * @author remyj
 */
public class NewMember {

    CreationPageClient creationPageclient = new CreationPageClient();
    CreationPageEmploye creationPageemploye = new CreationPageEmploye();

    public void newmemberbuttonemploye(JButton b, JFrame f) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Fenetre().panneau("Création d'un nouveau membre");
                try {
                    creationPageemploye.Creation();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginEmploye.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void newmemberbuttonclient(JButton b, JFrame f) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Fenetre().panneau("Création d'un nouveau membre");
                try {
                    creationPageclient.Creation();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginEmploye.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
