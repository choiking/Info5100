/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManageAirliner;

import business.Airliner;
import business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunwe_000
 */
public class display_view extends javax.swing.JPanel {

    /**
     * Creates new form display_view
     */
    private JPanel userProcess;
    private TravelAgency travelAgency;
    
    public display_view(JPanel userProcess, TravelAgency travelAgency) {
        initComponents();
        this.travelAgency = travelAgency;
        this.userProcess = userProcess;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirliner = new javax.swing.JTable();
        SelectViewBtn = new javax.swing.JButton();
        AddNewBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        jLabel1.setText("Airliner Information");

        tblAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Abbreviation", "Number of Flights"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAirliner);
        if (tblAirliner.getColumnModel().getColumnCount() > 0) {
            tblAirliner.getColumnModel().getColumn(0).setResizable(false);
            tblAirliner.getColumnModel().getColumn(1).setResizable(false);
            tblAirliner.getColumnModel().getColumn(2).setResizable(false);
        }

        SelectViewBtn.setText("Select and View");
        SelectViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectViewBtnActionPerformed(evt);
            }
        });

        AddNewBtn.setText("Add New Airliner");
        AddNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("<<Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SelectViewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddNewBtn)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectViewBtn)
                    .addComponent(AddNewBtn))
                .addGap(18, 18, 18)
                .addComponent(BackBtn)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblAirliner.getModel();
        dtm.setRowCount(0);
        
        for(Airliner a : travelAgency.getAirlinerDirectory())
        {
            Object row[] = new Object[3];
            row[0] = a;
            row[1] = a.getAbbr();
            row[2] = a.getFlightSchedule().size();
            
            dtm.addRow(row);            
        }        
    }

    private void SelectViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectViewBtnActionPerformed
        // TODO add your handling code here:
        int selected = tblAirliner.getSelectedRow();
        if(selected >=0)
        {
            Airliner airliner = (Airliner) tblAirliner.getValueAt(selected, 0);
            for(Airliner a : travelAgency.getAirlinerDirectory())
            {
                if(airliner.getName().equals(a.getName()))
                {
                    viewDetail_update panel = new viewDetail_update(userProcess,a);
                    userProcess.add("CustomerManage",panel);
                    CardLayout layout = (CardLayout) userProcess.getLayout();
                    layout.next(userProcess);
                }
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Please select a row");

    }//GEN-LAST:event_SelectViewBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        userProcess.remove(this);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void AddNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewBtnActionPerformed
        // TODO add your handling code here:
        addAirliner panel = new addAirliner(travelAgency,userProcess);
        userProcess.add("addNewAirliner",panel);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_AddNewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton SelectViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAirliner;
    // End of variables declaration//GEN-END:variables
}
