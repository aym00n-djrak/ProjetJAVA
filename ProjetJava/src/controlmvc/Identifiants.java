/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import modelmvc.Fenetre;
import modelmvc.Connection;

import com.mysql.cj.xdevapi.Statement;
import java.sql.*;

/**
 *
 * @author remyj
 */
public class Identifiants {

    modelmvc.Fenetre phrase = new Fenetre();
    String databaseMail = "";
    String databasePassword = "";
    String databaseId = "";
    String requete = "";
    ResultSet resultats = null;

    java.sql.Connection con;
    int id;

    public Boolean Iduser(String mail, String password) {
        //Creation d'une requete SQL
        try {

//            String DBurl = "jdbc:mysql://localhost/booking";
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            requete = "SELECT * FROM users WHERE users_mail='" + mail + "' && users_password='" + password + "'";

            resultats = stmt.executeQuery(requete);

            Connection.affiche("Parcours des données retournées");

            //Vérification des identifiants
            while (resultats.next()) {
                databaseMail = resultats.getString("users_mail");
                databasePassword = resultats.getString("users_password");
            }

            if (mail.equals(databaseMail) && password.equals(databasePassword)) {

                phrase.panneau("Successful Login!");
                return true;
            } else {
                phrase.panneau("Mots de passe ou/et identifiant incorrect !");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("SQLException");
            do {
                System.out.println("SQLState :" + e.getSQLState());
                System.out.println("Description : " + e.getMessage());
                System.out.println("code erreur : " + e.getErrorCode());
                System.out.println("");
                e = e.getNextException();
            } while (e != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean Iduserempl(String mail, String password) {
        //Creation d'une requete SQL
        try {

//            String DBurl = "jdbc:mysql://localhost/booking";
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            requete = "SELECT * FROM usersempl WHERE users_mail='" + mail + "' && users_password='" + password + "'";

            resultats = stmt.executeQuery(requete);

            Connection.affiche("Parcours des données retournées");

            //Vérification des identifiants
            while (resultats.next()) {
                databaseMail = resultats.getString("users_mail");
                databasePassword = resultats.getString("users_password");
            }

            if (mail.equals(databaseMail) && password.equals(databasePassword)) {

                phrase.panneau("Successful Login!");
                return true;
            } else {
                phrase.panneau("Mots de passe ou/et identifiant incorrect !");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("SQLException");
            do {
                System.out.println("SQLState :" + e.getSQLState());
                System.out.println("Description : " + e.getMessage());
                System.out.println("code erreur : " + e.getErrorCode());
                System.out.println("");
                e = e.getNextException();
            } while (e != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void InsertionBDD(String mail, String password) {
        //Creation d'une requete SQL

        try {

            // String DBurl = "jdbc:mysql://localhost/booking";
            //con = DriverManager.getConnection(DBurl, "root", "");
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            System.out.println("Insertion...");

            requete = "INSERT INTO users "
                    + "VALUES (NULL, '" + mail + "', '" + password + "')";

            stmt.executeUpdate(requete);

            Connection.affiche("Données insérés dans la table...");
            con.close();

        } catch (SQLException e) {
            System.out.println("SQLException");
            do {
                System.out.println("SQLState :" + e.getSQLState());
                System.out.println("Description : " + e.getMessage());
                System.out.println("code erreur : " + e.getErrorCode());
                System.out.println("");
                e = e.getNextException();
            } while (e != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
