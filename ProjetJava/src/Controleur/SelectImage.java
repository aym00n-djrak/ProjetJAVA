/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.*;
import Modele.Connection;
import Vue.*;
import java.sql.*;

import java.io.*;

/**
 *
 * @author remyj
 */
public class SelectImage {

    java.sql.Connection con;

    public void Select() throws SQLException {
        try {
            String DBurl = "jdbc:mysql://localhost/booking";
            con = DriverManager.getConnection(DBurl, "root", "");

            Statement stmt = con.createStatement();
            //exécution de la requête
            ResultSet rs = stmt.executeQuery("SELECT * FROM image");
            int i = 0;
            while (rs.next()) {
                InputStream input = rs.getBinaryStream(1);
                //créer l'image dans le répertoir courant
                OutputStream output = new FileOutputStream(new File("test" + i + ".jpg"));
                i++;
                int b = 0;
                while ((b = input.read()) > -1) {
                    output.write(b);
                }
                //fermer le OutputStream
                output.close();
                //fermer le InputStream
                input.close();
            }
            //fermer la connexion
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
