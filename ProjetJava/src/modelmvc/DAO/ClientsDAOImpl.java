/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author remyj
 */
public class ClientsDAOImpl implements ClientsDAO {

    java.sql.Connection con;

    @Override
    public void AddClient(Clients client) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "insert into clients values(" + client.GetId() + "," + "'" + client.GetNom() + "'"
                + ",'" + client.GetPrenom() + "'," + "'" + client.GetClasse() + "'" + "," + client.GetAge()
                + "," + client.GetNumReservation() + "," + client.GetForeignKeyUser() + ")";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is inserted into Clients table for  Clients : " + client.GetNom());

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
    public Clients GetClient(int idclient) {
        Clients client = new Clients();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;

        String sql = "SELECT * FROM clients WHERE idMembres=" + idclient + "";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            resultat = stmt.executeQuery(sql);

            System.out.println();

            while (resultat.next()) {
                client.SetId(resultat.getInt("idMembres"));
                client.SetNom(resultat.getString("Nom"));
                client.SetPrenom(resultat.getString("Prénom"));
                client.SetClasse(resultat.getString("classe"));
                client.SetAge(resultat.getInt("Age"));
                client.SetNumReservation(resultat.getInt("reservation"));
                client.SetForeignKeyUser(resultat.getInt("users_idusers"));
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
        return client;
    }

    @Override
    public void UptdateClient(int id, Clients client) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "UPDATE clients "
                + " SET  Nom='" + client.GetNom() + "',Prénom='" + client.GetPrenom() + "',classe='" + client.GetClasse() + "',Age=" + client.GetAge() + ",reservation=" + client.GetNumReservation()
                + " WHERE idMembres=" + id;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);
            System.out.println("Record is updated into clients table for  client : " + client.GetId());

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
    public void DeleteClient(int idclient) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from clients where idMembres=" + idclient;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into clients table for  client : " + idclient);

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
    public ArrayList<Clients> GetAllClient() {
        ArrayList<Clients> c = new ArrayList<Clients>();
        Clients client = new Clients();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;
        int compteur = 0;

        String sql = "SELECT * FROM clients ";

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
                client = new Clients();

                System.out.print("Id: " + resultat.getInt("idMembres") + " nom: " + resultat.getString("Nom") + " Prenom: " + resultat.getString("Prénom") + " Classe: " + resultat.getString("classe") + " Age: " + resultat.getInt("Age") + " reservation: " + resultat.getInt("reservation") + " users_idusers :" + resultat.getInt("users_idusers"));
                System.out.println();
                client.SetId(resultat.getInt("idMembres"));
                client.SetNom(resultat.getString("Nom"));
                client.SetPrenom(resultat.getString("Prénom"));
                client.SetClasse(resultat.getString("classe"));
                client.SetAge(resultat.getInt("Age"));
                client.SetNumReservation(resultat.getInt("reservation"));
                client.SetForeignKeyUser(resultat.getInt("users_idusers"));

                c.add(client);
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
        return c;
    }
}
