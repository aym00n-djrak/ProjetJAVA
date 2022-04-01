/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

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
        idpaiement = id;
    }

    public int GetMontant() {
        return montant;
    }

    public void SetMontant(int mont) {
        montant = mont;
    }

    public String GetDate() {
        return date;
    }

    public void SetDate(String d) {
        date = d;
    }

    public int GetForeignKeyReservation() {
        return foreignkeyreservation;
    }

    public void SetForeignKeyReservationt(int f) {
        foreignkeyreservation = f;
    }

    public int GetForeignKeyClient() {
        return foreignkeyclient;
    }

    public void SetForeignKeyClient(int f) {
        foreignkeyclient = f;
    }

}
