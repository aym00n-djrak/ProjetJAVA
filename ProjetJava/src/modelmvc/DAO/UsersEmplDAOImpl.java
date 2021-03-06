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

/**
 *
 * @author remyj
 */
public class UsersEmplDAOImpl implements UsersEmplDAO {

    java.sql.Connection con;

    public void AddUser(UsersEmpl user) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "insert into usersempl values(" + user.GetId() + "," + "'" + user.GetMail()
                + "'" + "," + "'" + user.GetPassword() + "'" + ")";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is inserted into Users table for  User : " + user.GetMail());

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
    public UsersEmpl GetUser(int iduser) {
        UsersEmpl user = new UsersEmpl();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;

        String sql = "SELECT * FROM usersempl WHERE idusers=" + iduser;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            resultat = stmt.executeQuery(sql);

            while (resultat.next()) {
                System.out.println();

                user.SetId(resultat.getInt("idusers"));
                user.SetMail(resultat.getString("users_mail"));
                user.SetPassword(resultat.getString("users_password"));
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
        return user;
    }

    @Override
    public void UpdateUser(UsersEmpl user) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "update usersempl set idusers=" + user.GetId() + "," + "users_mail='" + user.GetMail() + "'," + "users_password='" + user.GetPassword() + "'";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is updated into users table for  user : " + user.GetId());

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
    public void DeleteUser(int iduser) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from usersempl where idusers=" + iduser;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into users table for  user : " + iduser);

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
    public ArrayList<UsersEmpl> GetAllUserEmpl() {
        ArrayList<UsersEmpl> u = new ArrayList<UsersEmpl>();
        UsersEmpl user = new UsersEmpl();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;
        int compteur = 0;

        String sql = "SELECT * FROM usersempl ";

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
                user = new UsersEmpl();

                System.out.print("Id: " + resultat.getInt("idusers") + " Mail: " + resultat.getString("users_mail") + " password: " + resultat.getString("users_password"));
                System.out.println();
                user.SetId(resultat.getInt("idusers"));
                user.SetMail(resultat.getString("users_mail"));
                user.SetPassword(resultat.getString("users_password"));
                u.add(user);
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
        return u;
    }

}
