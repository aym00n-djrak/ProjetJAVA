/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public interface PaiementDAO {
    
    public void AddPaiement(Paiement paiement);
    
    public void GetPaiement(int idpaiement);
    
    public void UpdatePaiement(Paiement paiement);
    
    public void DeletePaiement(int idpaiement);
    
}
