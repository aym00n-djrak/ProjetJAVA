/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import modelmvc.DAO.Vol;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author remyj
 */
public class ConfirmationVol {

    
    //METHODE POUR CONFIRMER UN VOL ET OUVIR UNE FRAME
    public void volreserv(JDesktopPane desktop, JButton b, Vol vol, JInternalFrame ouverture, JLabel ecran) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Procédons au paiement !");
                ouverture.setVisible(true);
            }
        });
    }

    
    //AFFICHAGE DE LA CONFIRMATION DE VOL
    public void confirmationvol(JButton b) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(b, "Réservation du billet de vol effectuée, passons au paiement !");

            }

        });
    }
}
