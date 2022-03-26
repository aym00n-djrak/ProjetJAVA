/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

/**
 *
 * @author Clarence
 */
import javax.swing.*;

import java.awt.event.*;
import java.awt.Color;

//import controlmvc.DataCity;
import java.util.ArrayList;
//import modelmvc.ConvertAlistToList;

public class Reservation extends JFrame  {

   // ConvertAlistToList conv = new ConvertAlistToList();
    //DataCity city = new DataCity();

    private int idReservation;
    JLabel ecran = new JLabel();

   // Paiement paye = new Paiement();

    //Construction de l'interface
    public void Reservation() {

        ArrayList<String> name = new ArrayList<String>();

        JFrame frame = new JFrame("-----Air Java----");
        JPanel panneau = new JPanel();
        
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

        //JComboBox 1 à remplir à l'aide de la base de données
        JLabel reserv = new JLabel("Réserver un vol vers :");
        
     //   city.PickData(name);

        String[] pays = new String[name.size()];

    //    pays = conv.convert(name);
        JComboBox destination = new JComboBox(pays);
        destination.setBounds(150, 110, 100, 20);

        reserv.setBounds(150, 120, 100, 20);

        //JComboBox 2 choix nb Passagers
        JLabel passager = new JLabel("Passager(s)");
        String numpassager[] = {"0", "1", "2", "3", "4", "5"};
        JComboBox voyageur = new JComboBox(numpassager);
        passager.setBounds(370, 360, 100, 20);
        voyageur.setBounds(380, 370, 50, 20);

        //JComboBox calendrier
        //   JComboBox calendrier = new JComboBox();
        
        //Confirmation de la reservation 
        JButton validate = new JButton("Confirmer votre réservation");
        JButton suite = new JButton("Accéder à la plateforme de paiement");
        
        validate.setBounds(40, 30, 200, 60);
        suite.setBounds(780, 820, 140, 60);

        //Ajouts à pachat
        pachat.add(reserv);
        pachat.add(passager);
        pachat.add(destination);
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
     //   paye.InterfacePaiement(reservation, ecran, desktop, panneau, validate, suite);
        
        //AJOUTS BACKGROUND
        
        java.net.URL url = this.getClass().getResource("earth.png");
        ImageIcon img = new ImageIcon(url);
        JLabel img1 = new JLabel(img);

        //System.out.println();
        img1.setBounds(0, 0, 1300, 1000);

        //Ajouts à la frame  
        frame.add(panneau);
        frame.add(desktop);
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

        JMenu info = new JMenu("Informations");

        JMenu aide = new JMenu("Aide");

        //Ajouts des items dans authentification
//Membres
        JMenuItem membres = new JMenuItem("Espace Membres");
        membres.setIcon(new ImageIcon("membres.png"));
        membres.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_DOWN_MASK));//commande Ctrl+T
      
        //Sep
        users.addSeparator();
//Employes        
        JMenuItem employes = new JMenuItem("Espace Employés");
        employes.setIcon(new ImageIcon("membres.png"));
        employes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK));//Commande Ctrl+R
      
        //Ajouts de membres et employes à la barre de menu 
        users.add(membres);
        users.add(employes);

        //Ajouts des items dans langues
        JMenuItem francais = new JMenuItem("Français - Fr");
        francais.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
     
        JMenuItem espagnol = new JMenuItem("Español - Es ");
        espagnol.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
     
        JMenuItem allemand = new JMenuItem(" German - Ger");
        allemand.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
     
        JMenuItem chinois = new JMenuItem(" Chinese - Chin");
        chinois.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
     

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
        eiffelcafe.add(info);
        eiffelcafe.add(langues);
        eiffelcafe.add(aide);

        return eiffelcafe;

    }


    
} 
   




