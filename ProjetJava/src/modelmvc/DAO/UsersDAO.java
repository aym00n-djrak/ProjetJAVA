/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

import java.util.ArrayList;

/**
 *
 * @author remyj
 */
public interface UsersDAO {

    public void AddUser(Users user);

    public Users GetUser(int iduser);

    public ArrayList<Users> GetAllUser();

    public void UpdateUser(Users user);

    public void DeleteUser(int iduser);
}
