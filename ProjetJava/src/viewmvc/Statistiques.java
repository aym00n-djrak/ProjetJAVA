/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package viewmvc;

import java.awt.Color;
import java.sql.DriverManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Clarence
 */
public class Statistiques extends javax.swing.JInternalFrame {

    /**
     * Creates new form Statistiques
     */
    public Statistiques() {
        initComponents();

    }

    public void initComponents() {

        try {
            java.sql.Connection con = null;
            String DBurl = "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking";
            // con = DriverManager.getConnection(DBurl, "root", "");
            con = DriverManager.getConnection(DBurl, "remyjova@projetjava2022", "Remy9999.");

            modelmvc.Connection.affiche("DataBase connected !");
            String query = "SELECT 'Nbre de reservations', 'Lieu' FROM `stats`";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(con, query);
            JFreeChart CategoryDataset;
            dataset = null;
            JFreeChart chart = ChartFactory.createBarChart("Fréquentation des destinations", "Destinations", "Nombre de billets", dataset, PlotOrientation.VERTICAL, true, true, false);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Statistiques", chart);
            frame.setVisible(true);
            frame.setSize(400, 650);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
