/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public interface AeroportDAO {
    
    public void AddAeroport(Aeroport aeroport);
    
    public Aeroport GetAeroport(int idaeroport);
    
    public void UpdateAeroport(Aeroport aeroport);
    
    public void DeleteAeroport(int idaeroport);

}
