/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

/**
 *
 * @author Clarence
 */
import javax.swing.*;


import controlmvc.DataCity;
import java.util.ArrayList;
import modelmvc.ConvertAlistToList;

public class Reservation extends JInternalFrame{
//NON TERMINE NETTOYAGE EN COURS
    ConvertAlistToList conv = new ConvertAlistToList();
    DataCity cityd = new DataCity();
    DataCity citya = new DataCity(); 


    JLabel ecran = new JLabel();

    Paiement paye = new Paiement();

    public void Reserv(){
       
       //JInternalFrame frame = new JInternalFrame("---Gérer vos réservations---");
       ArrayList<String> name = new ArrayList<String>();

       //Appel de la methode MenuBar
     //   frame.setJMenuBar(MenuBar());

        //Construction de la fenetre mes reservations   
        JInternalFrame reservation = new JInternalFrame("--- Gestion de vos réservations ---");
        JPanel pachat = new JPanel(); //panneau achat
        JPanel pconf = new JPanel(); //panneau confirmation
        JPanel phistori = new JPanel(); //panneau historique de reservations

        //Creation des onglets
        JTabbedPane onglets = new JTabbedPane();
        onglets.setBounds(40, 20, 800, 800);
        onglets.add("Acheter vos billets", pachat);
        onglets.add("Confirmation d'achats", pconf);
        onglets.add("Historique de réservations", phistori);
//Voyage 
          JLabel labelvoyage = new JLabel("Voyage");
          String condition[] = {"Aller-retour", "Aller", "Retour"};
          JComboBox voyageur = new JComboBox(condition);
          labelvoyage.setBounds(42,16,100,120);
          voyageur.setBounds(93,22,100,120);

//Depart de
        JLabel labeldepart=new JLabel("Départ depuis :");
        cityd.PickData(name);
        String[] pays = new String[name.size()];
        pays = conv.convert(name);
        JComboBox depart = new JComboBox(pays);
        depart.setBounds(64, 22, 100, 20);
        labeldepart.setBounds(61, 16, 100, 20);

 //Arrivee a 
       JLabel labelarrivee = new JLabel("Arrivée à  :");
       citya.PickData(name);
       JComboBox arrive = new JComboBox(pays);
       arrive.setBounds(124,22,100,20);
       labelarrivee.setBounds(105,16,100,20);

//Calendrier
       JLabel labeldate = new JLabel("Durée de votre séjour");
       /*JCalendar/JDate/Mibthchooser*/
        
//Adultes

        JLabel adultes = new JLabel("Combien de passagers adultes ?");
        String quantum []={"0","1","2","3","4","5"};
        JComboBox nbadultes = new JComboBox(quantum);
        adultes.setBounds(185,16,100,33);
        nbadultes.setBounds(256,22,60,40);
//Enfants 
        JLabel enfants = new JLabel("Combien de passagers enfants ?");
        JComboBox nbenfants = new JComboBox(quantum);
        enfants.setBounds(250,16,110,36);
        nbenfants.setBounds(256,22,60,40);


        
        //Confirmation de la reservation 
        JButton validate = new JButton("Confirmer votre réservation");
        JButton suite = new JButton("Accéder à la plateforme de paiement");
        
        validate.setBounds(40, 30, 200, 60);
        suite.setBounds(780, 820, 140, 60);

        //Ajouts à pachat
        pachat.add(labelvoyage);
        pachat.add(voyageur);
        pachat.add(labeldepart);
        pachat.add(depart);
        pachat.add(labelarrivee);
        pachat.add(arrive);
      //  pachat.add(labeldate);
        pachat.add(adultes);
        pachat.add(nbadultes);
        pachat.add(enfants);
        pachat.add(nbenfants);
  
       
        //Ajouts à pconf
        pconf.add(validate);
        pconf.add(suite);

        //Ajouts à la frame reservation
        reservation.add(onglets);
//AJOUTS BACKGROUND
        
        java.net.URL url = this.getClass().getResource("earth.png");
        ImageIcon img = new ImageIcon(url);
        JLabel img1 = new JLabel(img);

        //System.out.println();
        img1.setBounds(0, 0, 557, 264);

        //Set Proportions
        reservation.setClosable(true);
        reservation.setMaximizable(true);
        reservation.setIconifiable(true);
        reservation.setResizable(true);
        reservation.getContentPane().add(ecran);
        reservation.setSize(857,464);
        reservation.setLayout(null);
        reservation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        reservation.setVisible(true);
      

      //  paye.InterfacePaiement(reservation, ecran, desktop, panneau, validate, suite);
        
}
}

