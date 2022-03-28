/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.regex.*;
import java.util.*;
import javax.swing.*;
import modelmvc.Connection;
import modelmvc.Fenetre;
import viewmvc.CreationPage;
import viewmvc.Menu;
import java.sql.SQLException;
import viewmvc.Interfemployes;
import viewmvc.Réservation;

/**
 *
 * @author remyj
 */
public class EmailVerif {

    public Boolean emailverif(String adresse) {

        ArrayList<String> email = new ArrayList<String>();
        Boolean verif = null;

        email.add(adresse);
        //Regular Expression   
        String regx = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regx);

        //Iterate emails array list  
        for (String email1 : email) {
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email1);
            verif = matcher.matches();
            System.out.println(email1 + " : " + verif + "\n");
        }
        return verif;
    }

    public void verifcreaboutonmail(JButton b, JTextField t1, JPasswordField p1, JFrame f) {
        {
            Identifiants enregistrement = new Identifiants();
            //          viewmvc.Menu menu = new Menu();
            Réservation reservation = new Réservation();

            b.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (emailverif(t1.getText()) == true) {
                        enregistrement.InsertionBDD(t1.getText(), p1.getText());
                        f.setVisible(false);
                        Connection.affiche("Membre crée !");
                        //menu.Menu();
                    } else {
                        new Fenetre().panneau("L'email ne correspond pas au type  mail");

                    }
                }
            });
        }
    }

    public void verifboutonmail(JButton b, JTextField t1, JPasswordField p1, JFrame f) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (emailverif(t1.getText()) == false || t1.getText().isEmpty() || p1.getText().isEmpty()) {
                    if (t1.getText().isEmpty()) {
                        new Fenetre().panneau("Le champ email est vide");
                    } else if (p1.getText().isEmpty()) {
                        new Fenetre().panneau("Le champ password est vide");
                    } else if (emailverif(t1.getText()) == false) {
                        new Fenetre().panneau("L'email ne correspond pas à un mail");
                    }
                } else {
                    if (new Identifiants().Id(t1.getText(), p1.getText()) == true) {

                        f.setVisible(false);

                        Interfemployes interfclient= new Interfemployes();
                        
                        interfclient.run();
                    }
                }
            }
        }
        );

    }
}
