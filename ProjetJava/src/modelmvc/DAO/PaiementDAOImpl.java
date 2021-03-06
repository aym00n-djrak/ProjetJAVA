/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

            resultat=stmt.executeQuery(sql);

            while (resultat.next()) {
                System.out.println();

                paiement.SetId(resultat.getInt("idPaiement"));
                paiement.SetMontant(resultat.getInt("Montant"));
                paiement.SetDate(resultat.getString("Date"));
                paiement.SetForeignKeyReservationt(resultat.getInt("idR??servation"));
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
    public void UpdatePaiement(Paiement paiement) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "update paiement set idPaiement=" + paiement.GetId() + "," + "Montant='" + paiement.GetMontant()
                + "'" + "," + "Date='" + paiement.GetDate() + "'" + ",idR??servation=" + paiement.GetForeignKeyReservation() + ",idClients=" + paiement.GetForeignKeyClient();

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
    public void DeletePaiement(int idreservation) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from paiement where idR??servation=" + idreservation;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into paiement table for  r??servation : " + idreservation);

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
    public ArrayList<Paiement> GetAllPaiement() {
        ArrayList<Paiement> p = new ArrayList<Paiement>();
        Paiement paye = new Paiement();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;
        int compteur = 0;

        String sql = "SELECT * FROM paiement ";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            resultat = stmt.executeQuery(sql);

            System.out.println();

            boolean encore = resultat.next();

            while (encore) {
                paye = new Paiement();

                System.out.print("Id: " + resultat.getInt("idPaiement") + " Montant: " + resultat.getString("Montant") + " Date: " + resultat.getInt("idR??servation") + " idClient: " + resultat.getInt("idClients"));
                System.out.println();
                paye.SetId(resultat.getInt("idPaiement"));
                paye.SetMontant(resultat.getInt("Montant"));
                paye.SetDate(resultat.getString("Date"));
                paye.SetForeignKeyReservationt(resultat.getInt("idR??servation"));
                paye.SetForeignKeyClient(resultat.getInt("idClients"));
                p.add(paye);
                encore = resultat.next();
                compteur++;
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
        return p;

    }

}
