/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author remyj
 */
public class hebergement {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Votre hébergement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello world");
        frame.getContentPane().add(label);
        
        JLabel utilisateur = new JLabel("Saisir votre nom d'utilisateur");
        JLabel motsdepasse = new JLabel("Saisir votre mots de passe");
        JTextField textUtilisateur = new JTextField(20);
        JPasswordField textmdp = new JPasswordField(20);
        
        JButton buttonLogin = new JButton("Login");
        
        
        JPanel newPanel = new JPanel(new GridBagLayout());
        
        GridBagConstraints constraints= new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10,10,10,10);
        
        //Add components to the panel
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(utilisateur,constraints);
        
        constraints.gridx = 1;
        newPanel.add(textUtilisateur,constraints);
        
        constraints.gridx= 0;
        constraints.gridy= 1;
        newPanel.add(motsdepasse,constraints);
        
        constraints.gridx= 1;
        newPanel.add(textmdp, constraints);
        
        constraints.gridx=0;
        constraints.gridy=2;
        constraints.gridwidth=2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
        
newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));     

    add(newPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    private static void add(JPanel newPanel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
