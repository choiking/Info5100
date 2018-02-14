/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManageAirliner;

import business.Airliner;
import business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sunwe_000
 */
public class update extends javax.swing.JPanel {

    /**
     * Creates new form update
     */
    private JPanel userProcess;
    private Flight flight;
    private Airliner airliner;
    
    public update(JPanel userProcess,Flight flight,boolean update,Airliner airliner) {
        initComponents();
        this.userProcess = userProcess;
        this.flight = flight;
        this.airliner = airliner;
        if(update)
        {
            BtnAdd.setEnabled(false);
            BtnUpdate.setEnabled(true);
            txtFlightNum.setText(flight.getFlightNum());
            txtFrom.setText(flight.getFrom());
            txtTo.setText(flight.getTo());
            txtPrice.setText(String.valueOf(flight.getPrice()));
            txtTakeOffTime.setText(flight.getTakeOffTime());
        }
        else
        {
            BtnAdd.setEnabled(true);
            BtnUpdate.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        txtTakeOffTime = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        BtnBack = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        jLabel1.setText("Update Flight");

        jLabel2.setText("Flight Number:");

        jLabel3.setText("From:");

        jLabel4.setText("To:");

        jLabel5.setText("Take Off:");

        jLabel6.setText("Price:");

        txtTakeOffTime.setText("MM/DD/YYYY");

        BtnBack.setText("<<Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(BtnBack)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtFlightNum)
                        .addComponent(txtFrom)
                        .addComponent(txtTo)
                        .addComponent(txtTakeOffTime)
                        .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BtnUpdate)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTakeOffTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack)
                    .addComponent(BtnAdd)
                    .addComponent(BtnUpdate))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getherInfo(Flight flight)
    {
        flight.setFlightNum(txtFlightNum.getText());
        flight.setAirliner(airliner.getName());
        flight.setFrom(txtFrom.getText());
        flight.setTo(txtTo.getText());
        flight.setAvaliSeatNum(150);
        flight.setPrice(Integer.parseInt(txtPrice.getText()));
        flight.setTakeOffTime(txtTakeOffTime.getText());
    }
    private void validateInput()
    {
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
        
        try {
            sdf.parse(txtTakeOffTime.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please input the date as shown in the textfield!");
            txtTakeOffTime.setText("MM/DD/YYYY");
            return ;
        }
        String str = txtPrice.getText();
        if (str.length()<=0)
        {
            JOptionPane.showMessageDialog(null, "Please input an integer!");
            return;
        }       
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){                  
                txtPrice.setText("");  
                JOptionPane.showMessageDialog(null, "Please input an integer!");
                return;
            }  
        }
    }
    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        validateInput();
        getherInfo(flight);
        userProcess.remove(this);
        
        //refresh
        Component[] componentArray = userProcess.getComponents();
       Component component = componentArray[componentArray.length - 1];
       viewDetail_update vdu = (viewDetail_update) component;
       vdu.populateTable();
       
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        userProcess.remove(this);
        
        //refresh
        Component[] componentArray = userProcess.getComponents();
       Component component = componentArray[componentArray.length - 1];
       viewDetail_update vdu = (viewDetail_update) component;
       vdu.populateTable();
       
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        validateInput();
        airliner.getFlightSchedule().remove(flight);
        Flight f = airliner.addFlight();
        getherInfo(f);
         userProcess.remove(this);
         
         //refresh
        Component[] componentArray = userProcess.getComponents();
       Component component = componentArray[componentArray.length - 1];
       viewDetail_update vdu = (viewDetail_update) component;
       vdu.populateTable();
       
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_BtnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtFlightNum;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTakeOffTime;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}