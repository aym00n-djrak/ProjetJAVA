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
      ClientsDAOImpl cdao= new ClientsDAOImpl();
      //System.out.println(cdao.GetClient(1).GetPrenom());
    }
}
