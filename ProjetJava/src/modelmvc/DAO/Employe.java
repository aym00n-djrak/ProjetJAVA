/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

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

    public void SetId(int eid) {
        idemploye = eid;
    }

    public String GetNom() {
        return nom;
    }

    public void SetNom(String ename) {
        nom = ename;
    }

    public String GetPrenom() {
        return prenom;
    }

    public void SetPrenom(String ename) {
        prenom = ename;
    }

    public String GetDepartement() {
        return departement;
    }

    public void SetDepartement(String edep) {
        departement = edep;
    }

    public String GetCompagnie() {
        return compagnie;
    }

    public void SetCompagnie(String ecomp) {
        compagnie = ecomp;
    }

    public int GetForeignKey() {
        return foreignkey;
    }

    public void SetForeignKey(int ef) {
        foreignkey = ef;
    }

}
