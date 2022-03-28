/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc;

import DAO.City;
import DAO.CityDAOImpl;
import controlmvc.InsertImage;
import controlmvc.eventexit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import viewmvc.Interfemployes;

/**
 *
 * @author remyj
 */
public class CreationDestination extends JInternalFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    public JTextField t1, t2, t3, t4;
    public JPasswordField p1;
    JButton b1, b2, b3, b4;

    modelmvc.Fenetre phrase = new modelmvc.Fenetre();
    controlmvc.Identifiants enregistrement = new controlmvc.Identifiants();
    controlmvc.EmailVerif verif = new controlmvc.EmailVerif();

    JButton open = new JButton("Sélectionner un fichier");

    public CreationDestination() {
        super("Création destination");
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.black);
        init();
    }

    public void init() {
        l1 = new JLabel("Id");
        l1.setForeground(Color.red);
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Nom");
        l2.setForeground(Color.red);
        l2.setBounds(50, 80, 100, 30);

        l3 = new JLabel("Pays");
        l3.setForeground(Color.red);
        l3.setBounds(50, 100, 100, 30);

        l4 = new JLabel("Tarifs");
        l4.setForeground(Color.red);
        l4.setBounds(50, 120, 100, 30);

        l5 = new JLabel("Image");
        l5.setForeground(Color.red);
        l5.setBounds(50, 140, 100, 30);

        this.t1 = new JTextField(20);
        this.t1.setForeground(Color.MAGENTA);
        this.t1.setBounds(200, 50, 100, 30);

        this.t2 = new JTextField(20);
        this.t2.setForeground(Color.MAGENTA);
        this.t2.setBounds(200, 80, 100, 30);

        this.t3 = new JTextField(20);
        this.t3.setForeground(Color.MAGENTA);
        this.t3.setBounds(200, 110, 100, 30);

        this.t4 = new JTextField(20);
        this.t4.setForeground(Color.MAGENTA);
        this.t4.setBounds(200, 140, 100, 30);

        b1 = new JButton("Créer");
        b1.setForeground(Color.RED);
        b1.setBounds(50, 170, 100, 30);

        b2 = new JButton("Exit");
        b2.setForeground(Color.RED);
        b2.setBounds(200, 170, 100, 30);

        open.setForeground(Color.RED);
        open.setBounds(150, 170, 100, 30);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1actionPerformed(e);
            }

        });
        b2.addActionListener(new eventexit());
        open.addActionListener(this);

        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(l3);
        getContentPane().add(l4);
        getContentPane().add(t1);
        getContentPane().add(t2);
        getContentPane().add(t3);
        getContentPane().add(t4);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(open);

        //f.getContentPane().add(show.Show());
        setBounds(300, 300, 400, 300);
        setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JTextArea a = new JTextArea();

        JFileChooser chooser = new JFileChooser();
        chooser.setApproveButtonText("Choix du fichier...");
        chooser.showOpenDialog(null);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            a.append(chooser.getSelectedFile().getAbsolutePath());
            System.out.println(a.getAccessibleContext());
            String Firm = chooser.getSelectedFile().getAbsolutePath();
            System.out.println(Firm);
            InsertImage i = new InsertImage();
            i.Insert(Firm, Integer.valueOf(t1.getText()));
            JOptionPane.showMessageDialog(null, "Image insérée ! Cliquer sur créer !");
        }
    }

    public void b1actionPerformed(ActionEvent e) {
        City c = new City();
        CityDAOImpl cdao = new CityDAOImpl();

        c.SetId(Integer.valueOf(t1.getText()));
        System.out.println(c.GetId());
        c.SetNom(t2.getText());
        System.out.println(c.GetNom());

        c.SetPays(t3.getText());
        System.out.println(c.GetPays());

        c.SetPrix(Integer.valueOf(t4.getText()));
        System.out.println(c.GetPrix());

        cdao.AddCity(c);

        JOptionPane.showMessageDialog(null, "Destination créée !");
        setVisible(false);
        Interfemployes interf = new Interfemployes();
        interf.run();
    }

}
