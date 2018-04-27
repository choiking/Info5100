/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OrphanageRole;

import Business.Organization.OrganizationDirectory;
import Business.OrphanageAdmin.AllClassList;
import Business.OrphanageAdmin.EachClass;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hello
 */
public class ManageClassesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageClassesJPanel
     */
    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory;
    AllClassList acl;

    public ManageClassesJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory) {
       initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.organizationDirectory=organizationDirectory;
        this.acl=acl;
        this.userProcessContainer=userProcessContainer;
   
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
        tblClass = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClassName = new javax.swing.JTextField();
        txtMinAge = new javax.swing.JTextField();
        txtMaxAge = new javax.swing.JTextField();
        txtIQ = new javax.swing.JTextField();
        btnCreateClass = new javax.swing.JButton();

        jLabel1.setText("Manage Classes");

        tblClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class Name", "Min age", "Max Age", "IQ required"
            }
        ));
        jScrollPane1.setViewportView(tblClass);

        jLabel2.setText("Enter Class name");

        jLabel3.setText("Enter Min age of Student");

        jLabel4.setText("Enter Max Age of Student");

        jLabel5.setText("Enter IQ required for this class");

        btnCreateClass.setText("Create");
        btnCreateClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateClassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMinAge, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txtClassName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaxAge)
                            .addComponent(txtIQ, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreateClass)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMinAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtIQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateClass)
                .addContainerGap(239, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateClassActionPerformed
        // TODO add your handling code here:
        
    EachClass ec =new EachClass();
    EachClass ea=acl.addClass(ec);
    ea.setClassName(txtClassName.getText());
    ea.setMinAge(Integer.parseInt(txtMinAge.getText()));
    ea.setMaxAge(Integer.parseInt(txtMaxAge.getText()));
    ea.setClassAveragePerformance(Integer.parseInt(txtIQ.getText()));
    refreshTable();
    }//GEN-LAST:event_btnCreateClassActionPerformed
public void refreshTable(){
DefaultTableModel dtm=(DefaultTableModel)tblClass.getModel();
 dtm.setRowCount(0);
        
        for (EachClass ec : acl.getAllClassList()){
            Object[] row = new Object[4];
            row[0] = ec;
            row[1] = ec.getMinAge();
            row[2]=ec.getMaxAge();
            row[3]=ec.getClassAveragePerformance();
            dtm.addRow(row);
        }

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClass;
    private javax.swing.JTextField txtClassName;
    private javax.swing.JTextField txtIQ;
    private javax.swing.JTextField txtMaxAge;
    private javax.swing.JTextField txtMinAge;
    // End of variables declaration//GEN-END:variables
}
