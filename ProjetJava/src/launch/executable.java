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
import controlmvc.EmailVerif;
import controlmvc.Fichier;
import controlmvc.InsertImage;
import controlmvc.ShowMyImage;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author remyj
 */
public class Executable {

    public static void main(String args[]) throws IOException, InterruptedException, SQLException, SQLException, SQLException, SQLException, SQLException {
        Accueil accueil = new Accueil();
        //accueil.Accueil();

        ArrayList<City> listcity = new ArrayList<>();

        ArrayList<City> c = new ArrayList<>();

        CityDAOImpl list = new CityDAOImpl();

        //listcity=list.GetAllCity();
        //ListVol liste= new ListVol();
        //CreerDestination creadest= new CreerDestination();
        //creadest.InterfaceCreeDestination();
        // Fichier e= new Fichier();
//i.Insert();
        //  paye p = new paye();
        //p.run();
        InfoVille info = new InfoVille();
        //info.init(0);

        CreerVol creavol = new CreerVol();
        // Vol vol= new Vol();
//creavol.InterfaceCreerVol(vol);

        EmailVerif e = new EmailVerif();
        
        Clients cy= new Clients();
        
        ClientsDAOImpl cdao= new ClientsDAOImpl();
        
        //cz=cdao.GetClient(1);
        cy.SetId(3);
        cy.SetAge(22);
        cy.SetNom("Mahd");
        cy.SetPrenom("Cit");
        
        cdao.AddClient(cy);
        
        cy.SetId(4);        
       cdao.UptdateClient(cy);
        
        System.out.println(cy.GetNom());

        City ca= new City();
        
        CityDAOImpl citydao= new CityDAOImpl();
        
       //ca=citydao.GetCity(0);
       
       //citydao.UpdateCity(ca);
       
       Employe em= new Employe();
       
       EmployeDAOImpl emdao= new EmployeDAOImpl();
       
       em=emdao.GetEmploye(0);
        
       emdao.UpdateEmploye(em);
    }
}
