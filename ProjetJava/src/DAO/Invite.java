/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

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
        id = idinvite;
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

}
