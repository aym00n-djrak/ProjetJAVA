/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import Controleur.*;

/**
 *
 * @author remyj
 */
public class Ville {
    Controleur.DataCity datacity= new Controleur.DataCity();

    public void AffichageCity() {

        System.out.println("Affichage des villes contenu dans la table city: ");
        
        datacity.AddData("Paris", "Champs-Elysées");
        datacity.PickData();
        
        
        
    }
}
