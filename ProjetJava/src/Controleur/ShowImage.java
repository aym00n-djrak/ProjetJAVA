/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author remyj
 */
public class ShowImage extends JFrame {

    java.sql.Connection con;
    JFrame j = new JFrame();

    public JLabel Show() throws SQLException {
        try {
            
            String DBurl = "jdbc:mysql://localhost/booking";
            con = DriverManager.getConnection(DBurl, "root", "");
            //creation et exécution de la requête
            PreparedStatement statement = con.prepareStatement("SELECT image FROM Image WHERE id = 'img001'");
            ResultSet res = statement.executeQuery();
            //récupérer l'image sous forme d'octet
            byte[] image = null;
            while (res.next()) {
                image = res.getBytes("image");
            }
            //créer l'image 
            Image img = Toolkit.getDefaultToolkit().createImage(image);
            ImageIcon icone = new ImageIcon(img);
            JLabel l = new JLabel();
            l.setIcon(icone);
            return l;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        setVisible(true);
        return null;

    }
}
