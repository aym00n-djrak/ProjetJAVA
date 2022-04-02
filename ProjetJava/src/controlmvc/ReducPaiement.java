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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thiba
 */
public class ReducPaiement {

    public int ReducPaiement(Clients client, City c) {

        int prix;

       // CityDAOImpl ci = new CityDAOImpl();

        System.out.println("Votre age est : " + client.GetAge());
        System.out.println("La ville est : " + c.GetNom());

        if (client.GetAge() < 100 && client.GetAge() > 65) {
            System.out.println("Vous bénéficiez du tarif senior : réduction de 20% sur votre billet");
            JOptionPane.showMessageDialog(null, "Vous bénéficiez du tarif senior : réduction de 20% sur votre billet");

            prix = c.GetPrix() - c.GetPrix() * 20 / 100;
            System.out.println("Vous devez donc payer : " + prix);

        } else if (client.GetAge() < 17 && client.GetAge() > 0) {
            JOptionPane.showMessageDialog(null, "Vous bénéficiez du tarif senior : réduction de 15% sur votre billet");
            prix = c.GetPrix() - c.GetPrix() * 15 / 100;
            System.out.println("Vous devez donc payer : " + prix);

        } else {
            prix = c.GetPrix();
            JOptionPane.showMessageDialog(null, "Vous ne bénéficiez d'aucunes réductions sur les vols");

            System.out.println("Vous devez payer : " + prix);

        }

        return prix;
    }

}
