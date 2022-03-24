/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public interface CityDAO {
    
    public void AddCity(City city);
    
    public City GetCity(int idcity);
    
    public void UpdateCity(City city);
    
    public void DeleteCity(int idcity);
    
}
