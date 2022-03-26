/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package essai;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author Clarence
 */
import javax.swing.*;

public class From {
      JFrame from = new JFrame();
      From(){
       from.setJMenuBar(MenuBar());
      
}



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
