/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

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
    JLabel l1,l2,l3;
    JPanel p;
    //Thread t=null;
    ImageIcon img;
    JLabel img1;

    
    Accueil() throws IOException, InterruptedException
    {      
        //File file = new File("accueil.png");
        //BufferedImage bufferedImage= ImageIO.read(file);
        
        //img= new ImageIcon(bufferedImage);
     
        
        //img1.setBounds(0,0,1300,1000);
        
        f= new JFrame("Bienvenue !");
        f.getContentPane().setLayout(null);
        //f.getContentPane().setBackground(Color.BLACK);
           
        img= new ImageIcon("C:\\Users\\remyj\\OneDrive - Groupe INSEEC (POCE)\\Documents\\GitHub\\Projetjava\\ProjetJava\\src\\projetjava\\accueil.png");
        img1 = new JLabel();
        img1.setIcon(img);
  
        //LABEL
        l1= new JLabel("Réservation ");
        l1.setBounds(300,300,900,50);
        l1.setFont(new Font("Symbol BOLD", Font.BOLD,60));
        l1.setForeground(Color.red);
        
        l2= new JLabel("By Clarence, Thibaud et Rémy");
        l2.setBounds(450,380,800,40);
        l2.setFont(new Font("Courier new",Font.BOLD,35));
        l2.setForeground(Color.red);
        
        l3=new JLabel(img);
        l3.setBounds(0,0,1300,1000);
        
        f.getContentPane().add(l1);
        f.getContentPane().add(l2);
        f.getContentPane().add(l3);
        f.getContentPane().add(img1);
        
        f.setSize(1300,1000);
        f.setVisible(true);
        
        Thread.sleep(1000);
        f.setVisible(false);
       // t.start();

        
    }  
}
