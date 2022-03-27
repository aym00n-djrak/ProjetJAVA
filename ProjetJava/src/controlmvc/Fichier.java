/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author remyj
 */
public class Fichier extends JFrame implements ActionListener {
    
    JButton open= new JButton("Sélectionner un fichier");
    
    public Fichier()
    {
        super("Explorateur de fichier");
        
        setSize(450,100);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        open.addActionListener(this);
        JPanel pane = new JPanel();
        BorderLayout bord = new BorderLayout();
        pane.setLayout(bord);
        pane.add(open);
        setContentPane(pane);
        setVisible(true);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JTextArea a= new JTextArea();
        
        JFileChooser chooser= new JFileChooser();
        chooser.setApproveButtonText("Choix du fichier...");
        chooser.showOpenDialog(null);
        
        if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            a.append(chooser.getSelectedFile().getAbsolutePath());
            System.out.println(a.getAccessibleContext());
            String Firm= chooser.getSelectedFile().getAbsolutePath();
            System.out.println(Firm);
            InsertImage i= new InsertImage();
            i.Insert(Firm);
            this.setVisible(false);
            
        }
    }
    
    
}
