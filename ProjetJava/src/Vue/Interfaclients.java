/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Clarence
 */

public class Interfaclients extends JFrame {
    private JButton ajoutreserv;
    private JDesktopPane desktopclients;
    private JButton newvol;
    private JInternalFrame Ajoutvol= new JInternalFrame();
    Interfaclients(){

}
    private void arrangement() {

        desktopclients = new JDesktopPane();
        ajoutreserv = new JButton();
        newvol = new JButton();
        

        javax.swing.GroupLayout desktopclientsLayout = new javax.swing.GroupLayout(desktopclients);
        desktopclients.setLayout(desktopclientsLayout);
        desktopclientsLayout.setHorizontalGroup(
            desktopclientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        desktopclientsLayout.setVerticalGroup(
            desktopclientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        ajoutreserv.setBackground(new java.awt.Color(255, 255, 255));
        ajoutreserv.setForeground(new java.awt.Color(0, 204, 204));
        ajoutreserv.setText("Gérer vos réservations ");
        ajoutreserv.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent event) {
                Ajoutbutton(event);
            }
        }
);

        newvol.setBackground(new java.awt.Color(204, 204, 204));
        newvol.setForeground(new java.awt.Color(255, 153, 153));
        newvol.setText("Réserver un nouveau vol");
        newvol.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
               // Newvolbutton(e);
            }
        });

       }
   private void Ajoutbutton (java.awt.event.ActionEvent evt) {
                                                      
        desktopclients.removeAll();
        Reservation fr1 = new Reservation();
        desktopclients.add(fr1);
        desktopclients.setVisible(true); 
    }                                           
/*
    private void Newvolbutton (java.awt.event.ActionEvent evt) {    
                                   
        desktopclients.removeAll();
        Ajoutvol fvol = new Ajoutvol();
        desktopclients.add(fvol);
        desktopclients.setVisible(true);
    } 
    
}*/
       //Methode de la barre de menu interface clients
    private JMenuBar MenuBar(){
       //Elements utiles
        JMenuBar eiffelcafe = new JMenuBar();

        JMenu users = new JMenu ("Authentification");

        JMenu langues = new JMenu ("Langues");      
                     
        JMenu notif = new JMenu ("Notifications");
    
     
        JMenu info = new JMenu("Informations");

        JMenu aide = new JMenu( "Aide" );

        
        //Ajouts des items dans authentification
//Membres
        JMenuItem membres = new JMenuItem ("Espace Membres");
        membres.setIcon( new ImageIcon("membres.png"));
        membres.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_DOWN_MASK) );//commande Ctrl+T

        users.addSeparator();
//Employes        
        JMenuItem employes = new JMenuItem ("Espace Employés");
        employes.setIcon( new ImageIcon("membres.png"));
        employes.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK) );//Commande Ctrl+R
  

          //Ajouts de membres et employes à la barre de menu 
        users.add(membres);
        users.add(employes);

         //Ajouts des items dans acheter un billet 
        JMenuItem francais = new JMenuItem ("Français - Fr");
        francais.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK) );

        JMenuItem espagnol = new JMenuItem ("Español - Es ");
        espagnol.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK) );

        JMenuItem allemand = new JMenuItem (" German - Ger");
        allemand.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK) );
     
        JMenuItem chinois = new JMenuItem (" Chinese - Chin");  
        chinois.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK) );
     
   
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
        about.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK) );
        aide.add(about);
        
    
        eiffelcafe.add(users);
        eiffelcafe.add(notif);
        eiffelcafe.add(info);
        eiffelcafe.add(langues);
        eiffelcafe.add(aide);
        
        
        return eiffelcafe;
        
    }
}
