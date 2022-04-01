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
public interface VolDAO {

    public void AddVol(Vol vol);

    public Vol GetVol(int idvol);

    public ArrayList<Vol> GetAllVol();

    public void UpdateVol(int id, Vol vol);

    public void DeleteVol(int idvol);

}
