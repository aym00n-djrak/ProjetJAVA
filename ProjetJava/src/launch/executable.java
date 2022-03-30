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
import controlmvc.ReadImage;
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
       accueil.Accueil();

        ArrayList<City> listcity = new ArrayList<>();

        ArrayList<City> c = new ArrayList<>();

        CityDAOImpl list = new CityDAOImpl();

        ArrayList<Vol> vol= new ArrayList<>();
        Vol voln= new Vol();
        VolDAOImpl voldao= new VolDAOImpl();
        
        ArrayList<Paiement> pdao= new ArrayList<>();
        PaiementDAOImpl p= new PaiementDAOImpl();
        Paiement pa= new Paiement();
        
        pa.SetDate("30/03/2022");
        pa.SetId(1);
        pa.SetMontant(350);
        pa.SetForeignKeyClient(1);
        pa.SetForeignKeyReservationt(2);
        
        //p.AddPaiement(pa);
        
        pdao=p.GetAllPaiement();
        
        vol=voldao.GetAllVol();
        
        voln=voldao.GetVol(7);
        
    }
}
