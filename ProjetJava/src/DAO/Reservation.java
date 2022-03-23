/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public class Reservation {

    private int idreservation;
    private int nombrebillet;

    private String statut;
    private int foreignkeyclientmembre;
    private int foreignkeyvol;

    public int GetId() {
        return idreservation;
    }

    public int GetNombreBillet() {
        return nombrebillet;
    }

    public String GetStatut() {
        return statut;
    }

    public int GetForeignKeyClientMembre() {
        return foreignkeyclientmembre;
    }

    public int GetForeignKeyVol() {
        return foreignkeyvol;
    }
}
