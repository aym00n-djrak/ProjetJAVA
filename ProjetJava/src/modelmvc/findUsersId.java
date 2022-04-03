/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc;

import modelmvc.DAO.Clients;
import modelmvc.DAO.ClientsDAOImpl;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author remyj
 */
public class findUsersId {

    
    //METHODE QUI PERMET DE RETROUVER L'identifiant d'un USER A PARTIR DU TEXTE DUN JLABEL
    public int IdUser(JLabel j) {
        int id = 0;
        ClientsDAOImpl cdao = new ClientsDAOImpl();
        ArrayList<Clients> client = new ArrayList<>();

        client = cdao.GetAllClient();
        System.out.println("Le jlabel est intitulé: " + j.getText());
        for (int i = 0; i < client.size(); i++) {
            if (j.getText().equals(client.get(i).GetPrenom())) {
                id = client.get(i).GetId();
                System.out.println("L'id trouvé est :" + id);
            }
        }

        return id;
    }
}
