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
public interface ClientsDAO {
    
    public void AddClient(Clients client);
    
    public Clients GetClient(int idclient);

    public ArrayList<Clients> GetAllClient();
    
    public void UptdateClient(int id,Clients client);
    
    public void DeleteClient(int idclient);
    
}
