/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public interface UsersDAO {
    
    public void AddUser(Users user);
    
    public void GetUser(int iduser);
    
    public void UpdateUser(Users user);
    
    public void DeleteUser(int iduser);
}
