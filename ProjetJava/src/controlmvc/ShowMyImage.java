/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import modelmvc.Connection;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;

import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author remyj
 */
public class ShowMyImage extends JFrame {

    java.sql.Connection con;

    public Image getImage(int id) throws SQLException {
        //creation et exécution de la requête
        String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
        // con = DriverManager.getConnection(DBurl, "root", "");
        con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

        PreparedStatement statement = con.prepareStatement("SELECT image FROM image WHERE idImage = "+id);
        ResultSet res = statement.executeQuery();
        //récupérer l'image sous forme d'octet
        byte[] image = null;
        while (res.next()) {
            image = res.getBytes("image");
        }
        //créer l'image 
        Image img = Toolkit.getDefaultToolkit().createImage(image);
        return img;
    }
}
