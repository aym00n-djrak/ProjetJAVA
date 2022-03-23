/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public class Aeroport {
    
    private int idaeroport;
    private String name;
    private String pays;
    
    public int GetId()
    {
        return idaeroport;
    }
    
    public void SetId(int id)
    {
        id=idaeroport;
    }
    
    public String GetName()
    {
        return name;
    }
    
    public void SetName(String nom)
    {
        nom=name;
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
