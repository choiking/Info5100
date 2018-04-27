/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SchoolRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.SchoolEnterprise;
import Business.Organization.OrganizationDirectory;
import Business.SchoolAdmin.AllClassList;
import Business.SchoolAdmin.OrphanageList;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OTSWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hello
 */
public class RequestFromOrphanageJPanel extends javax.swing.JPanel {
    
    
    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory;
    AllClassList acl;
    OrphanageList oll;
    UserAccount account;
    SchoolEnterprise enterprise;

    /**
     * Creates new form RequestFromOrphanageJPanel
     */
    public RequestFromOrphanageJPanel(JPanel userProcessContainer, OrganizationDirectory 
            organizationDirectory, AllClassList acl, OrphanageList oll, UserAccount account, Enterprise enterprise) {   
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.acl = acl;
        this.oll = oll;
        this.enterprise = (SchoolEnterprise)enterprise;
        this.account = account;
        populatetable();
    }
    
    
    private void populatetable() {
        
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            OTSWorkRequest r = (OTSWorkRequest)request;
            
            Object[] row = new Object[4];
            row[0] = r;
            row[1] = r.getSender();
            row[2] = r.getReceiver();
            row[3] = r.getStatus();    
            model.addRow(row);
        }
        
    
    }
    
    
    
    public void extractData() {
    
        String path = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();         
        String[] data = new String[3];
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(path));
            int i = 0;
            while ((line = br.readLine()) != null) {
                data[i++] = line;  
            }

        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } 
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        sendBtn = new javax.swing.JButton();
        manageBtn = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "receiver", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        assignBtn.setText("Assign it to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        sendBtn.setText("Send Orphanage Details to FundSupervisor");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        manageBtn.setText("Manage OrphanJPanel");
        manageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBtnActionPerformed(evt);
            }
        });

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/nanshengtu/Downloads/WhatsApp Image 2018-04-27 at 1.53.01 AM.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refreshBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(172, 172, 172)
                                            .addComponent(assignBtn)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sendBtn)
                .addGap(204, 204, 204))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(manageBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(refreshBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(assignBtn)
                .addGap(30, 30, 30)
                .addComponent(sendBtn)
                .addGap(31, 31, 31)
                .addComponent(manageBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(backjButton1)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
       
        OTSWorkRequest request = (OTSWorkRequest)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        
        SendOrphanageDetailsToFundSupervisor s = new SendOrphanageDetailsToFundSupervisor(userProcessContainer, organizationDirectory, account, request);
        userProcessContainer.add("s", s);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_sendBtnActionPerformed

    private void manageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBtnActionPerformed
        // TODO add your handling code here:
        OTSWorkRequest request = (OTSWorkRequest)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        ManageOrphanageJPanel m = new ManageOrphanageJPanel(userProcessContainer, organizationDirectory, acl, oll, account, request);
        userProcessContainer.add("m", m);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populatetable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        OTSWorkRequest request = (OTSWorkRequest)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        
        request.setReceiver(account);
        
        request.setStatus("Completed!!");
        
        
        populatetable();
        
        
        
    }//GEN-LAST:event_assignBtnActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton manageBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton sendBtn;
    // End of variables declaration//GEN-END:variables
}