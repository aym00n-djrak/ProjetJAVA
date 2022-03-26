/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Vue.Login;
import Vue.Accueil;
import Controleur.*;
import Modele.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.*;
import java.sql.SQLException;
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
    
    //Modele.Connection connection= new Modele.Connection();
    ShowImage show= new ShowImage();

    Menu() throws SQLException {

        img = new ImageIcon("C:\\Users\\remyj\\OneDrive - Groupe INSEEC (POCE)\\Documents\\GitHub\\Projetjava\\ProjetJava\\src\\Vue\\earth.png");
        img1 = new JLabel(img);

        //System.out.println();
        img1.setBounds(0, 0, 1300, 1000);

        f = new JFrame("Menu");
        f.getContentPane().setLayout(null);
        //f.getContentPane().setBackground(Color.GRAY);

        b1 = new JButton("Paris");
        b1.setBounds(150, 390, 210, 60);

        b2 = new JButton("Berlin");
        b2.setBounds(150, 490, 210, 60);

        b3 = new JButton("Londres");
        b3.setBounds(580, 390, 210, 60);

        b4 = new JButton("Exit");
        b4.setBounds(580, 490, 210, 60);

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                System.exit(0);
            }
        });
        
        f.getContentPane().add(b1);
        f.getContentPane().add(b2);
        f.getContentPane().add(b3);
        f.getContentPane().add(b4);
        
        f.getContentPane().add(show.Show());
       // f.getContentPane().add(img1);
        System.out.println(show.Show());

        f.setSize(1300, 1000);
        f.setVisible(true);

    }

    private void add(JLabel Show) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}