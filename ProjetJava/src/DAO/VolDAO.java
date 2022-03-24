/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public interface VolDAO {
    
    public void AddVol(Vol vol);
    
    public Vol GetVol(int idvol);
    
    public void UpdateVol(Vol vol);
    
    public void DeleteVol(int idvol);
    
}
