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
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author remyj
 */
public class VolDAOImpl implements VolDAO {

    java.sql.Connection con;

    public void AddVol(Vol vol) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "insert into vol values(" + vol.GetId() + "," + "'" + vol.GetDestination() + "'" + "," + "'" + vol.GetCompagnie() + "'" + "," + vol.GetNumeroVol() + "," + "'" + vol.GetTypeAvion() + "'" + "," + "'" + vol.GetDateDepart() + "'" + "," + "'" + vol.GetDateArrivee() + "'" + ","
                + "'" + vol.GetHeureDepart() + "'" + "," + "'" + vol.GetHeureArrivee() + "'" + ")";
        String sql1 = "insert into vol values(?,?,?,?,?,?,?,?)";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is inserted into Vol table for  Vol : " + vol.GetId());

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
    public Vol GetVol(int idvol) {
        Vol vol = new Vol();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;

        String sql = "SELECT * FROM vol WHERE idVol=" + idvol;

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

                vol.SetId(resultat.getInt("idVol"));
                vol.SetCompagnie(resultat.getString("Compagnie"));
                vol.SetNumeroVol(resultat.getInt("Numero_vol"));
                vol.SetTypeAvion(resultat.getString("Type_Avion"));
                vol.SetDateDepart(resultat.getString("Date de départ"));
                vol.SetDateArrivee(resultat.getString("Date de retour"));
                vol.SetHeureDepart(resultat.getString("Heure de départ"));
                vol.SetHeureArrivee(resultat.getString("Heure d'arrivée"));
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
        return vol;
    }

    @Override
    public void UpdateVol(int id, Vol vol) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "UPDATE vol SET idVol=" + vol.GetId() + ",destination='" + vol.GetDestination() + "'," + "Compagnie='" + vol.GetCompagnie() + "',Numero_vol=" + vol.GetNumeroVol() + ",Type_Avion='" + vol.GetTypeAvion() + "',Date de départ='" + vol.GetDateDepart() + "',Date de retour='" + vol.GetDateArrivee() + "',Heure de départ='" + vol.GetHeureDepart() + "',Heure d'arrivée='" + vol.GetHeureArrivee() + "'"
                + " WHERE idVol=" + vol.GetId();

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is updated into vol table for  vol : " + vol.GetId());

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
    public void DeleteVol(int idvol) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from vol where idVol=" + idvol;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into vol table for  vol : " + idvol);

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
    public ArrayList<Vol> GetAllVol() {
        ArrayList<Vol> v = new ArrayList<Vol>();
        Vol vol = new Vol();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;
        int compteur = 0;

        String sql = "SELECT * FROM vol ";

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
                vol = new Vol();

                System.out.print("Id: " + resultat.getInt("idVol") + " destination: " + resultat.getString("destination") + " Compagnie: " + resultat.getString("Compagnie") + " Numero_vol: " + resultat.getInt("Numero_vol")+ "depart: "+resultat.getString("Date de départ")+"arrivee: "+resultat.getString("Date de retour")+"heure depart: "+resultat.getString("Heure de départ")+"heure d'arrivée: "+resultat.getString("Heure d'arrivée"));
                System.out.println();
                vol.SetId(resultat.getInt("idVol"));
                vol.SetDestination(resultat.getString("destination"));
                vol.SetCompagnie(resultat.getString("Compagnie"));
                vol.SetNumeroVol(resultat.getInt("Numero_vol"));
                vol.SetDateDepart(resultat.getString("Date de départ"));
                vol.SetDateArrivee(resultat.getString("Date de retour"));
                vol.SetHeureDepart(resultat.getString("Heure de départ"));
                vol.SetHeureArrivee(resultat.getString("Heure d'arrivée"));

                v.add(vol);
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
        return v;
    }
}


