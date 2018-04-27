/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.TravelAgency;
import java.awt.CardLayout;
import userInterface.ManageAirliner.display_view;
import userInterface.ManageCustomer.search_display;
import userInterface.ManageTravelAgency.manageTravelAgency;

/**
 *
 * @author sunwe_000
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgencyMain
     */
    private TravelAgency travelAgency;
    public TravelAgencyMain() {
        initComponents();
        this.travelAgency = new TravelAgency();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        BtnManageTravelAgency = new javax.swing.JButton();
        BtnManageAirliner = new javax.swing.JButton();
        BtnManageCustomer = new javax.swing.JButton();
        userProcess = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 399));

        jSplitPane1.setDividerLocation(200);

        BtnManageTravelAgency.setText("Manage Travel Agency");
        BtnManageTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageTravelAgencyActionPerformed(evt);
            }
        });

        BtnManageAirliner.setText("Manage Airliners");
        BtnManageAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageAirlinerActionPerformed(evt);
            }
        });

        BtnManageCustomer.setText("Manage Customer");
        BtnManageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnManageCustomer)
                    .addComponent(BtnManageAirliner)
                    .addComponent(BtnManageTravelAgency))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BtnManageTravelAgency)
                .addGap(28, 28, 28)
                .addComponent(BtnManageAirliner)
                .addGap(30, 30, 30)
                .addComponent(BtnManageCustomer)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcess.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcess);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnManageTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageTravelAgencyActionPerformed
        // TODO add your handling code here:
        manageTravelAgency panel = new manageTravelAgency(userProcess,travelAgency);
        userProcess.add("travelAgencyManage",panel);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_BtnManageTravelAgencyActionPerformed

    private void BtnManageAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageAirlinerActionPerformed
        // TODO add your handling code here:
        display_view panel = new display_view(userProcess,travelAgency);
        userProcess.add("AirlinerManage",panel);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_BtnManageAirlinerActionPerformed

    private void BtnManageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageCustomerActionPerformed
        // TODO add your handling code here:
        search_display panel = new search_display(userProcess,travelAgency);
        userProcess.add("CustomerManage",panel);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_BtnManageCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnManageAirliner;
    private javax.swing.JButton BtnManageCustomer;
    private javax.swing.JButton BtnManageTravelAgency;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel userProcess;
    // End of variables declaration//GEN-END:variables
}
