/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewmvc;

/**
 *
 * @author Clarence
 */
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

public class Interfemployes extends javax.swing.JFrame {

    private JPanel panel;
    private JToggleButton emplois;
    private JToggleButton ajoutvol;
    private JToggleButton stat;
    private JLabel labelclients;
    private JToggleButton clientbutton;
    private JDesktopPane employesb;
    private JLabel labemploi;
    private JLabel addplanes;
    private JLabel statlabel;
    private JLabel label;

    /**
     * Creates new form Interfemployes
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

        panel = new javax.swing.JPanel();
        emplois = new javax.swing.JToggleButton();
        ajoutvol = new javax.swing.JToggleButton();
        stat = new javax.swing.JToggleButton();
        labelclients = new javax.swing.JLabel();
        clientbutton = new javax.swing.JToggleButton();
        employesb = new javax.swing.JDesktopPane();
        labemploi = new javax.swing.JLabel();
        addplanes = new javax.swing.JLabel();
        statlabel = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        emplois.setBackground(new java.awt.Color(255, 255, 255));
        emplois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/essaiemployes/employes.png"))); // NOI18N
        emplois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emploisActionPerformed(evt);
            }
        });

        ajoutvol.setBackground(new java.awt.Color(255, 255, 255));
        ajoutvol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/essaiemployes/minivion2.png"))); // NOI18N
        ajoutvol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutvolActionPerformed(evt);
            }
        });

        stat.setBackground(new java.awt.Color(255, 255, 255));
        stat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/essaiemployes/stat.png"))); // NOI18N
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });

        labelclients.setBackground(new java.awt.Color(255, 255, 255));

        clientbutton.setBackground(new java.awt.Color(255, 255, 255));
        clientbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/essaiemployes/employes.png"))); // NOI18N
        clientbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(emplois, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ajoutvol, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(labelclients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelclients)
                .addGap(132, 132, 132))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(stat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ajoutvol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emplois, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout employesbLayout = new javax.swing.GroupLayout(employesb);
        employesb.setLayout(employesbLayout);
        employesbLayout.setHorizontalGroup(
            employesbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        employesbLayout.setVerticalGroup(
            employesbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );

        labemploi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labemploi.setText("Utilisateur");

        addplanes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addplanes.setText("Gestion des vols");

        statlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        statlabel.setText("Statistiques");

        label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label.setText("Gestion des clients");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employesb, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labemploi)
                        .addGap(47, 47, 47)
                        .addComponent(addplanes)
                        .addGap(39, 39, 39)
                        .addComponent(statlabel)
                        .addGap(58, 58, 58)
                        .addComponent(label)
                        .addGap(0, 397, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(statlabel)
                    .addComponent(addplanes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labemploi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employesb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emploisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emploisActionPerformed
     /*   employesb.removeAll();
        Employes v1 = new Employes();//fenetre interne
        employesb.add(v1).setVisible(true);*/
    }//GEN-LAST:event_emploisActionPerformed

    private void ajoutvolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutvolActionPerformed
       /* employesb.removeAll();
        Ajoutervol a1 = new Ajoutervol();
        employesb.add(a1).setVisible(true);*/
    }//GEN-LAST:event_ajoutvolActionPerformed

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed


}
    }//GEN-LAST:event_statActionPerformed

    /*private void clientbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientbuttonActionPerformed
        employesb.removeAll();
        Clients c1 = new Clients();
        employesb.add(c1).setVisible(true);
    }//GEN-LAST:event_clientbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
/*private void clientbuttonActionPerformed(java.awt.event.ActionEvent evt) {
employesb.removeAll();
Clients c1 = new Clients();
employesb.add(c1).setVisible(true);

}   

public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfemployes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfemployes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfemployes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfemployes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    /*    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfemployes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addplanes;
    private javax.swing.JToggleButton ajoutvol;
    private javax.swing.JToggleButton clientbutton;
    private javax.swing.JToggleButton emplois;
    private javax.swing.JDesktopPane employesb;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelclients;
    private javax.swing.JLabel labemploi;
    private javax.swing.JPanel panel;
    private javax.swing.JToggleButton stat;
    private javax.swing.JLabel statlabel;
    // End of variables declaration//GEN-END:variables
*/
