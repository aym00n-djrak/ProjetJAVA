/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author remyj
 */
public interface UsersEmplDAO {
    
    public void AddUser(UsersEmpl user);
    
    public UsersEmpl GetUser(int iduser);
    
    public ArrayList<UsersEmpl> GetAllUserEmpl();
    
    public void UpdateUser(UsersEmpl user);
    
    public void DeleteUser(int iduser);
}
