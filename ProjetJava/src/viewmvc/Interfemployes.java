/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewmvc;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import modelmvc.CreationDestination;

/**
 *
 * @author Clarence
 */
public class Interfemployes extends javax.swing.JFrame {

    /**
     * Creates new form Interfclients
     */
    public Interfemployes() {
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

        desktopclients = new javax.swing.JDesktopPane();
        manage = new javax.swing.JButton();
        vol = new javax.swing.JButton();
        destinations = new javax.swing.JButton();
        destinations1 = new javax.swing.JButton();
        vol1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Espace employés");

        desktopclients.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout desktopclientsLayout = new javax.swing.GroupLayout(desktopclients);
        desktopclients.setLayout(desktopclientsLayout);
        desktopclientsLayout.setHorizontalGroup(
            desktopclientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        desktopclientsLayout.setVerticalGroup(
            desktopclientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        manage.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        manage.setForeground(new java.awt.Color(0, 204, 204));
        manage.setText("Créer Vol");
        manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageActionPerformed(evt);
            }
        });

        vol.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        vol.setForeground(new java.awt.Color(51, 204, 0));
        vol.setText("Réserver un nouveau vol");
        vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volActionPerformed(evt);
            }
        });

        destinations.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        destinations.setForeground(new java.awt.Color(255, 153, 153));
        destinations.setText("Créer Destination ");
        destinations.setActionCommand("Créer Destination");
        destinations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creerdestinationsActionPerformed(evt);
            }
        });

        destinations1.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        destinations1.setForeground(new java.awt.Color(255, 153, 153));
        destinations1.setText("Destinations ");
        destinations1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinations1ActionPerformed(evt);
            }
        });

        vol1.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        vol1.setForeground(new java.awt.Color(51, 204, 0));
        vol1.setText("Creer un employe");
        vol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vol1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("INTERFACE EMPLOYE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(destinations1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vol1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopclients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(vol1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vol, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(destinations1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinations, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopclients)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Espace client");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volActionPerformed
        desktopclients.removeAll();
        Ajoutervol v1 = new Ajoutervol();//fenetre interne
        desktopclients.add(v1).setVisible(true);
    }//GEN-LAST:event_volActionPerformed

    private void manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActionPerformed
        desktopclients.removeAll();
        CreaVol creavol = new CreaVol();
        desktopclients.add(creavol).setVisible(true);
        
        
    }//GEN-LAST:event_manageActionPerformed

    private void creerdestinationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creerdestinationsActionPerformed
        desktopclients.removeAll();
        CreaCity creacity=new CreaCity();
        desktopclients.add(creacity).setVisible(true);

    }//GEN-LAST:event_creerdestinationsActionPerformed

    private void destinations1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinations1ActionPerformed
        // TODO add your handling code here:
        try {
            desktopclients.removeAll();
            //Destinations d1 = new Destinations();
            ListVol d1 = new ListVol();
            d1.init(desktopclients);

            desktopclients.add(d1).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Interfemployes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_destinations1ActionPerformed

    private void vol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vol1ActionPerformed
        // TODO add your handling code here:
        desktopclients.removeAll();
        CreaEmployes creaempl = new CreaEmployes();
        creaempl.run();
        desktopclients.add(creaempl).setVisible(true);

    }//GEN-LAST:event_vol1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void run() {

        new Interfemployes().setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopclients;
    private javax.swing.JButton destinations;
    private javax.swing.JButton destinations1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manage;
    private javax.swing.JButton vol;
    private javax.swing.JButton vol1;
    // End of variables declaration//GEN-END:variables
}
