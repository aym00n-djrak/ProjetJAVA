/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

/**
 *
 * @author remyj
 */
public class ReservationDAOImpl implements ReservationDAO {

    java.sql.Connection con;

    public void AddReservation(Reservation reservation) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "insert into réservation values(NULL,"+ reservation.GetNombreBillet()
                + "," + reservation.GetForeignKeyClientMembre() + "," + "'" + reservation.GetStatut() + "'" + "," + reservation.GetConfirmation() + "," + reservation.GetForeignKeyVol() + ")";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is inserted into Reservation table for  Reservation : " + reservation.GetId());

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Override
    public Reservation GetReservation(int idreservation) {
        Reservation reservation = new Reservation();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;

        String sql = "SELECT * FROM réservation WHERE idRéservation=" + idreservation;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            resultat=stmt.executeQuery(sql);

            boolean encore = resultat.next();

            while (encore) {
                System.out.println();

                reservation.SetId(resultat.getInt("idRéservation"));
                reservation.SetNombreBillet(resultat.getInt("Nombre de billet"));
                reservation.SetForeignKeyClientMembre(resultat.getInt("Clients_idMembres"));
                reservation.SetStatut(resultat.getString("Statut"));
                reservation.SetConfirmation(resultat.getInt("Confirmation"));
                reservation.SetForeignKeyVol(resultat.getInt("Vol_idVol"));
            }

            resultat.close();

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return reservation;
    }

    @Override
    public void UpdateReservation(Reservation reservation) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "update réservation set idRéservation=" + reservation.GetId() + "," + "Nombre de billet=" + reservation.GetNombreBillet() + "," + "Client_idMembres=" + reservation.GetForeignKeyClientMembre() + "," + "Statut='" + reservation.GetStatut() + "'" + "," + "Confirmation=" + reservation.GetConfirmation() + "Vol_idVol=" + reservation.GetForeignKeyVol();

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is updated into invite table for  invite : " + reservation.GetId());

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Override
    public void DeleteReservation(int idreservation) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from réservation where idRéservation=" + idreservation;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into réservation table for  reservation : " + idreservation);

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
