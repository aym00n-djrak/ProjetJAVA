/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import java.awt.event.*;
import java.awt.Color;

import java.util.logging.Level;
import java.util.logging.Logger;
import controlmvc.ConfirmationReservation;

/**
 *
 * @author remyj
 */
public class paiement {
    
    ConfirmationReservation confres= new ConfirmationReservation();
    
    public void interfacepaiement(JInternalFrame reservation, ImageIcon fond, JLabel ecran, JDesktopPane desktop, JFrame frame,JPanel panneau, JButton validate, JButton suite)
    {
    //Construction de la fenetre paiement
        JInternalFrame paiement = new JInternalFrame("--- Paiement ---");
        JPanel panel = new JPanel();
        //panel.setLayout(new GridLayout(4,1));
        JLabel titre = new JLabel("Paiement en ligne ");
        fond = new ImageIcon("\"C:\\Users\\Clarence\\Documents\\NetBeansProjects\\Reservation\\src\\reservation\\cartes.png\"");
        ecran.setIcon(fond);
        JLabel payer = new JLabel();
        payer.setBounds(440, 200, 100, 20);

        //Ajouts au panel de paiement
        panel.add(ecran);
        panel.add(titre);
        panel.add(payer);

        //Set Proportions
        paiement.add(panel);
        paiement.setClosable(true);
        paiement.setMaximizable(true);
        paiement.setIconifiable(true);
        paiement.setResizable(true);
        paiement.setSize(500, 500);
        paiement.setLayout(null);
        //getContentPane().add(panel);
        paiement.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        paiement.setVisible(true);

        //Ajout au bureau 
        desktop.add(reservation).setVisible(true);
        desktop.add(paiement).setVisible(false);

        //CONFIRMATION DE LA RESERVATION        
        confres.confirmationreserv(validate);

        // FERMETURE DES RESERVATIONS ET OUVERTURE DU PAIEMENT
        confres.paiementreserv(suite, paiement, reservation);

        desktop.getAllFramesInLayer(1000);

        // panneau.add(desktop);
        //Ajouts à la frame  
        frame.add(panneau);
        frame.add(desktop);
    
}
}