/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

/**
 *
 * @author remyj
 */
public class Clients {

    private int idmembre;
    private String nom;
    private String prenom;
    private int age;
    private String classe;
    private int numreservation;

    private int foreignkeyuser;

    public int GetId() {
        return idmembre;
    }

    public void SetId(int id) {
        idmembre = id;
    }

    public String GetNom() {
        return nom;
    }

    public void SetNom(String name) {
        nom = name;
    }

    public String GetPrenom() {
        return prenom;
    }

    public void SetPrenom(String name) {
        prenom = name;
    }

    public String GetClasse() {
        return classe;
    }

    public void SetClasse(String c) {
        classe = c;
    }

    public int GetAge() {
        return age;
    }

    public void SetAge(int a) {
        age = a;
    }

    public int GetNumReservation() {
        return numreservation;
    }

    public void SetNumReservation(int reservation) {
        numreservation = reservation;
    }

    public int GetForeignKeyUser() {
        return foreignkeyuser;
    }

    public void SetForeignKeyUser(int fuser) {
        foreignkeyuser = fuser;
    }

}
