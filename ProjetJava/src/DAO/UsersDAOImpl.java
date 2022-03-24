/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author remyj
 */
public class UsersDAOImpl implements UsersDAO {
    
       java.sql.Connection con;

       public void AddUser(Users user)
  {
    Connection dbConnection = null;
    Statement statement=null;

    String sql = "insert into users values(" + user.GetId() + ","+ "'" + user.GetMail()
                    + "'" + "," +"'"+ user.GetPassword()+ "'"+")";

    try
    {
 String DBurl= "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");

            java.sql.Statement stmt = con.createStatement();
   
      stmt.executeUpdate(sql);

      System.out.println("Record is inserted into Users table for  User : " + user.GetMail());

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
    
}
