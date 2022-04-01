/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package modelmvc;

import modelmvc.DAO.Clients;
import modelmvc.DAO.ClientsDAOImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import controlmvc.EmailVerif;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Clarence
 */
public class CreaClients extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement st;
    ResultSet res;
    Clients c = new Clients();

    public CreaClients() {
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

        background = new javax.swing.JPanel();
        informations = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        nomtxt = new javax.swing.JTextField();
        nomclient = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        prenom = new javax.swing.JLabel();
        prenomtxt = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        numtxt = new javax.swing.JTextField();
        agetxt = new javax.swing.JTextField();
        age1 = new javax.swing.JLabel();
        agetxt1 = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();
        idtxt1 = new javax.swing.JTextField();
        actualiser = new javax.swing.JButton();
        supp = new javax.swing.JButton();
        ajout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion clients");

        background.setBackground(new java.awt.Color(0, 51, 51));

        informations.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        informations.setForeground(new java.awt.Color(255, 255, 255));
        informations.setText("Informations clients");

        back.setBackground(new java.awt.Color(0, 153, 153));
        back.setForeground(new java.awt.Color(0, 102, 102));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setText("ID foreign");

        nomtxt.setBackground(new java.awt.Color(204, 204, 204));

        nomclient.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nomclient.setText("Nom");

        idtxt.setBackground(new java.awt.Color(204, 204, 204));

        prenom.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        prenom.setText("Prénom");

        prenomtxt.setBackground(new java.awt.Color(204, 204, 204));

        age.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        age.setText("Âge ");

        num.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num.setText("Numéro de réservation");

        numtxt.setBackground(new java.awt.Color(204, 204, 204));

        agetxt.setBackground(new java.awt.Color(204, 204, 204));

        age1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        age1.setText("Classe");

        agetxt1.setBackground(new java.awt.Color(204, 204, 204));

        id1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id1.setText("ID");

        idtxt1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(num)
                        .addGap(18, 18, 18)
                        .addComponent(numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backLayout.createSequentialGroup()
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomclient)
                            .addComponent(prenom)
                            .addComponent(age)
                            .addComponent(age1)
                            .addGroup(backLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backLayout.createSequentialGroup()
                                .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, Short.MAX_VALUE))
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomclient)
                    .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prenom)
                    .addComponent(agetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age)
                    .addComponent(agetxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age1)
                    .addComponent(prenomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num)
                    .addComponent(numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        actualiser.setBackground(new java.awt.Color(0, 153, 153));
        actualiser.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        actualiser.setForeground(new java.awt.Color(255, 255, 255));
        actualiser.setText("Actualiser");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });

        supp.setBackground(new java.awt.Color(255, 0, 0));
        supp.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        supp.setForeground(new java.awt.Color(255, 255, 255));
        supp.setText("Supprimer");
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });

        ajout.setBackground(new java.awt.Color(255, 153, 0));
        ajout.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        ajout.setForeground(new java.awt.Color(255, 255, 255));
        ajout.setText("Ajouter");
        ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(informations)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supp)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualiser)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informations)
                .addGap(39, 39, 39)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(actualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supp)
                    .addComponent(ajout))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
        // TODO add your handling code here:
        ClientsDAOImpl cdao = new ClientsDAOImpl();

        c.SetId(Integer.parseInt(idtxt.getText()));
        c.SetNom(nomtxt.getText());
        c.SetPrenom(prenomtxt.getText());
        c.SetClasse(agetxt1.getText());
        c.SetAge(Integer.parseInt(agetxt.getText()));
        c.SetNumReservation(Integer.parseInt(numtxt.getText()));
        c.SetForeignKeyUser(Integer.parseInt(idtxt1.getText()));

        cdao.UptdateClient(c.GetId(), c);
    }//GEN-LAST:event_actualiserActionPerformed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        ClientsDAOImpl cdao = new ClientsDAOImpl();

        c.SetId(Integer.parseInt(idtxt.getText()));
        c.SetNom(nomtxt.getText());
        c.SetPrenom(prenomtxt.getText());
        c.SetClasse(agetxt1.getText());
        c.SetAge(Integer.parseInt(agetxt.getText()));
        c.SetNumReservation(Integer.parseInt(numtxt.getText()));
        c.SetForeignKeyUser(Integer.parseInt(idtxt1.getText()));

        cdao.AddClient(c);
        JOptionPane.showMessageDialog(null, "Client ajouté");
        System.out.println(c.GetPrenom());
    }//GEN-LAST:event_ajoutActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        // TODO add your handling code here:

        ClientsDAOImpl cdao = new ClientsDAOImpl();
        System.out.println(idtxt.getText());
        c.SetId(Integer.parseInt(idtxt.getText()));

        cdao.DeleteClient(c.GetId());
        JOptionPane.showMessageDialog(null, "Client Supprimé");
    }//GEN-LAST:event_suppActionPerformed

    public void run(Clients client) {
        c = client;
        System.out.println(c.GetNom());
        new CreaClients().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualiser;
    private javax.swing.JLabel age;
    private javax.swing.JLabel age1;
    public javax.swing.JTextField agetxt;
    public javax.swing.JTextField agetxt1;
    private javax.swing.JButton ajout;
    private javax.swing.JPanel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    public javax.swing.JTextField idtxt;
    public javax.swing.JTextField idtxt1;
    private javax.swing.JLabel informations;
    private javax.swing.JLabel nomclient;
    public javax.swing.JTextField nomtxt;
    private javax.swing.JLabel num;
    public javax.swing.JTextField numtxt;
    private javax.swing.JLabel prenom;
    public javax.swing.JTextField prenomtxt;
    private javax.swing.JButton supp;
    // End of variables declaration//GEN-END:variables
}
