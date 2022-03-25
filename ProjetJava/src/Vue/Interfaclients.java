/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Clarence
 */
//l'idée c'est qu'interface clients soit un desktop accessible depuis la barre de menu
//qui contient plusieurs internal frames activables par boutons 

public class Interfaclients extends JFrame {
    private JButton ajoutreserv;
    private JDesktopPane desktopclients;
    private JButton newvol;
    private JInternalFrame Ajoutvol;
    Interfaclients(){
      arrangement();


}
    private void arrangement() {

        desktopclients = new JDesktopPane();
        ajoutreserv = new JButton();
        newvol = new JButton();
        Ajoutvol= new JInternalFrame();
        

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
    
}
