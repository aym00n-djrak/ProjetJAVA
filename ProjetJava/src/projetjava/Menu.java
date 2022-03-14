/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author remyj
 */
public class Menu {

    JFrame f;
    JButton b1, b2, b3, b4;
    JLabel img1, img2;
    ImageIcon img;

    Menu() {

        img = new ImageIcon("C:\\Users\\remyj\\OneDrive - Groupe INSEEC (POCE)\\Documents\\GitHub\\Projetjava\\ProjetJava\\src\\projetjava\\earth1.png");
        img1 = new JLabel(img);

        //System.out.println();
        img1.setBounds(0, 0, 1300, 1000);

        f = new JFrame("Menu");
        f.getContentPane().setLayout(null);
        //f.getContentPane().setBackground(Color.GRAY);

        b1 = new JButton("Réservation");
        b1.setBounds(150, 390, 210, 60);

        b2 = new JButton("Réclamation");
        b2.setBounds(150, 490, 210, 60);

        b3 = new JButton("Annulation");
        b3.setBounds(580, 390, 210, 60);

        b4 = new JButton("Exit");
        b4.setBounds(580, 490, 210, 60);

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
            }
        });

        b1.setBackground(new Color(100, 200, 0));
        b1.setForeground(new Color(255, 255, 255));
        b2.setBackground(new Color(100, 200, 0));
        b2.setForeground(new Color(255, 255, 255));
        b3.setBackground(new Color(100, 200, 0));
        b3.setForeground(new Color(255, 255, 255));
        b4.setBackground(new Color(100, 200, 0));
        b4.setForeground(new Color(255, 255, 255));

        f.getContentPane().add(b1);
        f.getContentPane().add(b2);
        f.getContentPane().add(b3);
        f.getContentPane().add(b4);
        //f.getContentPane().add(label);
        f.getContentPane().add(img1);

        f.setSize(1300, 1000);
        f.setVisible(true);

    }

    public static void main(String args[]) throws IOException, InterruptedException {
      
        new Connection();
        new Accueil();
        new Login();
        
    }

}
