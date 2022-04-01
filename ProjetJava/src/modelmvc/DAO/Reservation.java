/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

/**
 *
 * @author remyj
 */
public class Reservation {

    private int idreservation;
    private int nombrebillet;

    private String statut;
    private int foreignkeyclientmembre;
    private int confirmation;
    private int foreignkeyvol;

    public int GetId() {
        return idreservation;
    }

    public void SetId(int id) {
        idreservation = id;
    }

    public int GetNombreBillet() {
        return nombrebillet;
    }

    public void SetNombreBillet(int nombre) {
        nombrebillet = nombre;
    }

    public String GetStatut() {
        return statut;
    }

    public void SetStatut(String state) {
        statut = state;
    }

    public int GetForeignKeyClientMembre() {
        return foreignkeyclientmembre;
    }

    public void SetForeignKeyClientMembre(int f) {
        foreignkeyclientmembre = f;
    }

    public int GetConfirmation() {
        return confirmation;
    }

    public void SetConfirmation(int conf) {
        confirmation = conf;
    }

    public int GetForeignKeyVol() {
        return foreignkeyvol;
    }

    public void SetForeignKeyVol(int f) {
        foreignkeyvol = f;
    }

}
