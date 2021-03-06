/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author remyj
 */
public class Accueil {

    JFrame f;
    JLabel l1, l2, l3;
    JPanel p;
    ImageIcon img;
    JLabel img1;

    
    //METHODE QUI CREE LA PAGE DACCUEIL TEXTE + PARTICIPANT
    public void Accueil() throws IOException, InterruptedException {

        f = new JFrame("Bienvenue !");

        f.getContentPane().setLayout(null);
        //f.getContentPane().setBackground(Color.BLACK);

        java.net.URL url = this.getClass().getResource("accueil.png");

        img = new ImageIcon(url);
        img1 = new JLabel();
        img1.setIcon(img);
        img1.setBounds(0, 0, 1920, 1080);

        //LABEL
        l1 = new JLabel("Billeterie Aéroportuaire");
        l1.setBounds(300, 300, 900, 50);
        l1.setFont(new Font("Symbol BOLD", Font.BOLD, 60));
        l1.setForeground(Color.red);

        l2 = new JLabel("By Clarence, Thibaud et Rémy");
        l2.setBounds(450, 380, 800, 40);
        l2.setFont(new Font("Courier new", Font.BOLD, 35));
        l2.setForeground(Color.red);

        l3 = new JLabel(img);
        l3.setBounds(0, 0, 1920, 1080);

        f.getContentPane().add(l1);
        f.getContentPane().add(l2);
        f.getContentPane().add(l3);
        f.getContentPane().add(img1);

        f.setSize(f.getWidth(), f.getHeight());
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);

        f.setVisible(true);

        Thread.sleep(2000);
        f.setVisible(false);
        
        //TRANSITION VERS LINTERFACE DE SELECTION EMPLOYE CLIENT
        SwitchEmployeCLient switchec = new SwitchEmployeCLient();
        switchec.run();

    }
}
