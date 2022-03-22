/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;


import javax.swing.*;
import controlmvc.ConfirmationReservation;

/**
 *
 * @author remyj
 */
public class Paiement {
    
    ConfirmationReservation confres= new ConfirmationReservation();
    
    public void InterfacePaiement(JInternalFrame reservation, ImageIcon fond, JLabel ecran, JDesktopPane desktop,JPanel panneau, JButton validate, JButton suite)
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

     
}
}