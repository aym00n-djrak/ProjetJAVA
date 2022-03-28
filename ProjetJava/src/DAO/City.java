/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.awt.Image;
import java.io.File;

/**
 *
 * @author remyj
 */
public class City {
    
    private int idcity;
    private String nom;
    private String pays;
    private int prix;
    
    public int GetId()
    {
        return idcity;
    }
    
    public void SetId(int id)
    {
        idcity=id;
    }
    
    public String GetNom()
    {
        return nom;
    }
    
    public void SetNom(String name)
    {
        nom=name;
    }
    
    public String GetPays()
    {
        return pays;
    }
    
    public void SetPays(String country)
    {
        pays=country;
    }
    
    public int GetPrix()
    {
        return prix;
    }
    
    public void SetPrix(int e)
    {
        prix=e;
    }
    
}
