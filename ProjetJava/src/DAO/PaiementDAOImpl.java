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

/**
 *
 * @author remyj
 */
public class PaiementDAOImpl implements PaiementDAO {

    java.sql.Connection con;

    public void AddPaiement(Paiement paiement) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "insert into paiement values(" + paiement.GetId() + "," + paiement.GetMontant()
                + "," + "'" + paiement.GetDate() + "'" + "," + paiement.GetForeignKeyReservation() + "," + paiement.GetForeignKeyClient() + ")";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is inserted into paiement table for  Paiement : " + paiement.GetMontant());

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
    public Paiement GetPaiement(int idpaiement) {
        Paiement paiement = new Paiement();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;

        String sql = "SELECT * FROM paiement WHERE idPaiement=" + idpaiement + "";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeQuery(sql);

            boolean encore = resultat.next();

            while (encore) {
                System.out.println();

                paiement.SetId(resultat.getInt("idPaiement"));
                paiement.SetMontant(resultat.getInt("Montant"));
                paiement.SetDate(resultat.getString("Date"));
                paiement.SetForeignKeyReservationt(resultat.getInt("idRéservation"));
                paiement.SetForeignKeyClient(resultat.getInt("idClients"));
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
            return paiement;
    }
    
    @Override
    public void UpdatePaiement(Paiement paiement){
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "update paiement set idPaiement=" + paiement.GetId() + "," + "Montant='" + paiement.GetMontant()
                + "'" + "," + "Date='" + paiement.GetDate()+"'"+",idRéservation="+paiement.GetForeignKeyReservation()+",idClients="+paiement.GetForeignKeyClient();

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is updated into paiement table for  paiement : " + paiement.GetId());

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
    public void DeletePaiement(int idpaiement) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from paiement where idPaiement=" + idpaiement;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into paiement table for  paiement : " + idpaiement);

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
