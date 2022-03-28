/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmvc;

import DAO.*;
import controlmvc.ShowMyImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author remyj
 */
public class InfoVille extends JInternalFrame implements ActionListener {

    JPanel pan = new JPanel();

    public InfoVille() {
        super("Information ville");
        setSize(1300, 1000);
    }

    public void init(int id) throws SQLException {
        ShowMyImage im = new ShowMyImage();
        CityDAOImpl ci = new CityDAOImpl();
        City c = new City();
        c = ci.GetCity(id);
        setResizable(false);
        JLabel titre = new JLabel(c.GetNom());
        JButton btnimg = new JButton();
        JButton res= new JButton("Réserver");

        titre.setBounds(50, 30, 50, 20);
        res.setBounds(500,500,100,200);
        btnimg.setBounds(50, 120, 100, 30);

        btnimg.setIcon(new javax.swing.ImageIcon(im.getImage(c.GetId())));
        pan.add(titre);
        pan.add(res);
        pan.add(btnimg);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
