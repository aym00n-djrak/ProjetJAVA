/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package viewmvc;

/**
 *
 * @author Clarence
 */
import controlmvc.DataCity;
import java.util.ArrayList;
import modelmvc.ConvertAlistToList;
import javax.swing.*;

//Rserva== internalframe de interfaclients
public class Réservation extends javax.swing.JInternalFrame {
    ConvertAlistToList conv = new ConvertAlistToList();
  //  Paiement paye = new Paiement();


  
    public Réservation() {
        initComponents();
   
    }



 private void initComponents() {

        labelvoyage = new javax.swing.JLabel();
        labeldepart = new javax.swing.JLabel();
        labelarrivee = new javax.swing.JLabel();
        labeldate = new javax.swing.JLabel();
        adultes = new javax.swing.JLabel();
        enfants = new javax.swing.JLabel();
        combovoyage = new javax.swing.JComboBox<String>();
        combodepart = new javax.swing.JComboBox<String>();
        comboarrivee = new javax.swing.JComboBox<String>();
        nbenfants = new javax.swing.JComboBox<String>();
        nbadultes = new javax.swing.JComboBox<String>();
        minivion2 = new javax.swing.JLabel();
        minivion3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DataCity cityd = new DataCity();
        DataCity citya = new DataCity(); 

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelvoyage.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 24)); // NOI18N
        labelvoyage.setForeground(new java.awt.Color(0, 153, 153));
        labelvoyage.setText("Voyage");
        labelvoyage.setMaximumSize(new java.awt.Dimension(60, 26));

        labeldepart.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        labeldepart.setForeground(new java.awt.Color(0, 204, 204));
        labeldepart.setText("Départ de:");

        labelarrivee.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        labelarrivee.setForeground(new java.awt.Color(0, 204, 204));
        labelarrivee.setText("Arrivée à :");

        labeldate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeldate.setForeground(new java.awt.Color(0, 153, 153));
        labeldate.setText("Dates de voyage");

        adultes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adultes.setText("Combien de passagers adultes ?");

        enfants.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        enfants.setText("Combien de passagers enfants ?");

        combovoyage.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Aller-retour", "Aller", "Retour" }));
        combovoyage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combovoyageActionPerformed(evt);
            }
        });

        cityd.PickData(name);
        String[] pays = new String[name.size()];
        pays = conv.convert(name);
        combodepart = new JComboBox(pays);
        combodepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodepartActionPerformed(evt);
            }
        });

       citya.PickData(name);
       comboarrivee = new JComboBox(pays);
        comboarrivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboarriveeActionPerformed(evt);
            }
        });

        nbenfants.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "0", "1", "2", "3", "4", "5" }));
        nbenfants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbenfantsActionPerformed(evt);
            }
        });

        nbadultes.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5" }));
        nbadultes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbadultesActionPerformed(evt);
            }
        });

        minivion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewmvc/minivion2.png"))); // NOI18N
        minivion2.setText("");

        minivion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewmvc/minivion3.png"))); // NOI18N
        minivion3.setText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewmvc/planes.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(minivion2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelvoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combovoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeldepart, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combodepart, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minivion3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelarrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboarrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adultes)
                        .addGap(18, 18, 18)
                        .addComponent(nbadultes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(enfants)
                        .addGap(18, 18, 18)
                        .addComponent(nbenfants, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labeldate)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelvoyage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labeldepart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelarrivee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboarrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combovoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minivion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minivion3)
                        .addComponent(combodepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adultes)
                    .addComponent(nbadultes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enfants)
                    .addComponent(nbenfants, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labeldate))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }                       
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelvoyage = new javax.swing.JLabel();
        labeldepart = new javax.swing.JLabel();
        labelarrivee = new javax.swing.JLabel();
        labeldate = new javax.swing.JLabel();
        adultes = new javax.swing.JLabel();
        enfants = new javax.swing.JLabel();
        combovoyage = new javax.swing.JComboBox<String>();
        combodepart = new javax.swing.JComboBox<String>();
        comboarrivee = new javax.swing.JComboBox<String>();
        nbenfants = new javax.swing.JComboBox<String>();
        nbadultes = new javax.swing.JComboBox<String>();
        minivion2 = new javax.swing.JLabel();
        minivion3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelvoyage.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 24)); // NOI18N
        labelvoyage.setForeground(new java.awt.Color(0, 153, 153));
        labelvoyage.setText("Voyage");
        labelvoyage.setMaximumSize(new java.awt.Dimension(60, 26));

        labeldepart.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        labeldepart.setForeground(new java.awt.Color(0, 204, 204));
        labeldepart.setText("Départ de:");

        labelarrivee.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        labelarrivee.setForeground(new java.awt.Color(0, 204, 204));
        labelarrivee.setText("Arrivée à :");

        labeldate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeldate.setForeground(new java.awt.Color(0, 153, 153));
        labeldate.setText("Dates de voyage");

        adultes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adultes.setText("Combien de passagers adultes ?");

        enfants.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        enfants.setText("Combien de passagers enfants ?");

        combovoyage.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Aller-retour", "Aller", "Retour" }));
        combovoyage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combovoyageActionPerformed(evt);
            }
        });

        combodepart.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combodepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodepartActionPerformed(evt);
            }
        });

        comboarrivee.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboarrivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboarriveeActionPerformed(evt);
            }
        });

        nbenfants.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "0", "1", "2", "3", "4", "5" }));
        nbenfants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbenfantsActionPerformed(evt);
            }
        });

        nbadultes.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5" }));
        nbadultes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbadultesActionPerformed(evt);
            }
        });

        minivion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewmvc/minivion2.png"))); // NOI18N
        minivion2.setText("jLabel2");

        minivion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewmvc/minivion3.png"))); // NOI18N
        minivion3.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewmvc/planes.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(minivion2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelvoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combovoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeldepart, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combodepart, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minivion3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelarrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboarrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adultes)
                        .addGap(18, 18, 18)
                        .addComponent(nbadultes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(enfants)
                        .addGap(18, 18, 18)
                        .addComponent(nbenfants, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labeldate)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelvoyage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labeldepart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelarrivee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboarrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combovoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minivion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minivion3)
                        .addComponent(combodepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adultes)
                    .addComponent(nbadultes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enfants)
                    .addComponent(nbenfants, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labeldate))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void nbenfantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbenfantsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbenfantsActionPerformed

    private void combovoyageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combovoyageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combovoyageActionPerformed

    private void comboarriveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboarriveeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboarriveeActionPerformed

    private void nbadultesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbadultesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbadultesActionPerformed

    private void combodepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodepartActionPerformed
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adultes;
    private javax.swing.JComboBox<String> comboarrivee;
    private javax.swing.JComboBox<String> combodepart;
    private javax.swing.JComboBox<String> combovoyage;
    private javax.swing.JLabel enfants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelarrivee;
    private javax.swing.JLabel labeldate;
    private javax.swing.JLabel labeldepart;
    private javax.swing.JLabel labelvoyage;
    private javax.swing.JLabel minivion2;
    private javax.swing.JLabel minivion3;
    private javax.swing.JComboBox<String> nbadultes;
    private javax.swing.JComboBox<String> nbenfants;
    // End of variables declaration//GEN-END:variables
}
