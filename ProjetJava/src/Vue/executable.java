/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Controleur.InsertImage;
import Controleur.SelectImage;
import Controleur.ShowImage;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author remyj
 */
public class executable {
    
        public static void main(String args[]) throws IOException, InterruptedException, SQLException 
    {
            //CreationPage creationPage = new CreationPage();
            //creationPage.Creation();
            InsertImage insertImage = new InsertImage();
            insertImage.Insert();
            
            //SelectImage selectimage= new SelectImage();
            //selectimage.Select();
            
            //ShowImage showImage = new ShowImage();
            //showImage.Show();
            new Accueil();
            //new Login();
            //Connection connection = new Modele.Connection();
            //connection.Connection();
            //new Menu();
    }
}
