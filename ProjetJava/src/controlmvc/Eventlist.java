/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import viewmvc.CreationPageClient;

/**
 *
 * @author remyj
 */

//CLASSE DEVENEMETNT
public class Eventlist implements ActionListener {

    @Override
    
    //EVENEMENT POUR QUITTER LAPPLICATION
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

}
