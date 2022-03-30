/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vue;

/**
 *
 * @author Clarence
 */
public class Bookavol extends javax.swing.JInternalFrame {

    /**
     * Creates new form Bookavol
     */
    public Bookavol() {
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

        idvol = new javax.swing.JLabel();
        compagnie = new javax.swing.JLabel();
        numvol = new javax.swing.JLabel();
        idvoltxt = new javax.swing.JTextField();
        compagnietxt = new javax.swing.JTextField();
        numvoltxt = new javax.swing.JTextField();
        type = new javax.swing.JLabel();
        typetxt = new javax.swing.JTextField();
        depart = new javax.swing.JLabel();
        departxt = new javax.swing.JTextField();
        retour = new javax.swing.JLabel();
        retourtxt = new javax.swing.JTextField();
        hdepart = new javax.swing.JLabel();
        hdepartxt = new javax.swing.JTextField();
        hretour = new javax.swing.JLabel();
        hretourtxt = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        book = new javax.swing.JButton();
        supp = new javax.swing.JButton();
        sieges = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion des vols");

        idvol.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        idvol.setText("ID VOL");

        compagnie.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        compagnie.setText("Compagnie");

        numvol.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        numvol.setText("N° de vol");

        idvoltxt.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        numvoltxt.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        numvoltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numvoltxtActionPerformed(evt);
            }
        });

        type.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        type.setText("Modèle");

        typetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typetxtActionPerformed(evt);
            }
        });

        depart.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        depart.setText("Date de départ");

        departxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departxtActionPerformed(evt);
            }
        });

        retour.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        retour.setText("Date de retour");

        hdepart.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        hdepart.setText("Heure de départ");

        hdepartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdepartxtActionPerformed(evt);
            }
        });

        hretour.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        hretour.setText("Heure de retour");

        hretourtxt.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        panel.setBackground(new java.awt.Color(255, 153, 51));

        book.setBackground(new java.awt.Color(255, 255, 255));
        book.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        book.setText("Ajouter");

        supp.setBackground(new java.awt.Color(255, 255, 255));
        supp.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        supp.setText("Supprimer");

        sieges.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        sieges.setText("Sièges disponibles");
        sieges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siegesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sieges, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(supp, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                        .addComponent(book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sieges, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(idvol)
                        .addGap(92, 92, 92)
                        .addComponent(idvoltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(compagnie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(compagnietxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numvol)
                                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numvoltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retour)
                            .addComponent(hdepart)
                            .addComponent(hretour))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(retourtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hretourtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hdepartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(depart)
                        .addGap(38, 38, 38)
                        .addComponent(departxt, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idvoltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idvol, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(depart)
                                .addComponent(departxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(retour)
                                .addComponent(compagnietxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(retourtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addComponent(compagnie))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numvol)
                            .addComponent(numvoltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hdepart)
                            .addComponent(hdepartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 138, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hretour)
                            .addComponent(hretourtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(405, 405, 405))))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typetxtActionPerformed

    private void numvoltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numvoltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numvoltxtActionPerformed

    private void departxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departxtActionPerformed

    private void hdepartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hdepartxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hdepartxtActionPerformed

    private void siegesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siegesActionPerformed
        Sieges s1 = new Sieges();
        s1.setVisible(true);
        
    }//GEN-LAST:event_siegesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JLabel compagnie;
    private javax.swing.JTextField compagnietxt;
    private javax.swing.JLabel depart;
    private javax.swing.JTextField departxt;
    private javax.swing.JLabel hdepart;
    private javax.swing.JTextField hdepartxt;
    private javax.swing.JLabel hretour;
    private javax.swing.JTextField hretourtxt;
    private javax.swing.JLabel idvol;
    private javax.swing.JTextField idvoltxt;
    private javax.swing.JLabel numvol;
    private javax.swing.JTextField numvoltxt;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel retour;
    private javax.swing.JTextField retourtxt;
    private javax.swing.JButton sieges;
    private javax.swing.JButton supp;
    private javax.swing.JLabel type;
    private javax.swing.JTextField typetxt;
    // End of variables declaration//GEN-END:variables
}
