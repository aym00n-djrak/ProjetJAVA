package launch;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import viewmvc.Accueil;
import controlmvc.DataCity;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import modelmvc.*;
import viewmvc.Reservation;

import DAO.*;

/**
 *
 * @author remyj
 */
public class Executable {

    public static void main(String args[]) throws IOException, InterruptedException, SQLException {
        Accueil accueil = new Accueil();
        //accueil.Accueil();
        Reservation reserv = new Reservation();
        reserv.Reserv();
    }
}
