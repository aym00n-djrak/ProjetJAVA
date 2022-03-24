/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public class Vol {

    private int idvol;
    private String compagnie;
    private int numerovol;
    private String typeavion;
    private String datedepart;
    private String datearrivee;
    private String heuredepart;
    private String heurearrivee;

    public int GetId() {
        return idvol;
    }

    public void SetId(int id) {
        idvol=id;
    }

    public String GetCompagnie() {
        return compagnie;
    }

    public void SetCompagnie(String comp) {
        compagnie=comp;
    }

    public int GetNumeroVol() {
        return numerovol;
    }

    public void SetNumeroVol(int num) {
        numerovol=num;
    }

    public String GetTypeAvion() {
        return typeavion;
    }

    public void SetTypeAvion(String type) {
        typeavion=type;
    }

    public String GetDateDepart() {
        return datedepart;
    }

    public void SetDateDepart(String date) {
        datedepart=date;
    }

    public String GetDateArrivee() {
        return datearrivee;
    }

    public void SetDateArrivee(String date) {
        datearrivee=date;
    }

    public String GetHeureDepart() {
        return heuredepart;
    }

    public void SetHeureDepart(String heure) {
        heuredepart=heure;
    }

    public String GetHeureArrivee() {
        return heurearrivee;
    }
    
        public void SetHeureArrivee(String heure)
    {
        heurearrivee=heure;
    }

}
