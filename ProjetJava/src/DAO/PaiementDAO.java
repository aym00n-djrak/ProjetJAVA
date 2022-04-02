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
public interface PaiementDAO {

    public void AddPaiement(Paiement paiement);

    public Paiement GetPaiement(int idpaiement);

    public ArrayList<Paiement> GetAllPaiement();

    public void UpdatePaiement(Paiement paiement);

    public void DeletePaiement(int idpaiement);

}
