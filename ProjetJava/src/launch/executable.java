package launch;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import viewmvc.Accueil;
import controlmvc.DataCity;
import java.io.IOException;
import java.sql.SQLException;
import viewmvc.Reservation;


/**
 *
 * @author remyj
 */
public class executable {

    public static void main(String args[]) throws IOException, InterruptedException, SQLException {
        Accueil accueil = new Accueil();
        // accueil.Accueil();
        Reservation reserv= new Reservation();
        reserv.Reservation();
        
        DataCity city = new DataCity();
        String name = null,place = null;
        
        name=city.PickData();
        
        System.out.println(" "+name+" "+place);
        //city.AddData("Paris", "Champs-Elysées");
        //city.PickData();
    }
}
