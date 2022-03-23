/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public class Users {

    private int idusers;
    private String mail;
    private String password;

    public int GetId() {
        return idusers;
    }

    public void SetId(int id)
    {
        id=idusers;
    }
    public String GetMail() {
        return mail;
    }
    
    public void SetMail(String courriel)
    {
        courriel=mail;
    }

    public String GetPassword() {
        return password;
    }
    
    public void SetPassword(String pass)
    {
        pass=password;
    }

}
