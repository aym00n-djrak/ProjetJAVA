package launch;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import vuemvc.Accueil;
import controlmvc.DataCity;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author remyj
 */
public class Executable {

    public static void main(String args[]) throws IOException, InterruptedException, SQLException {
        Accueil accueil = new Accueil();
       accueil.Accueil();
        
       DataCity city = new DataCity();
       
       //city.AddData("Paris", "Champs-Elysées");
       //city.PickData();
    }
}
