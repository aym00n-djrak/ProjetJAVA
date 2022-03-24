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
    private int confirmation;
    private int foreignkeyvol;

    public int GetId() {
        return idreservation;
    }
    
    public void SetId(int id)
    {
        id = idreservation;
    }

    public int GetNombreBillet() {
        return nombrebillet;
    }
    
    public void SetNombreBillet(int nombre)
    {
        nombre=nombrebillet;
    }

    public String GetStatut() {
        return statut;
    }
    
    public void SetStatut(String state)
    {
        state=statut;
    }

    public int GetForeignKeyClientMembre() {
        return foreignkeyclientmembre;
    }
    
    public void SetForeignKeyClientMembre(int f)
    {
        f=foreignkeyclientmembre;
    }
    
    public int GetConfirmation()
    {
        return confirmation;
    }
    
    public void SetConfirmation(int conf)
    {
        conf=confirmation;
    }

    public int GetForeignKeyVol() {
        return foreignkeyvol;
    }
    
    public void SetForeignKeyVol(int f)
    {
        f=foreignkeyvol;
    }
}
