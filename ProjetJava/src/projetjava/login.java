/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author remyj
 */
public class Login implements ActionListener {

    JFrame f;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2;

    Login() {

        f = new JFrame("Login");
        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.black);

        l1 = new JLabel("PSEUDO");
        l1.setForeground(Color.red);
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("MDP");
        l2.setForeground(Color.red);
        l2.setBounds(50, 80, 100, 30);

        t1 = new JTextField(20);
        // t1.addActionListener(this);
        t1.setForeground(Color.MAGENTA);
        t1.setBounds(200, 50, 100, 30);

        p1 = new JPasswordField(20);
        p1.setForeground(Color.MAGENTA);
        p1.setBounds(200, 80, 100, 30);

        b1 = new JButton("Login");
        b1.setForeground(Color.RED);
        b1.setBounds(50, 120, 100, 30);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);

                 new Menu();
            }
        });

        b2 = new JButton("Exit");
        b2.setForeground(Color.RED);
        b2.setBounds(200, 120, 100, 30);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
            }
        });

        f.getContentPane().add(l1);
        f.getContentPane().add(l2);
        f.getContentPane().add(b1);
        f.getContentPane().add(t1);
        f.getContentPane().add(p1);
        f.getContentPane().add(b1);
        f.getContentPane().add(b2);

        f.setBounds(300, 300, 400, 300);

        f.setResizable(false);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
