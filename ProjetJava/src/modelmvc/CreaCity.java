/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package modelmvc;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import DAO.*;
import controlmvc.EmailVerif;
import controlmvc.InsertImage;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelmvc.Connection;

/**
 *
 * @author Clarence
 */
public class CreaCity extends javax.swing.JInternalFrame {

    /**
     * Creates new form Employes
     */
    public CreaCity() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backg = new javax.swing.JPanel();
        infos = new javax.swing.JLabel();
        ground = new javax.swing.JPanel();
        reftxt = new javax.swing.JTextField();
        namemploye = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        premployes = new javax.swing.JLabel();
        surnametxt = new javax.swing.JTextField();
        departement = new javax.swing.JLabel();
        depttxt = new javax.swing.JTextField();
        compagnie = new javax.swing.JLabel();
        executer = new javax.swing.JButton();
        suppBouton = new javax.swing.JButton();
        ref2 = new javax.swing.JLabel();
        executer2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        backg1 = new javax.swing.JPanel();
        infos1 = new javax.swing.JLabel();
        ground1 = new javax.swing.JPanel();
        ref1 = new javax.swing.JLabel();
        reftxt1 = new javax.swing.JTextField();
        namemploye1 = new javax.swing.JLabel();
        nametxt1 = new javax.swing.JTextField();
        premployes1 = new javax.swing.JLabel();
        surnametxt1 = new javax.swing.JTextField();
        departement1 = new javax.swing.JLabel();
        depttxt1 = new javax.swing.JTextField();
        compagnie1 = new javax.swing.JLabel();
        compatxt1 = new javax.swing.JTextField();
        executer1 = new javax.swing.JButton();
        suppBouton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion des villes");

        backg.setBackground(new java.awt.Color(0, 153, 153));

        infos.setBackground(new java.awt.Color(255, 255, 255));
        infos.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        infos.setForeground(new java.awt.Color(255, 255, 255));
        infos.setText(" Création d'une destination");

        ground.setBackground(new java.awt.Color(204, 204, 204));

        reftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reftxtActionPerformed(evt);
            }
        });

        namemploye.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        namemploye.setForeground(new java.awt.Color(255, 255, 255));
        namemploye.setText("Ville");

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        premployes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        premployes.setForeground(new java.awt.Color(255, 255, 255));
        premployes.setText("Pays");

        surnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnametxtActionPerformed(evt);
            }
        });

        departement.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        departement.setForeground(new java.awt.Color(255, 255, 255));
        departement.setText("Tarifs");

        depttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depttxtActionPerformed(evt);
            }
        });

        compagnie.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        compagnie.setForeground(new java.awt.Color(255, 255, 255));
        compagnie.setText("Photo");

        executer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        executer.setForeground(new java.awt.Color(0, 153, 153));
        executer.setText("Exécuter");
        executer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executerActionPerformed(evt);
            }
        });

        suppBouton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        suppBouton.setForeground(new java.awt.Color(153, 0, 51));
        suppBouton.setText("Supprimer");
        suppBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppBoutonActionPerformed(evt);
            }
        });

        ref2.setBackground(new java.awt.Color(255, 255, 255));
        ref2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ref2.setForeground(new java.awt.Color(255, 255, 255));
        ref2.setText("Référence");

        executer2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        executer2.setForeground(new java.awt.Color(102, 0, 255));
        executer2.setText("Update");
        executer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executer2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton1.setText("Selectionnez l'image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout groundLayout = new javax.swing.GroupLayout(ground);
        ground.setLayout(groundLayout);
        groundLayout.setHorizontalGroup(
            groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groundLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(groundLayout.createSequentialGroup()
                        .addComponent(compagnie)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, groundLayout.createSequentialGroup()
                        .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(groundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(suppBouton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(executer2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(executer, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(groundLayout.createSequentialGroup()
                                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namemploye, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ref2)
                                    .addComponent(premployes)
                                    .addComponent(departement))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nametxt)
                                    .addComponent(surnametxt)
                                    .addComponent(reftxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(depttxt, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(162, 162, 162))))
            .addGroup(groundLayout.createSequentialGroup()
                .addGap(529, 529, 529)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        groundLayout.setVerticalGroup(
            groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ref2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namemploye))
                .addGap(44, 44, 44)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(premployes))
                .addGap(43, 43, 43)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departement))
                .addGap(29, 29, 29)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compagnie)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executer)
                    .addComponent(executer2)
                    .addComponent(suppBouton))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout backgLayout = new javax.swing.GroupLayout(backg);
        backg.setLayout(backgLayout);
        backgLayout.setHorizontalGroup(
            backgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgLayout.createSequentialGroup()
                .addGroup(backgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgLayout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(infos, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(ground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        backgLayout.setVerticalGroup(
            backgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(ground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Gestion des employes");

        backg1.setBackground(new java.awt.Color(0, 153, 153));

        infos1.setBackground(new java.awt.Color(255, 255, 255));
        infos1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        infos1.setForeground(new java.awt.Color(255, 255, 255));
        infos1.setText(" Informations employés");

        ground1.setBackground(new java.awt.Color(204, 204, 204));

        ref1.setBackground(new java.awt.Color(255, 255, 255));
        ref1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ref1.setForeground(new java.awt.Color(255, 255, 255));
        ref1.setText("Référence");

        reftxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reftxt1ActionPerformed(evt);
            }
        });

        namemploye1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        namemploye1.setForeground(new java.awt.Color(255, 255, 255));
        namemploye1.setText("Nom");

        nametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxt1ActionPerformed(evt);
            }
        });

        premployes1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        premployes1.setForeground(new java.awt.Color(255, 255, 255));
        premployes1.setText("Prénom");

        surnametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnametxt1ActionPerformed(evt);
            }
        });

        departement1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        departement1.setForeground(new java.awt.Color(255, 255, 255));
        departement1.setText("Département");

        depttxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depttxt1ActionPerformed(evt);
            }
        });

        compagnie1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        compagnie1.setForeground(new java.awt.Color(255, 255, 255));
        compagnie1.setText("Compagnie");

        compatxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compatxt1ActionPerformed(evt);
            }
        });

        executer1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        executer1.setForeground(new java.awt.Color(0, 153, 153));
        executer1.setText("Exécuter");
        executer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executer1ActionPerformed(evt);
            }
        });

        suppBouton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        suppBouton1.setForeground(new java.awt.Color(153, 0, 51));
        suppBouton1.setText("Supprimer");
        suppBouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppBouton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ground1Layout = new javax.swing.GroupLayout(ground1);
        ground1.setLayout(ground1Layout);
        ground1Layout.setHorizontalGroup(
            ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ground1Layout.createSequentialGroup()
                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ground1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ground1Layout.createSequentialGroup()
                                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(namemploye1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(premployes1))
                                    .addComponent(ref1))
                                .addGap(74, 74, 74)
                                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(surnametxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(reftxt1)
                                    .addComponent(nametxt1)))
                            .addGroup(ground1Layout.createSequentialGroup()
                                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departement1)
                                    .addComponent(compagnie1))
                                .addGap(18, 18, 18)
                                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(suppBouton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(depttxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                        .addComponent(compatxt1))))))
                    .addGroup(ground1Layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(executer1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(639, Short.MAX_VALUE))
        );
        ground1Layout.setVerticalGroup(
            ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ref1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reftxt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namemploye1)
                    .addComponent(nametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(premployes1)
                    .addGroup(ground1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(surnametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departement1)
                    .addComponent(depttxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compagnie1)
                    .addComponent(compatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(executer1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(suppBouton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout backg1Layout = new javax.swing.GroupLayout(backg1);
        backg1.setLayout(backg1Layout);
        backg1Layout.setHorizontalGroup(
            backg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backg1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(infos1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backg1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        backg1Layout.setVerticalGroup(
            backg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backg1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(infos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 682, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 682, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 398, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 398, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depttxtActionPerformed

    private void executerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executerActionPerformed
        CityDAOImpl city = new CityDAOImpl();
        City c = new City();
        c.SetId(Integer.parseInt(reftxt.getText()));
        c.SetNom(nametxt.getText());
        c.SetPays(surnametxt.getText());
        c.SetPrix(Integer.parseInt(depttxt.getText()));
        city.AddCity(c);

        JOptionPane.showMessageDialog(null, "Destination bien ajoutée !");
        setVisible(false);

    }//GEN-LAST:event_executerActionPerformed

    private void surnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnametxtActionPerformed

    private void reftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reftxtActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void suppBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppBoutonActionPerformed
        CityDAOImpl city = new CityDAOImpl();
        City c = new City();
        c.SetId(Integer.parseInt(reftxt.getText()));
        c.SetNom(nametxt.getText());
        c.SetPays(surnametxt.getText());
        c.SetPrix(Integer.parseInt(depttxt.getText()));
        city.DeleteCity(c.GetId());

        JOptionPane.showMessageDialog(null, "Destination bien supprimée !");
        setVisible(false);


    }//GEN-LAST:event_suppBoutonActionPerformed

    private void reftxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reftxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reftxt1ActionPerformed

    private void nametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxt1ActionPerformed

    private void surnametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnametxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnametxt1ActionPerformed

    private void depttxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depttxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depttxt1ActionPerformed

    private void compatxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compatxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compatxt1ActionPerformed

    private void executer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_executer1ActionPerformed

    private void suppBouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppBouton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppBouton1ActionPerformed

    private void executer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executer2ActionPerformed
        // TODO add your handling code here:
        CityDAOImpl city = new CityDAOImpl();
        City c = new City();
        c.SetId(Integer.parseInt(reftxt.getText()));
        c.SetNom(nametxt.getText());
        c.SetPays(surnametxt.getText());
        c.SetPrix(Integer.parseInt(depttxt.getText()));
        city.UpdateCity(c.GetId(),c);

        JOptionPane.showMessageDialog(null, "Destination bien mise à jour !");
        setVisible(false);

    }//GEN-LAST:event_executer2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            i.Insert(Firm, Integer.valueOf(reftxt.getText()));
            JOptionPane.showMessageDialog(null, "Image insérée ! Cliquer sur créer !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void run() {
        new CreaCity().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backg;
    private javax.swing.JPanel backg1;
    private javax.swing.JLabel compagnie;
    private javax.swing.JLabel compagnie1;
    private javax.swing.JTextField compatxt1;
    private javax.swing.JLabel departement;
    private javax.swing.JLabel departement1;
    private javax.swing.JTextField depttxt;
    private javax.swing.JTextField depttxt1;
    private javax.swing.JButton executer;
    private javax.swing.JButton executer1;
    private javax.swing.JButton executer2;
    private javax.swing.JPanel ground;
    private javax.swing.JPanel ground1;
    private javax.swing.JLabel infos;
    private javax.swing.JLabel infos1;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel namemploye;
    private javax.swing.JLabel namemploye1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField nametxt1;
    private javax.swing.JLabel premployes;
    private javax.swing.JLabel premployes1;
    private javax.swing.JLabel ref1;
    private javax.swing.JLabel ref2;
    private javax.swing.JTextField reftxt;
    private javax.swing.JTextField reftxt1;
    private javax.swing.JButton suppBouton;
    private javax.swing.JButton suppBouton1;
    private javax.swing.JTextField surnametxt;
    private javax.swing.JTextField surnametxt1;
    // End of variables declaration//GEN-END:variables
}
