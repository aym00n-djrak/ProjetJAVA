/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import modelmvc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        //    String DBurl = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11479534";
        String DBurl= "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

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
        String DBurl= "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

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
    public ArrayList<String> PickData(ArrayList<String> name) {
try {
//            String DBurl = "jdbc:mysql://localhost/booking";
        String DBurl= "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            requete = "SELECT * FROM city";

            System.out.println("Parcours de la table");

            resultats = stmt.executeQuery(requete);
            
            boolean encore= resultats.next();
            
             

            while (encore) {
                System.out.print("Id: "+ resultats.getInt("idCity")+" City: "+resultats.getString("city_name")+" Place: "+ resultats.getString("city_place"));
                System.out.println();
                name.add(resultats.getString("city_name"));
                encore = resultats.next();
            }
            
            resultats.close();
            return name;

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
        return null;

    }
}
