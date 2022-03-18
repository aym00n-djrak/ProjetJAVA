/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlermvc;

import modelmvc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author remyj
 */
public class DataCity {

    java.sql.Connection con;
    String requete;
    ResultSet resultats = null;
    public String databasename, databaseplace;

    public void AddData(String name, String place) {

        try {

//            String DBurl = "jdbc:mysql://localhost/booking";
            String DBurl = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11479534";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "sql11479534", "XKb4Tl5i6i");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            requete = "INSERT INTO city VALUES(NULL,'"+name+"','"+place+"')";

            System.out.println("Parcours de la table");

            stmt.executeUpdate(requete);

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
        }
    }

    public void PickSelectedData(String name, String place) {
try {

//            String DBurl = "jdbc:mysql://localhost/booking";
            String DBurl = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11479534";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "sql11479534", "XKb4Tl5i6i");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            requete = "SELECT * FROM city WHERE city_name='" + name + "' && city_place='" + place + "'";

            System.out.println("Parcours de la table");

            resultats = stmt.executeQuery(requete);


        } catch (SQLException e) {
            System.out.println("SQLException");
            do {
                System.out.println("SQLState :" + e.getSQLState());
                System.out.println("Description : " + e.getMessage());
                System.out.println("code erreur : " + e.getErrorCode());
                System.out.println("");
                e = e.getNextException();
            } while (e != null);
        }

    }
    public void PickData() {
try {

//            String DBurl = "jdbc:mysql://localhost/booking";
            String DBurl = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11479534";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "sql11479534", "XKb4Tl5i6i");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            requete = "SELECT * FROM city";

            System.out.println("Parcours de la table");

            resultats = stmt.executeQuery(requete);
            
            boolean encore= resultats.next();
            
          //  name= resultats.getString("city_name");
           // place= resultats.getString("city_place");

            while (encore) {
                System.out.print("Id: "+ resultats.getInt("idCity")+" City: "+resultats.getString("city_name")+" Place: "+ resultats.getString("city_place"));
                System.out.println();
                encore = resultats.next();
            }
            
            resultats.close();


        } catch (SQLException e) {
            System.out.println("SQLException");
            do {
                System.out.println("SQLState :" + e.getSQLState());
                System.out.println("Description : " + e.getMessage());
                System.out.println("code erreur : " + e.getErrorCode());
                System.out.println("");
                e = e.getNextException();
            } while (e != null);
        }

    }
}
