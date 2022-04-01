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
import controlmvc.ReducPaiement;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import modelmvc.findUsersId;

/**
 *
 * @author remyj
 */
public class Executable {

    public static void main(String args[]) throws IOException, InterruptedException, SQLException, SQLException, SQLException, SQLException, SQLException {
        Accueil accueil = new Accueil();
       accueil.Accueil();

       ReservationDAOImpl r= new ReservationDAOImpl();
       ArrayList<Reservation> rl= new ArrayList<>();
       ClientsDAOImpl cdao= new ClientsDAOImpl();
       Clients c= new Clients();
//rl=r.GetAllReservation();
    CityDAOImpl cidao= new CityDAOImpl();
    City ci= new City();
       findUsersId id= new findUsersId();
       
       JLabel jlabel= new JLabel("VIP");
       
       c=cdao.GetClient(1);
       int promo=0,reduct=0;
       ReducPaiement reduc= new ReducPaiement();
       
       //promo= reduc.ReducPaiement(c,cidao.GetCity(1));
       
       //System.out.println("promo: "+promo+" reduc: "+(int)((1-((float)promo/(float)(cidao.GetCity(1).GetPrix())))*100)+"%");
       //id.IdUser(jlabel);
    }
}
