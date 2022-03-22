/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

/**
 *
 * @author Clarence
 */
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

public class Reservation extends JFrame /*implements ActionListener*/ {

    private int idReservation;
    ImageIcon fond;
    JLabel ecran = new JLabel();

    paiement paye = new paiement();

    //Construction de l'interface
    public void Reservation() {

        JFrame frame = new JFrame("-----Air Java----");
        JPanel panneau = new JPanel();

        /*   JButton ok = new JButton ("Valider");
         ok.setBounds(180,720, 140,60);
         ok.addActionListener( this::menuListener);//ok*/
        //Appel de la methode MenuBar
        frame.setJMenuBar(MenuBar());

        //Construction de la fenetre mes reservations   
        JDesktopPane desktop = new JDesktopPane(); //Contient la JInternalFrame
        JInternalFrame reservation = new JInternalFrame("--- Mes réservations ---");
        JPanel pachat = new JPanel(); //panneau achat
        JPanel pconf = new JPanel(); //panneau confirmation
        JPanel phistori = new JPanel(); //panneau historique de reservations

        //Creation des onglets
        JTabbedPane onglets = new JTabbedPane();
        onglets.setBounds(40, 20, 800, 800);
        onglets.add("Acheter vos billets", pachat);
        onglets.add("Confirmation d'achats", pconf);
        onglets.add("Historique de réservations", phistori);

        JComboBox<String> jcombo1 = new JComboBox<String>();
        Connection bddconnect = null;
        Statement bddstatement = null;

        //JComboBox 1 à remplir à l'aide de la base de données
        JLabel reserv = new JLabel("Réserver un vol vers :");
        String pays[] = {"Paris", "Moscou", "Londres", "Berlin", "Corée", "Tokyo", "Sydney", "Floride", "Brésil", "Strasbourg", "Bordeaux"};
        JComboBox destination = new JComboBox(pays);
        destination.setBounds(150, 110, 100, 20);

        reserv.setBounds(150, 120, 100, 20);
        jcombo1.setBounds(150, 110, 100, 20);

        //JComboBox 2 choix nb Passagers
        JLabel passager = new JLabel("Passager(s)");
        String numpassager[] = {"0", "1", "2", "3", "4", "5"};
        JComboBox voyageur = new JComboBox(numpassager);
        passager.setBounds(370, 360, 100, 20);
        voyageur.setBounds(380, 370, 50, 20);//ok*/

        //JComboBox calendrier
        /*   JComboBox calendrier = new JComboBox();*/
        //Confirmation de la reservation 
        JButton validate = new JButton("Confirmer votre réservation");
        ConfirmationReservation confres = new ConfirmationReservation();
        JButton suite = new JButton("Accéder à la plateforme de paiement");
        validate.setBounds(40, 30, 200, 60);
        suite.setBounds(780, 820, 140, 60);

        //Ajouts à pachat
        pachat.add(reserv);
        pachat.add(passager);
        pachat.add(destination);
        pachat.add(jcombo1);
        pachat.add(voyageur);

        //Ajouts à pconf
        pconf.add(validate);
        pconf.add(suite);

        //Ajouts à la frame reservation
        reservation.add(onglets);

        //Set Proportions
        reservation.setClosable(true);
        reservation.setMaximizable(true);
        reservation.setIconifiable(true);
        reservation.setResizable(true);
        reservation.setSize(800, 800);
        reservation.setLayout(null);
        reservation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        reservation.setVisible(true);
        desktop.setSize(1400, 1400);

        //fin internal frame reservations
        /*
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
         */
        
        paye.interfacepaiement(reservation, fond, ecran, desktop, frame, panneau, validate, suite);
        
        frame.getContentPane().add(ecran);
        frame.setSize(1600, 1600);
        frame.setBackground(new Color(119, 135, 136));
        panneau.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //Affichage de la frame au milieu de l'écran  
        frame.setVisible(true);

    }

    //Methode de la barre de menu interface clients
    private JMenuBar MenuBar() {
        //Elements utiles
        JMenuBar eiffelcafe = new JMenuBar();

        JMenu users = new JMenu("Authentification");

        JMenu langues = new JMenu("Langues");

        JMenu notif = new JMenu("Notifications");

        JMenu enregistrement = new JMenu("Enregistrement");

        JMenu info = new JMenu("Informations");

        JMenu aide = new JMenu("Aide");

        //Ajouts des items dans authentification
//Membres
        JMenuItem membres = new JMenuItem("Espace Membres");
        membres.setIcon(new ImageIcon("membres.png"));
        membres.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_DOWN_MASK));//commande Ctrl+T
        membres.addActionListener(this::menuListener);
        //Sep
        users.addSeparator();
//Employes        
        JMenuItem employes = new JMenuItem("Espace Employés");
        employes.setIcon(new ImageIcon("membres.png"));
        employes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK));//Commande Ctrl+R
        employes.addActionListener(this::menuListener);

        //Ajouts de membres et employes à la barre de menu 
        users.add(membres);
        users.add(employes);

        //Ajouts des items dans acheter un billet 
        JMenuItem francais = new JMenuItem("Français - Fr");
        francais.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
        francais.addActionListener(this::menuListener);
        JMenuItem espagnol = new JMenuItem("Español - Es ");
        espagnol.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
        espagnol.addActionListener(this::menuListener);
        JMenuItem allemand = new JMenuItem(" German - Ger");
        allemand.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
        allemand.addActionListener(this::menuListener);
        JMenuItem chinois = new JMenuItem(" Chinese - Chin");
        chinois.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        chinois.addActionListener(this::menuListener);

        //Ajouts des langues
        langues.add(francais);
        langues.add(chinois);
        langues.add(espagnol);
        langues.add(allemand);

        //Ajouts des items dans enregistrement
//Page pour visualiser son enregistrement 
        //Ajouts des items dans Mes réservations 
//Page pour consulter son historique de réservation
        //Ajouts des items dans Notifications    
        //Ajouts des items dans informations 
//Page informations diverses
        JMenuItem about = new JMenuItem("A propos");
        about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));
        aide.add(about);

        eiffelcafe.add(users);
        eiffelcafe.add(notif);
        eiffelcafe.add(enregistrement);
        eiffelcafe.add(info);
        eiffelcafe.add(langues);
        eiffelcafe.add(aide);

        return eiffelcafe;

    }

    public void menuListener(ActionEvent event) {
        JOptionPane.showMessageDialog(this, "ça fonctionne !");
    }

    //Methodes de modification(set) et de renvoi(get) d'idReservation
    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

}
