/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author remyj
 */
public class ConfirmationReservation {

    public void paiementreserv(JButton b, JInternalFrame ouverture, JInternalFrame fermeture) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fermeture.setVisible(false);

                ouverture.setVisible(true);
            }
        });
    }

    public void confirmationreserv(JButton b) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(b,"Reservation effectuée, passer au paiement !");

            }

        });
    }
}
