/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package viewmvc;

/**
 *
 * @author Clarence
 */
import DAO.*;
public class Ajoutervol extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ajoutervol
     */
    public Ajoutervol() {
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

        background = new javax.swing.JLabel();
        combovoyage = new javax.swing.JComboBox<>();
        haut = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Voyage = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        depart = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        arrivee = new javax.swing.JTextPane();
        minivion2 = new javax.swing.JLabel();
        combodepart = new javax.swing.JComboBox<>();
        comboarrivee = new javax.swing.JComboBox<>();
        bas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/essaiemployes/planes.jpg"))); // NOI18N
        background.setText("BITCH");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Réserver un nouveau vol");
        getContentPane().setLayout(null);

        combovoyage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combovoyage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aller-retour", "Aller", "Retour" }));
        combovoyage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combovoyageActionPerformed(evt);
            }
        });
        getContentPane().add(combovoyage);
        combovoyage.setBounds(30, 150, 160, 35);

        haut.setBackground(new java.awt.Color(0, 153, 204));
        haut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Voyage.setBackground(new java.awt.Color(0, 153, 204));
        Voyage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Voyage.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        Voyage.setForeground(new java.awt.Color(255, 255, 255));
        Voyage.setText("Voyage");
        jScrollPane1.setViewportView(Voyage);

        depart.setBackground(new java.awt.Color(0, 153, 204));
        depart.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        depart.setForeground(new java.awt.Color(255, 255, 255));
        depart.setText("Départ de :");
        jScrollPane2.setViewportView(depart);

        arrivee.setBackground(new java.awt.Color(0, 153, 204));
        arrivee.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        arrivee.setForeground(new java.awt.Color(255, 255, 255));
        arrivee.setText("Arrivée à :");
        jScrollPane3.setViewportView(arrivee);

        minivion2.setBackground(new java.awt.Color(255, 255, 255));
        minivion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/essaiemployes/minivion2.png"))); // NOI18N

        javax.swing.GroupLayout hautLayout = new javax.swing.GroupLayout(haut);
        haut.setLayout(hautLayout);
        hautLayout.setHorizontalGroup(
            hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hautLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364)
                .addComponent(minivion2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        hautLayout.setVerticalGroup(
            hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hautLayout.createSequentialGroup()
                .addGroup(hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(hautLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minivion2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(hautLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hautLayout.createSequentialGroup()
                                .addGroup(hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        getContentPane().add(haut);
        haut.setBounds(0, 30, 1990, 100);

        combodepart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combodepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combodepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodepartActionPerformed(evt);
            }
        });
        getContentPane().add(combodepart);
        combodepart.setBounds(620, 140, 260, 50);

        comboarrivee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboarrivee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboarrivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboarriveeActionPerformed(evt);
            }
        });
        getContentPane().add(comboarrivee);
        comboarrivee.setBounds(1230, 140, 350, 60);

        bas.setBackground(new java.awt.Color(0, 204, 204));
        bas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jEditorPane1.setBackground(new java.awt.Color(0, 204, 204));
        jEditorPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jEditorPane1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jEditorPane1.setForeground(new java.awt.Color(255, 255, 255));
        jEditorPane1.setText("Indiquez la durée de votre séjour");
        jScrollPane4.setViewportView(jEditorPane1);

        javax.swing.GroupLayout basLayout = new javax.swing.GroupLayout(bas);
        bas.setLayout(basLayout);
        basLayout.setHorizontalGroup(
            basLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1397, Short.MAX_VALUE))
        );
        basLayout.setVerticalGroup(
            basLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(bas);
        bas.setBounds(0, 420, 2080, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combovoyageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combovoyageActionPerformed
       //none
    }//GEN-LAST:event_combovoyageActionPerformed

    private void combodepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodepartActionPerformed
        // TODO add your handling code here: //AddCity
    }//GEN-LAST:event_combodepartActionPerformed

    private void comboarriveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboarriveeActionPerformed
        //AddCity
    }//GEN-LAST:event_comboarriveeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Voyage;
    private javax.swing.JTextPane arrivee;
    private javax.swing.JLabel background;
    private javax.swing.JPanel bas;
    private javax.swing.JComboBox<String> comboarrivee;
    private javax.swing.JComboBox<String> combodepart;
    private javax.swing.JComboBox<String> combovoyage;
    private javax.swing.JTextPane depart;
    private javax.swing.JPanel haut;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel minivion2;
    // End of variables declaration//GEN-END:variables
}
