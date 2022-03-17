/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Fenetre;
import Modele.Connection;
import Modele.*;

import com.mysql.cj.xdevapi.Statement;
import java.sql.*;

/**
 *
 * @author remyj
 */
public class Identifiants {

    Modele.Fenetre phrase = new Fenetre();
    String databaseUsername = "";
    String databasePassword = "";
    String requete = "";
    ResultSet resultats = null;

    java.sql.Connection con;

    public Boolean Id(String name, String password) {
        //Creation d'une requete SQL
        try {

//            String DBurl = "jdbc:mysql://localhost/booking";
            String DBurl = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11479534";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "sql11479534", "XKb4Tl5i6i");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            requete = "SELECT * FROM users WHERE users_name='" + name + "' && users_password='" + password + "'";

            resultats = stmt.executeQuery(requete);

            Connection.affiche("Parcours des données retournées");

            //Vérification des identifiants
            while (resultats.next()) {
                databaseUsername = resultats.getString("users_name");
                databasePassword = resultats.getString("users_password");
            }

            if (name.equals(databaseUsername) && password.equals(databasePassword)) {

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

    public void InsertionBDD(String name, String password) {
        //Creation d'une requete SQL

        try {

            // String DBurl = "jdbc:mysql://localhost/booking";
            //con = DriverManager.getConnection(DBurl, "root", "");
           
            String DBurl = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11479534";

            con = DriverManager.getConnection(DBurl, "sql11479534", "XKb4Tl5i6i");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            System.out.println("Insertion...");

            requete = "INSERT INTO users "
                    + "VALUES (NULL, '" + name + "', '" + password + "')";

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
