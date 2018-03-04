/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package UserInterface.CustomerRole;

import Business.Address;
import Business.AdminDirectory;
import Business.Administrator;
import Business.Customer;
import Business.CustomerDirectory;
import Business.MasterOrderCatalog;
import Business.Retailer;
import Business.RetailerDirectory;
import UserInterface.RetailerRole.LoginRetailerJPanel;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;







/**
 *
 * @author Rushabh
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /** Creates new form ProductManagerWorkAreaJPanel */
    private JPanel userProcessContainer;
    private RetailerDirectory retailerDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private CustomerDirectory customerDirectory;

    
    
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, RetailerDirectory retailerDirectory, MasterOrderCatalog masterOrderCatalog, CustomerDirectory customerDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.retailerDirectory = retailerDirectory;
        this.masterOrderCatalog = masterOrderCatalog;
        this.customerDirectory = customerDirectory;
        //readFromLocal();
    }
    
  
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("My Work Area (Customer Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Vijaya", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/bestbuy.gif"))); // NOI18N
        jLabel2.setText("Welcome To Please Buy !");
        jLabel2.setIconTextGap(7);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 470, -1));

        jLabel3.setText("User Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 120, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 150, -1));

        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        signupBtn.setText("Sign up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 80, -1));

        jLabel5.setText("If you are a new user, just sign up");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 280, 20));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Boolean good = false;
        String region = "";
        List<Retailer> retailerList = new ArrayList<>();
        for(Customer c: customerDirectory.getCustomerList()) {
        String usrname = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());
            if (c.getCustName().equals(usrname) && c.getPassword().equals(password)){
                  Address a = c.getAddress();
                  if (a != null) {
                    region = a.getRegion();
                    retailerList = retailerDirectory.searchRetailerByRegion(region);
                  }
                  else {//return all the retailers
                      retailerList = retailerDirectory.getRetailerList();
                  }
                  BrowseProductsJPanel b = new BrowseProductsJPanel(userProcessContainer, retailerList, masterOrderCatalog, customerDirectory, c);
                  userProcessContainer.add("BrowseProductsJPanel", b);
                  CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                  layout.next(userProcessContainer);  
                  good = true;
                  break;
            }
        }
        if (!good) {
            JOptionPane.showMessageDialog(null, "Please input username and password correctly"); 
        }
     
    }//GEN-LAST:event_btnLoginActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        CustomerSignupJPanel c = new CustomerSignupJPanel(userProcessContainer, customerDirectory);
        userProcessContainer.add("CustomerSignupJPanel", c);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_signupBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton signupBtn;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
