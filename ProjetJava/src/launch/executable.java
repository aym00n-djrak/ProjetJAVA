package launch;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import viewmvc.Accueil;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import viewmvc.*;

import DAO.*;
import controlmvc.Fichier;
import controlmvc.InsertImage;
import controlmvc.ShowMyImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author remyj
 */
public class Executable {

    public static void main(String args[]) throws IOException, InterruptedException, SQLException, SQLException, SQLException, SQLException, SQLException {
        Accueil accueil = new Accueil();
        accueil.Accueil();

        
        ArrayList<City> listcity= new ArrayList<>();
        
        ArrayList<City> c= new ArrayList<>();
 
        CityDAOImpl list= new CityDAOImpl();
        
        //listcity=list.GetAllCity();
                
       //ListVol liste= new ListVol();
        
        
                
        //CreerDestination creadest= new CreerDestination();
        
        //creadest.InterfaceCreeDestination();

        
     // Fichier e= new Fichier();
      
//i.Insert();

         // paye p = new paye();
          
          //p.run();
          

        
        
    }
}
