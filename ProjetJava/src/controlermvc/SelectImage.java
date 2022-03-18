/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlermvc;

import modelmvc.Connection;
import java.awt.Image;
import java.awt.Toolkit;
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
            String DBurl = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11479534";
            //con = DriverManager.getConnection(DBurl, "root", "");
con = DriverManager.getConnection(DBurl, "sql11479534", "XKb4Tl5i6i");

            Statement stmt = con.createStatement();
            
            //exécution de la requête
            ResultSet rs = stmt.executeQuery("SELECT image FROM Image");
            int i = 0;
            while (rs.next()) {
                InputStream input = rs.getBinaryStream(1);
                //créer l'image dans le répertoir courant
                
                OutputStream output = new FileOutputStream(new File("test" + i + ".png"));
                
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
