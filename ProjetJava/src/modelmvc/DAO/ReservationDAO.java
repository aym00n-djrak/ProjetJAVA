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
public interface ReservationDAO {

    public void AddReservation(Reservation reservation);

    public Reservation GetReservation(int idreservation);

    public ArrayList<Reservation> GetAllReservation();

    public void UpdateReservation(Reservation reservation);

    public void DeleteReservation(int idreservation);
}
