/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import DAO.City;
import DAO.CityDAOImpl;
import DAO.Vol;
import DAO.VolDAO;
import DAO.VolDAOImpl;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author remyj
 */
public class boutonvol {
    
   ArrayList<JButton> boutonlist= new ArrayList();
   
   ArrayList<String> boutonnom= new ArrayList();
   
   
   City city= new City();
   CityDAOImpl citydao = new CityDAOImpl();
   
   public void ajouterboutonvol(ArrayList<String> villes, JFrame frame)
   {
          JButton bouton;

       for(int i=0;i<villes.size();i++)
       {
           bouton=new JButton(villes.get(i));
           frame.getContentPane().add(bouton);
       }
   }    
}
