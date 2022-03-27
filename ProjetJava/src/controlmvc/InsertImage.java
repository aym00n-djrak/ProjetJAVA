/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import modelmvc.Connection;
import java.sql.*;

import java.io.*;

/**
 *
 * @author remyj
 */
public class InsertImage {

    java.sql.Connection con;

    public void Insert(String s) {
        {

            try {
                String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
                // con = DriverManager.getConnection(DBurl, "root", "");
                con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

                Statement stmt = con.createStatement();

                System.out.println("Insertion de l'image...");

                //l'image à insérer
               
                File file= new File(s);

                //File file= new File("C:\\Users\\remyj\\OneDrive - Groupe INSEEC (POCE)\\Documents\\GitHub\\Projetjava\\ProjetJava\\src\\viewmvc\\berlin.png");
                FileInputStream input = new FileInputStream(file);

                //creation de la requête
                PreparedStatement ps
                        = con.prepareStatement("insert into image values(?,?)");

                //id
                ps.setString(1, "1");
                //image
                ps.setBinaryStream(2, (InputStream) input, (int) file.length());
                
                
                //exécution de la requête
                ps.executeUpdate();
                System.out.println("Image insérée avec succès!");
                //fermer le preparedStatement
                ps.close();
                //fermer la connexion
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
