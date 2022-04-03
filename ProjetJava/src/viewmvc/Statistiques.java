/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package viewmvc;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Clarence
 */
public class Statistiques extends javax.swing.JInternalFrame {

    /**
     * Creates new form Statistiques
     */
    public Statistiques() throws SQLException, ClassNotFoundException, IOException {
        initComponents();

    }

    public void initComponents() throws ClassNotFoundException, SQLException, IOException {

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
      
      /*String lieu[] = {
         "Paris","new York","Londres","Berlin","Tokyo","Jakarta","Gotham","Pekin","MarsCity","Los Angeles","Wuhan","Marseille"
      };
      
      /* Create MySQL Database Connection */
     /* Class.forName( "com.mysql.jdbc.Driver" );
      Connection connect = DriverManager.getConnection( 
         "jdbc:mysql://projetjava2022.mysql.database.azure.com:3306/booking" ,     
         "remyjova@projetjava2022",     
         "Remy9999.");
      
      Statement statement = connect.createStatement( );
      ResultSet resultSet = statement.executeQuery("SELECT 'Nbre de reservations', 'Lieu' FROM `stats`" );
      DefaultPieDataset dataset = new DefaultPieDataset( );
      
      while( resultSet.next( ) ) {
         dataset.setValue( 
         resultSet.getString( "Destinations" ) ,
         Double.parseDouble( resultSet.getString( "Nombre de billets" )));
      }
      
      JFreeChart chart = ChartFactory.createPieChart(
         "Fréquentation des destinations",   // chart title           
         dataset,          // data           
         true,             // include legend          
         true,           
         false );

      int width = 560;    /* Width of the image */
      /*int height = 370;   /* Height of the image */ 
      /*File pieChart = new File( "Pie_Chart.jpeg" );
      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
   }
}*/
    



/*DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
JFreeChart chart = ChartFactory.createBarChart("Fréquentation des destinations", "Destinations", "Nombre de billets", dataset, PlotOrientation.VERTICAL, true, true, false);
CategoryPlot barchart = barChart.getCategoryPlot();
barchart.setRangeGridlinePaint(color.BLACK);

ChartPanel barPanel = new ChartPanel(barChart);
panelChart.removeAll();
panelChart.add(barPanel,BorderLayout.CENTER);
panelChart.validate();*/



