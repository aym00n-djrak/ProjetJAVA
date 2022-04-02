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

public class EmployeDAOImpl implements EmployeDAO{
    
        java.sql.Connection con;

       public void AddEmploye(Employe employe)
  {
    Connection dbConnection = null;
    Statement statement=null;

    String sql = "insert into employe values(" + employe.GetId() + ","+ "'" + employe.GetNom()
                    + "'" + "," +"'"+ employe.GetPrenom()+ "'"+","+"'"+employe.GetDepartement()
                    + "'" + "," +"'"+ employe.GetCompagnie()+ "'" + "," + employe.GetForeignKey()+")";

    try
    {
 String DBurl= "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();
   
      stmt.executeUpdate(sql);

      System.out.println("Record is inserted into Employee table for  Employee : " + employe.GetNom());

    }
    catch( SQLException e )
    {

      e.printStackTrace();

    }
    finally
    {

      if( statement != null )
      {
        try
        {
          statement.close();
        }
        catch( SQLException e )
        {
          e.printStackTrace();
        }
      }

      if( dbConnection != null )
      {
        try
        {
          dbConnection.close();
        }
        catch( SQLException e )
        {
          e.printStackTrace();
        }
      }

    }

  }


    @Override
    public Employe GetEmploye(int idemploye) {
        Employe employe = new Employe();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultat = null;

        String sql = "SELECT * FROM employe WHERE idEmployes=" + idemploye + "";

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            resultat= stmt.executeQuery(sql);


                System.out.println();
                
                while(resultat.next())
                {
                employe.SetId(resultat.getInt("idEmployes"));
                employe.SetNom(resultat.getString("Nom"));
                employe.SetPrenom(resultat.getString("Prenom"));
                employe.SetDepartement(resultat.getString("Departement"));
                employe.SetCompagnie(resultat.getString("Compagnie"));
                employe.SetForeignKey(resultat.getInt("vol_idVol"));
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
            return employe;
    }
    
    @Override
    public void UpdateEmploye(int id,Employe employe){
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "update employe set Nom='" + employe.GetNom()
                + "'" + "," + "Prenom='" + employe.GetPrenom() + "'" + "," + "Departement='" + employe.GetDepartement() + "'" + "," + "Compagnie='" + employe.GetCompagnie()+ "'" 
                + " where idEmployes="+ employe.GetId();

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is updated into employe table for  employe : " + employe.GetId());

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
    public void DeleteEmploye(int idemploye) {
        Connection dbConnection = null;
        Statement statement = null;

        String sql = "delete from employe where idEmployes=" + idemploye;

        try {
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);

            System.out.println("Record is Deleted into employe table for  employe : " + idemploye);

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

