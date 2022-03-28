/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import DAO.City;
import DAO.CityDAO;
import DAO.CityDAOImpl;
import DAO.Clients;
import DAO.ClientsDAO;
import DAO.ClientsDAOImpl;
import com.mysql.cj.xdevapi.Client;
import java.util.ArrayList;

/**
 *
 * @author thiba
 */
public class ReducPaiement {

public void ReducPaiement() {

Clients client= new Clients();
ClientsDAOImpl cl = new ClientsDAOImpl();  
client.SetAge(client.GetAge());
ArrayList<City> c= new ArrayList<>();

        CityDAOImpl ci= new CityDAOImpl();
c=ci.GetAllCity();


for(int i = 0; i<c.size();i++)
{
if (client.GetAge()<100 && client.GetAge()>65) {
System.out.println("Vous bénéficiez du tarif senior : réduction de 20% sur votre billet");
c.get(i).SetPrix(c.get(i).GetPrix()*(20/100));
}
else if (client.GetAge()<17 && client.GetAge()>0){
System.out.println("Vous bénéficiez du tarif enfant : réduction de 15% sur votre billet");
c.get(i).SetPrix(c.get(i).GetPrix()*(15/100));
;
}
else {
c.get(i).SetPrix(c.get(i).GetPrix());
}
ci.AddCity(c.get(i));
}
}

}
