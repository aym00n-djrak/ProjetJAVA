/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc;

/**
 *
 * @author remyj
 */
public class Ville {
    controlmvc.DataCity datacity= new controlmvc.DataCity();

    public void AffichageCity() {

        System.out.println("Affichage des villes contenu dans la table city: ");
        
        datacity.AddData("Paris", "Champs-Elysées");
        datacity.PickData();
        
        
        
    }
}
