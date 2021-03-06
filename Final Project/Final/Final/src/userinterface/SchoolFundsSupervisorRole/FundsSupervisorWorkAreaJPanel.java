/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SchoolFundsSupervisorRole;

import Business.EcoSystem;
import Business.Organization.FundsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OTSWorkRequest;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class FundsSupervisorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private FundsOrganization labOrganization;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public FundsSupervisorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (FundsOrganization) organization;

        populateTable();
    }
    
    
    public String[] extractData(String path) {
       
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
        return data;
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? "Waiting" : request.getReceiver();
            row[3] = request.getStatus();

            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        seeBtn = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblorphanageDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 590, 80));

        seeBtn.setText("See Orphanage Details");
        seeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeBtnActionPerformed(evt);
            }
        });
        add(seeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        tblorphanageDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrphanageName", "Address", "EmailID", "PhoneNumber", "Funds", "NumberOfStudents"
            }
        ));
        jScrollPane2.setViewportView(tblorphanageDetails);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 600, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/nanshengtu/Downloads/WhatsApp Image 2018-04-27 at 1.53.01 AM.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void seeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        String s = workRequestJTable.getValueAt(selectedRow, 0).toString();
        String orfundsPath = extractData(s)[2];
       
    
        
        BufferedReader br = null;
        String line = "";
        String separator = ",";
        try {
            br = new BufferedReader(new FileReader(orfundsPath));
            br.readLine();//skip the first line
            while ((line = br.readLine()) != null) {
                String[] details = line.split(separator);
                DefaultTableModel dtm = (DefaultTableModel) tblorphanageDetails.getModel();
                Object[] row = new Object[6];
                row[0] = details[0];
                row[1] = details[1];
                row[2] = details[2];
                row[3] = details[3];
                row[4] = details[4];
                row[5] = details[5];
                dtm.addRow(row);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FundsSupervisorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FundsSupervisorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_seeBtnActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = tblorphanageDetails.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

//        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
//     
//        request.setStatus("Processing");
//        
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        
        request.setStatus("Completed!!");
        request.setReceiver(userAccount);

        int numberOfStudents = Integer.parseInt(tblorphanageDetails.getValueAt(selectedRow, 5).toString());
        Double funds = Double.parseDouble(tblorphanageDetails.getValueAt(selectedRow, 4).toString());
        Double fundForEachChild = 1000.00;
        Double fundsRequired = numberOfStudents * fundForEachChild;
        Double fundsDue = fundsRequired - funds;
        String email = tblorphanageDetails.getValueAt(selectedRow, 2).toString();
        String orphanageName = tblorphanageDetails.getValueAt(selectedRow, 0).toString();

        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, numberOfStudents, funds, fundsDue, fundsRequired, email, orphanageName);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton seeBtn;
    private javax.swing.JTable tblorphanageDetails;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
