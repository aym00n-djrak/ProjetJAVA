/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetjava;

import java.sql.*;

/**
 *
 * @author remyj
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ETABLISSEMENT DE LA BDD
        java.sql.Connection con;
        ResultSet resultats = null;
        String requete = "";

//chargement du pilote
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //com.mysql.jdbc.Driver
            affiche("Driver loaded");
            //com.mysql.jdbc.Driver LOCALISATION BDD
        } catch (ClassNotFoundException e) {
            arret("Impossible de charger le pilote jdbc:odbc");
        }

        affiche("Connection à la base de données");
        try {
            
            String DBurl = "jdbc:mysql://localhost/destination";
             con =  DriverManager.getConnection(DBurl,"root","");
            affiche("DataBase connected !");
            requete = "SELECT * FROM ville";

            Statement stmt = con.createStatement();
            
            resultats = stmt.executeQuery(requete);

            affiche("Parcours des données retournées");
            
            boolean encore = resultats.next();

            while (encore) {
                System.out.print("Id: "+ resultats.getInt("idVille")+" Ville: "+resultats.getString("Nom")+" Monnaie: "+ resultats.getString("Monnaie")+" Langue: "+ resultats.getString("Langue"));
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
            arret("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        affiche("Fin du programme");
        System.exit(0);
    }

    private static void affiche(String message) {
        System.out.println(message);
    }

    private static void arret(String message) {
        System.out.println(message);
        System.exit(99);

    }

}
