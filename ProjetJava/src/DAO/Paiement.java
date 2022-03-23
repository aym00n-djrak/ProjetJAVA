/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public class Paiement {

    private int idpaiement;
    private int montant;
    private String date;

    private int foreignkeyreservation;
    private int foreignkeyclient;

    public int GetId() {
        return idpaiement;
    }

    public void SetId(int id) {
        id = idpaiement;
    }

    public int GetMontant() {
        return montant;
    }

    public void SetMontant(int mont) {
        mont = montant;
    }

    public String GetDate() {
        return date;
    }

    public void SetDate(String d) {
        d = date;
    }

    public int GetForeignKeyReservation() {
        return foreignkeyreservation;
    }

    public void SetForeignKeyReservationt(int f) {
        f = foreignkeyreservation;
    }

    public int GetForeignKeyClient() {
        return foreignkeyclient;
    }

    public void SetForeignKeyClient(int f) {
        f = foreignkeyclient;
    }

}
