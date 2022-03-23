/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public class Employe {

    private int idemploye;
    private String nom;
    private String prenom;
    private String departement;
    private String compagnie;
    private int foreignkey;

    public int GetId() {
        return idemploye;
    }

    public void SetId(int id) {
        id = idemploye;
    }

    public String GetNom() {
        return nom;
    }

    public void SetNom(String name) {
        name = nom;
    }

    public String GetPrenom() {
        return prenom;
    }

    public void SetPrenom(String name) {
        name = prenom;
    }

    public String GetDepartement() {
        return departement;
    }

    public void SetDepartement(String dep) {
        dep = departement;
    }

    public String GetCompagnie() {
        return compagnie;
    }

    public void SetCompagnie(String comp) {
        comp = compagnie;
    }

    public int GetForeignKey() {
        return foreignkey;
    }
    
    public void SetForeignKey(int f)
    {
        f=foreignkey;
    }

}
