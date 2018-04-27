/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClassSupervisorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FundsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SchoolWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;




//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartFrame;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.CategoryPlot;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author raunak
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents(); 
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudentdetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Generate report");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        tblStudentdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FirstName", "LastName", "Age", "Class", "Test1", "Test2", "Test3"
            }
        ));
        jScrollPane2.setViewportView(tblStudentdetails);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 600, 80));

        jButton1.setText("Populate data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/nanshengtu/Downloads/WhatsApp Image 2018-04-27 at 1.53.01 AM.jpeg")); // NOI18N
        jLabel6.setText("jLabel1");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 100, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        //DefaultTableModel dtm = 
        int selectedRow = tblStudentdetails.getSelectedRow();
//        String name = tblStudentdetails.getModel().getValueAt(1, 0).toString();
//        String funds = tblStudentdetails.getModel().getValueAt(1, 1).toString();
//        String month = tblStudentdetails.getModel().getValueAt(1, 2).toString();
        String test1 = tblStudentdetails.getValueAt(selectedRow, 4).toString();
        String test2 = tblStudentdetails.getValueAt(selectedRow, 5).toString();
        String test3 = tblStudentdetails.getValueAt(selectedRow, 6).toString();
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(new Integer(test1), "scores", "Test1");
        dataset.setValue(new Integer (test2), "values", "Test2");
        dataset.setValue(new Integer(test3), "values", "Test3");
        
        JFreeChart chart = ChartFactory.createBarChart3D("Test scores", "Tests", "Scores", dataset, PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.YELLOW);
        chart.getTitle().setPaint(Color.RED);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame ("Bar chart for student tests",chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
    
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String OrphanageFile = "data//studentData.csv";
        BufferedReader br = null;
        String line = "";
        String separator = ",";
        try {
            br = new BufferedReader(new FileReader(OrphanageFile));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] details = line.split(separator);
                
                DefaultTableModel dtm = (DefaultTableModel) tblStudentdetails.getModel();
                Object[] row = new Object[7];
                row[0] = details[0];
                row[1] = details[1];
                row[2] = details[3];
                row[3] = details[4];
                row[4] = randomWithRange(0, 100);
                row[5] = randomWithRange(0, 100);
                row[6] = randomWithRange(0, 100);
                dtm.addRow(row);


            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RequestLabTestJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RequestLabTestJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable tblStudentdetails;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}