/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public class Clients {

    private int idmembre;
    private String nom;
    private String prenom;
    private String datenaissance;
    private String classe;
    private int numreservation;

    private int foreignkeyuser;

    public int GetId() {
        return idmembre;
    }

    public void SetId(int id) {
        id = idmembre;
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
    
    public String GetClasse()
    {
        return classe;
    }
    
    public void SetClasse(String c)
    {
        c=classe;
    }
    
    public String GetDateNaissance() {
        return datenaissance;
    }

    public void SetDateNaissance(String date) {
        date = datenaissance;
    }

    public int GetNumReservation() {
        return numreservation;
    }

    public void SetNumReservation(int reservation) {
        reservation = numreservation;
    }

    public int GetForeignKeyUser() {
        return foreignkeyuser;
    }

    public void SetForeignKeyUser(int fuser) {
        fuser = foreignkeyuser;
    }

}
