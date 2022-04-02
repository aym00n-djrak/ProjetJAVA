/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import DAO.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.*;
import java.util.*;
import javax.swing.*;
import modelmvc.Connection;
import modelmvc.Fenetre;
import viewmvc.CreationPageClient;
import viewmvc.Menu;
import java.sql.SQLException;
import viewmvc.Interfclients;
import viewmvc.Interfemployes;
import viewmvc.Réservation;
import viewmvc.SwitchEmployeCLient;

/**
 *
 * @author remyj
 */
public class EmailVerif {

    SwitchEmployeCLient switchec = new SwitchEmployeCLient();
    Clients client = new Clients();
    Employe employe = new Employe();

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

    public Clients verifcreaboutonmailusers(JButton b,JTextField t0, JTextField t1, JPasswordField p1, JFrame f) {
        {

            Identifiants enregistrement = new Identifiants();
            Réservation reservation = new Réservation();
            Users user = new Users();
            UsersDAOImpl userdao = new UsersDAOImpl();

            b.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (emailverif(t1.getText()) == true) {
                        user.SetId(Integer.parseInt(t0.getText()));
                        user.SetMail(t1.getText());
                        user.SetPassword(p1.getText());
                        userdao.AddUser(user);
                        f.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Identifiant membre client crée !");
                    } else {
                        new Fenetre().panneau("L'email ne correspond pas au type  mail");
                    }
                    if (new Identifiants().Iduser(t1.getText(), p1.getText()) == true) {
                        ArrayList<Users> user = new ArrayList<>();
                        UsersDAOImpl userdao = new UsersDAOImpl();
                        ClientsDAOImpl cdao = new ClientsDAOImpl();
                        int id = 0;
                        user = userdao.GetAllUser();

                        for (int i = 0; i < user.size(); i++) {
                            if (user.get(i).GetMail().equals(t1.getText())) {
                                id = user.get(i).GetId();
                                System.out.println(id);

                            }
                        }
                        f.setVisible(false);
                        System.out.println(id);
                        client = cdao.GetClient(id);
                    }

                }
            });
        }
        return client;
    }

    public Employe verifcreaboutonmailusersempl(JButton b, JTextField t1, JPasswordField p1, JFrame f) {
        {

            Identifiants enregistrement = new Identifiants();
            Réservation reservation = new Réservation();
            UsersEmpl user = new UsersEmpl();
            UsersEmplDAOImpl userdao = new UsersEmplDAOImpl();

            b.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if (emailverif(t1.getText()) == true) {
                        user.SetMail(t1.getText());
                        user.SetPassword(p1.getText());
                        userdao.AddUser(user);
                        f.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Identifiant membre employé crée !");

                    } else {
                        new Fenetre().panneau("L'email ne correspond pas au type  mail");
                    }
                    if (new Identifiants().Iduserempl(t1.getText(), p1.getText()) == true) {
                        ArrayList<UsersEmpl> user = new ArrayList<>();
                        UsersEmplDAOImpl userdao = new UsersEmplDAOImpl();
                        EmployeDAOImpl edao = new EmployeDAOImpl();

                        user = userdao.GetAllUserEmpl();
                        int id = 0;

                        for (int i = 0; i < user.size(); i++) {
                            System.out.println(t1.getText());
                            if (t1.getText().equals(user.get(id).GetMail())) {
                                id = user.get(i).GetId();
                                System.out.println(id);

                            }
                        }
                        f.setVisible(false);
                        System.out.println(id);
                        employe = edao.GetEmploye(id);
                        System.out.println(employe.GetPrenom());
                    }
                }
            });
        }
        return employe;
    }

    public void creationemployes(JButton b, JTextField t1, JTextField t2, JTextField t3, JTextField t4, JTextField t5, JDesktopPane f, Employe e) {
        {
            employe = e;
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

    public void creationclients(JButton b, JTextField t1, JTextField t2, JTextField t3, JTextField t4, JTextField t5, JTextField t6, JFrame f, Clients c) {
        {
            client = c;

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

    public Clients verifboutonmailclient(JButton b, JTextField t1, JPasswordField p1, JFrame f, JLabel j) {
        b.addActionListener(new ActionListener() {
            int id = 0;
            ArrayList<Users> user = new ArrayList<>();
            UsersDAOImpl userdao = new UsersDAOImpl();
            ClientsDAOImpl cdao = new ClientsDAOImpl();

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
                    if (new Identifiants().Iduser(t1.getText(), p1.getText()) == true) {

                        user = userdao.GetAllUser();

                        for (int i = 0; i < user.size(); i++) {
                            if (t1.getText().equals(user.get(i).GetMail())) {
                                id = user.get(i).GetId();
                                System.out.println(id);
                            }
                        }
                        f.setVisible(false);
                        System.out.println(id);
                        Clients clients = cdao.GetClient(id);
                        System.out.println(cdao.GetClient(id).GetNom());
                        System.out.println("Le client action est: " + clients.GetPrenom());
                        j.setText(clients.GetPrenom());
                        System.out.println(j.getText());
                    }
                }
            }
        }
        );
        f.setVisible(false);
        System.out.println("Le client est: " + client.GetPrenom());
        j.setText(client.GetPrenom());
        System.out.println(j.getText());
        return client;
    }

    public Employe verifboutonmailemploye(JButton b, JTextField t1, JPasswordField p1, JFrame f,JLabel j) {

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (emailverif(t1.getText()) == false || t1.getText().isEmpty() || p1.getText().isEmpty()) {
                    if (t1.getText().isEmpty()) {
                        new Fenetre().panneau("Le champ email est vide");
                    } else if (p1.getText().isEmpty()) {
                        new Fenetre().panneau("Le champ password est vide");
                    } else if (emailverif(t1.getText()) == false) {
                        new Fenetre().panneau("L'email ne correspond pas à un mail");
                    }
                } else {
                    if (new Identifiants().Iduserempl(t1.getText(), p1.getText()) == true) {
                        ArrayList<UsersEmpl> user = new ArrayList<>();
                        UsersEmplDAOImpl userdao = new UsersEmplDAOImpl();
                        EmployeDAOImpl edao = new EmployeDAOImpl();

                        user = userdao.GetAllUserEmpl();
                        int id = 0;

                        for (int i = 0; i < user.size(); i++) {
                            System.out.println(t1.getText());
                            if (t1.getText().equals(user.get(id).GetMail())) {
                                id = user.get(i).GetId();
                                System.out.println(id);

                            }
                        }
                        f.setVisible(false);
                        System.out.println(id);
                        employe = edao.GetEmploye(id);
                        j.setText(employe.GetPrenom());
                        System.out.println(employe.GetPrenom());
                    }
                }
            }
        }
        );
        f.setVisible(false);
        return employe;
    }
}
