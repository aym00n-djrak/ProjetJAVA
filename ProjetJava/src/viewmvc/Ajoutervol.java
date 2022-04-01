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
import javax.swing.JOptionPane;
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
        minivion2 = new javax.swing.JLabel();
        voyage = new javax.swing.JLabel();
        depart = new javax.swing.JLabel();
        arrivee = new javax.swing.JLabel();
        combodepart = new javax.swing.JComboBox<>();
        comboarrivee = new javax.swing.JComboBox<>();
        bas = new javax.swing.JPanel();
        duree = new javax.swing.JLabel();
        sejourd = new javax.swing.JLabel();
        sejoura = new javax.swing.JLabel();
        passag = new javax.swing.JPanel();
        pass = new javax.swing.JLabel();
        adultes = new javax.swing.JLabel();
        enfants = new javax.swing.JLabel();
        nbadultes = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        valider = new javax.swing.JButton();

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
        combovoyage.setBounds(30, 120, 170, 40);

        haut.setBackground(new java.awt.Color(0, 153, 204));
        haut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        minivion2.setBackground(new java.awt.Color(255, 255, 255));
        minivion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/essaiemployes/minivion2.png"))); // NOI18N

        voyage.setBackground(new java.awt.Color(0, 153, 204));
        voyage.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        voyage.setForeground(new java.awt.Color(255, 255, 255));
        voyage.setText("Voyage :");

        depart.setBackground(new java.awt.Color(0, 153, 255));
        depart.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        depart.setForeground(new java.awt.Color(255, 255, 255));
        depart.setText("Départ depuis :");

        arrivee.setBackground(new java.awt.Color(0, 153, 255));
        arrivee.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        arrivee.setForeground(new java.awt.Color(255, 255, 255));
        arrivee.setText("Arrivée à : ");

        javax.swing.GroupLayout hautLayout = new javax.swing.GroupLayout(haut);
        haut.setLayout(hautLayout);
        hautLayout.setHorizontalGroup(
            hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hautLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(voyage, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361)
                .addComponent(minivion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depart)
                .addGap(297, 297, 297)
                .addComponent(arrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        hautLayout.setVerticalGroup(
            hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hautLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hautLayout.createSequentialGroup()
                        .addGroup(hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(depart, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrivee))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(hautLayout.createSequentialGroup()
                        .addComponent(voyage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hautLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minivion2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(haut);
        haut.setBounds(0, 30, 1990, 70);

        combodepart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combodepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combodepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodepartActionPerformed(evt);
            }
        });
        getContentPane().add(combodepart);
        combodepart.setBounds(600, 130, 330, 50);

        comboarrivee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboarrivee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboarrivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboarriveeActionPerformed(evt);
            }
        });
        getContentPane().add(comboarrivee);
        comboarrivee.setBounds(1190, 130, 350, 60);

        bas.setBackground(new java.awt.Color(0, 204, 204));
        bas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        duree.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        duree.setForeground(new java.awt.Color(255, 255, 255));
        duree.setText("Durée de votre séjour :");

        sejourd.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        sejourd.setForeground(new java.awt.Color(255, 255, 255));
        sejourd.setText("De :");

        sejoura.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        sejoura.setForeground(new java.awt.Color(255, 255, 255));
        sejoura.setText("Jusqu'au :");

        javax.swing.GroupLayout basLayout = new javax.swing.GroupLayout(bas);
        bas.setLayout(basLayout);
        basLayout.setHorizontalGroup(
            basLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(duree, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(sejourd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312)
                .addComponent(sejoura, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(749, Short.MAX_VALUE))
        );
        basLayout.setVerticalGroup(
            basLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sejoura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duree, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(sejourd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(bas);
        bas.setBounds(-170, 310, 2160, 120);

        passag.setBackground(new java.awt.Color(102, 204, 0));
        passag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pass.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Passagers : ");

        adultes.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        adultes.setForeground(new java.awt.Color(255, 255, 255));
        adultes.setText("Adultes :");

        enfants.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        enfants.setForeground(new java.awt.Color(255, 255, 255));
        enfants.setText("Enfants :");

        nbadultes.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        nbadultes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout passagLayout = new javax.swing.GroupLayout(passag);
        passag.setLayout(passagLayout);
        passagLayout.setHorizontalGroup(
            passagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pass)
                .addGap(281, 281, 281)
                .addComponent(adultes)
                .addGap(44, 44, 44)
                .addComponent(nbadultes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(enfants)
                .addGap(37, 37, 37)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
        );
        passagLayout.setVerticalGroup(
            passagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passagLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(passagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass)
                    .addComponent(adultes)
                    .addComponent(enfants)
                    .addComponent(nbadultes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(passag);
        passag.setBounds(0, 560, 1980, 110);

        valider.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        valider.setForeground(new java.awt.Color(255, 153, 51));
        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });
        getContentPane().add(valider);
        valider.setBounds(20, 810, 220, 70);

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

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        JOptionPane.showMessageDialog(null,"Réservation effectuée ! ");
    }//GEN-LAST:event_validerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adultes;
    private javax.swing.JLabel arrivee;
    private javax.swing.JLabel background;
    private javax.swing.JPanel bas;
    private javax.swing.JComboBox<String> comboarrivee;
    private javax.swing.JComboBox<String> combodepart;
    private javax.swing.JComboBox<String> combovoyage;
    private javax.swing.JLabel depart;
    private javax.swing.JLabel duree;
    private javax.swing.JLabel enfants;
    private javax.swing.JPanel haut;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel minivion2;
    private javax.swing.JComboBox<String> nbadultes;
    private javax.swing.JLabel pass;
    private javax.swing.JPanel passag;
    private javax.swing.JLabel sejoura;
    private javax.swing.JLabel sejourd;
    private javax.swing.JButton valider;
    private javax.swing.JLabel voyage;
    // End of variables declaration//GEN-END:variables
}
