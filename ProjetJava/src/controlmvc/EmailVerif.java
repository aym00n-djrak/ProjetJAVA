/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import DAO.*;
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

    public void verifcreaboutonmailusers(JButton b, JTextField t1, JPasswordField p1, JFrame f) {
        {
            Identifiants enregistrement = new Identifiants();
            Réservation reservation = new Réservation();
            Users user = new Users();
            UsersDAOImpl userdao = new UsersDAOImpl();

            b.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (emailverif(t1.getText()) == true) {
                        user.SetMail(t1.getText());
                        user.SetPassword(p1.getText());
                        userdao.AddUser(user);
                        f.setVisible(false);
                        Connection.affiche("Membre crée !");
                    } else {
                        new Fenetre().panneau("L'email ne correspond pas au type  mail");

                    }
                }
            });
        }
    }

    public void creationemployes(JButton b, JTextField t1, JTextField t2, JTextField t3, JTextField t4,JTextField t5, JFrame f) {
        {
            Identifiants enregistrement = new Identifiants();
            Réservation reservation = new Réservation();
            Employe employe = new Employe();
            EmployeDAOImpl employedao = new EmployeDAOImpl();

            b.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        employe.SetId(0);
                        employe.SetNom(t1.getText());
                        employe.SetPrenom(t2.getText());
                        employe.SetCompagnie(t3.getText());
                        employe.SetDepartement(t4.getText());
                        employe.SetForeignKey(Integer.parseInt(t5.getText()));
                        
                        employedao.AddEmploye(employe);
                        f.setVisible(false);
                        Connection.affiche("Employé crée !");
                    
                }
            });
        }
    }
    
        public void creationclients(JButton b, JTextField t1, JTextField t2, JTextField t3, JTextField t4,JTextField t5,JTextField t6, JFrame f) {
        {
            Identifiants enregistrement = new Identifiants();
            Réservation reservation = new Réservation();
            Clients client = new Clients();
            ClientsDAOImpl clientdao = new ClientsDAOImpl();

            b.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        client.SetId(0);
                        client.SetNom(t1.getText());
                        client.SetPrenom(t2.getText());
                        client.SetClasse(t3.getText());
                        client.SetAge(Integer.parseInt(t4.getText()));
                        client.SetNumReservation(Integer.parseInt(t5.getText()));
                        client.SetForeignKeyUser(Integer.parseInt(t6.getText()));
                        
                        clientdao.AddClient(client);
                        f.setVisible(false);
                        Connection.affiche("Client crée !");
                    
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

                        Interfemployes interfemploye = new Interfemployes();

                        interfemploye.run();
                    }
                }
            }
        }
        );

    }
}
