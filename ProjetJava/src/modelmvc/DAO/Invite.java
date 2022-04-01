/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

/**
 *
 * @author remyj
 */
public class Invite {

    private int idinvite;
    private String nom;
    private String prenom;

    public int GetId() {
        return idinvite;
    }

    public void SetId(int id) {
        idinvite = id;
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

}
