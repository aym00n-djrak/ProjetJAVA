/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.awt.Image;
import java.io.File;
import java.util.*;

/**
 *
 * @author remyj
 */
public interface CityDAO {
    
    public void AddCity(City city);
    
    public City GetCity(int idcity);
    
    public ArrayList<City> GetAllCity();
    
    public void UpdateCity(City city);
    
    public void DeleteCity(int idcity);
    

    
}
