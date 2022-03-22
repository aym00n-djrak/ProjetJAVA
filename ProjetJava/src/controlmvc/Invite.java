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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelmvc.Fenetre;
import viewmvc.Login;
import viewmvc.Menu;

/**
 *
 * @author remyj
 */
public class Invite {
    
    public void invitebutton(JButton b, JTextField t1, JPasswordField p1, JFrame f)
    {
         b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Fenetre().panneau("Mode invité");
                viewmvc.Menu menu = new Menu();
                try {
                    menu.Menu();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }
    
}
