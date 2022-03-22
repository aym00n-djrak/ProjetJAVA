/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

import controlmvc.SelectImage;
import controlmvc.eventexit;

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
    JLabel img1;
    ImageIcon img;

    //Modele.Connection connection= new Modele.Connection();
    SelectImage select = new SelectImage();

    public void Menu() throws SQLException {

        java.net.URL url = this.getClass().getResource("batman.jpg");
        img = new ImageIcon(url);
        img1 = new JLabel(img);

        //System.out.println();
        img1.setBounds(0, 0, 1300, 1000);

        f = new JFrame("Menu");
        f.getContentPane().setLayout(null);

        b1 = new JButton("Paris");
        b1.setBounds(150, 390, 210, 60);

        b2 = new JButton("Berlin");
        b2.setBounds(150, 490, 210, 60);

        b3 = new JButton("Londres");
        b3.setBounds(580, 390, 210, 60);

        b4 = new JButton("Exit");
        b4.setBounds(580, 490, 210, 60);
        b4.addActionListener(new eventexit());

        f.getContentPane().add(b1);
        f.getContentPane().add(b2);
        f.getContentPane().add(b3);
        f.getContentPane().add(b4);
        f.getContentPane().add(img1);

        //f.setSize(1300, 1000);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);

    }

    private void add(JLabel Show) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
