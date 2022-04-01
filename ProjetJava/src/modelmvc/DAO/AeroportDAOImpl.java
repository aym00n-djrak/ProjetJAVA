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

/**
 *
 * @author remyj
 */
public class AeroportDAOImpl implements AeroportDAO {

    java.sql.Connection con;

    @Override

    public void AddAeroport(Aeroport aeroport) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "insert into aéroport values(" + aeroport.GetId() + "," + "'" + aeroport.GetName()
                + "'" + "," + "'" + aeroport.GetPays() + "'" + ")";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is inserted into Aeroport table for  Aeroport : " + aeroport.GetId());

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
    public Aeroport GetAeroport(int idaeroport) {
        Aeroport aeroport = new Aeroport();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;

        String sql = "SELECT * FROM aéroport WHERE idAéroport=" + idaeroport + "";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            resultat = stmt.executeQuery(sql);

            while (resultat.next()) {
                System.out.print("Id: " + resultat.getInt("idAéroport") + " Name: " + resultat.getString("Name") + " Pays: " + resultat.getString("Pays"));

                System.out.println();

                aeroport.SetId(resultat.getInt("idAéroport"));
                aeroport.SetName(resultat.getString("Name"));
                aeroport.SetPays(resultat.getString("Pays"));
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
        return aeroport;
    }

    public void UpdateAeroport(Aeroport aeroport) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "update aéroport set idAéroport=" + aeroport.GetId() + "," + "Name='" + aeroport.GetName()
                + "'" + "," + "Pays='" + aeroport.GetPays() + "'" + ")";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is updated into Aeroport table for  Aeroport : " + aeroport.GetId());

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
    public void DeleteAeroport(int idaeroport) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from Aéroport where idAéroport=" + idaeroport;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into Aeroport table for  Aeroport : " + idaeroport);

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
