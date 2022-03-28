/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import DAO.Vol;
import DAO.VolDAOImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import viewmvc.Paiement;

/**
 *
 * @author remyj
 */
public class ConfirmationVol {

    public void volreserv( JDesktopPane desktop, JButton b, Vol vol, JInternalFrame ouverture,JLabel ecran) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paiement paye = new Paiement();
                JOptionPane.showMessageDialog(null, "Procédons au paiement !");
                paye.InterfacePaiement(ecran, desktop);
                ouverture.setVisible(true);
            }
        });
    }

    public void confirmationvol(JButton b) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(b, "Réservation du billet de vol effectuée, passons au paiement !");

            }

        });
    }
}


