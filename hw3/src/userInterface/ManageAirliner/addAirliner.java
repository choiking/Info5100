/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManageAirliner;

import business.Airliner;
import business.Flight;
import business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author sunwe_000
 */
public class addAirliner extends javax.swing.JPanel {

    /**
     * Creates new form addAirliner
     */
    private TravelAgency travelAgency;
    private JPanel userProcess;
    private Airliner newAir;
    public addAirliner(TravelAgency travelAgency,JPanel userProcess) {
        initComponents();
        this.travelAgency = travelAgency;
        this.userProcess = userProcess;
        
        this.newAir = travelAgency.addAirliner();
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAbbre = new javax.swing.JTextField();
        BtnAddAirliner = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        jLabel1.setText("Add A New Airliner");

        jLabel2.setText("Name:");

        jLabel3.setText("Abbreviation:");

        BtnAddAirliner.setText("Add Airliner");
        BtnAddAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddAirlinerActionPerformed(evt);
            }
        });

        BtnBack.setText("<<Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnBack)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtName)
                            .addComponent(txtAbbre, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(BtnAddAirliner)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAbbre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddAirliner)
                    .addComponent(BtnBack))
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        userProcess.remove(this);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnAddAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddAirlinerActionPerformed
        // TODO add your handling code here:
        
        //set Airliner value
        ArrayList<Flight> flightSchedule = new ArrayList<Flight>();
        newAir.setName(txtName.getText());
        newAir.setAbbr(txtAbbre.getText());
        newAir.setFlightSchedule(flightSchedule);
        //set flightSchedual of Airliner
        userProcess.remove(this);
        Component[] componentArray = userProcess.getComponents();
       Component component = componentArray[componentArray.length - 1];
       display_view dv = (display_view) component;
       dv.populateTable();
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_BtnAddAirlinerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddAirliner;
    private javax.swing.JButton BtnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAbbre;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
