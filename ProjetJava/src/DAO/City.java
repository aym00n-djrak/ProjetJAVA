/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public class City {
    
    private int idcity;
    private String nom;
    private String pays;
    
    public int GetId()
    {
        return idcity;
    }
    
    public void SetId(int id)
    {
        id=idcity;
    }
    
    public String GetNom()
    {
        return nom;
    }
    
    public void SetNom(String name)
    {
        name=nom;
    }
    
    public String GetPays()
    {
        return pays;
    }
    
    public void SetPays(String country)
    {
        country=pays;
    }
}
