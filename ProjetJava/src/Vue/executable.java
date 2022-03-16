/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Controleur.InsertImage;
import Controleur.SelectImage;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author remyj
 */
public class executable {
    
        public static void main(String args[]) throws IOException, InterruptedException, SQLException 
    {

            //InsertImage insertImage = new InsertImage();
            //insertImage.Insert();
            
            //SelectImage select= new SelectImage();   
            //select.Select();
            new Accueil();
    }
}
