/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author remyj
 */
public class CityDAOImpl implements CityDAO {

    java.sql.Connection con;

    public void AddCity(City city) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "insert into city values( NULL ," + "'" + city.GetNom()
                + "'" + "," + "'" + city.GetPays() + "'" + "," + city.GetPrix() + ")";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is inserted into City table for  City : " + city.GetNom());

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
    public City GetCity(int idcity) {
        City city = new City();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;

        String sql = "SELECT * FROM city WHERE idCity=" + idcity + "";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            resultat = stmt.executeQuery(sql);

            System.out.println();

            while (resultat.next()) {
                city.SetId(resultat.getInt("idCity"));
                city.SetNom(resultat.getString("city_name"));
                city.SetPays(resultat.getString("Pays"));
                city.SetPrix(resultat.getInt("Tarifs"));
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
        return city;
    }

    public void UpdateCity(City city) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "update city set idCity=" + city.GetId() + "," + "city_name='" + city.GetNom()
                + "'" + "," + "Pays='" + city.GetPays() + "'" + "," + "Tarifs=" + city.GetPrix() + ")";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is updated into city table for  city : " + city.GetId());

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
    public void DeleteCity(int idcity) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from city where idCity=" + idcity;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into city table for  city : " + idcity);

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
    public ArrayList<City> GetAllCity() {
        ArrayList<City> c = new ArrayList<City>();
        City city = new City();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;
        int compteur = 0;

        String sql = "SELECT * FROM city ";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            resultat = stmt.executeQuery(sql);

//            System.out.print("Id: " + resultat.getInt("idCity") + " Name: " + resultat.getString("city_name") + " Pays: " + resultat.getString("Pays") + "Tarif: " + resultat.getInt("Tarifs"));
            System.out.println();

            boolean encore = resultat.next();

            while (encore) {
                city = new City();

                System.out.print("Id: " + resultat.getInt("idCity") + " City: " + resultat.getString("city_name") + " pays: " + resultat.getString("Pays") + " tarifs: " + resultat.getInt("Tarifs"));
                System.out.println();
                city.SetId(resultat.getInt("idCity"));
                city.SetNom(resultat.getString("city_name"));
                city.SetPays(resultat.getString("Pays"));
                city.SetPrix(resultat.getInt("Tarifs"));
                c.add(city);
                encore = resultat.next();
                compteur++;
                System.out.println(c.get(0).GetPays());
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
  