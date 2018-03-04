package UserInterface.RetailerRole;

import Business.Retailer;
import Business.RetailerDirectory;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginRetailerJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private RetailerDirectory retailerDirectory;
    public LoginRetailerJPanel(JPanel userProcessContainer, RetailerDirectory sd) {
        initComponents();
  
        this.userProcessContainer = userProcessContainer;  
        this.retailerDirectory = sd;
        if (retailerDirectory.getRetailerList().isEmpty()) {
            readFromLocal();
        }
        retailerComboBox.removeAllItems();
        for (Retailer supplier : retailerDirectory.getRetailerList()) {
                retailerComboBox.addItem(supplier);
        }
        
        
    }
    
    public void readFromLocal() {
        String retailerFile = "src/Data/RetailerData.csv";
        BufferedReader br2 = null;
        String line2 = "";
        try {
            br2 = new BufferedReader(new FileReader(retailerFile));
            //skip first line
            br2.readLine();
            while ((line2 = br2.readLine()) != null) {
                String[] localData = line2.split(",");    
                Retailer retailer = retailerDirectory.addRetailer();
                retailer.setRetailerName(localData[0]);
                retailer.setPassword(localData[1]);
                retailer.setRegion(localData[2]);
            }
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        
        // close the file
        if (br2 != null) {
                try {
                    br2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        retailerComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGo.setText("GO>>");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Retailer Login");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        retailerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(retailerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Retailer Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, -1));
    }// </editor-fold>//GEN-END:initComponents
  
    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        
         boolean good = false;
        for(Retailer r: retailerDirectory.getRetailerList()) {
        String name = retailerComboBox.getSelectedItem().toString();
        String password = String.valueOf(txtPassword.getPassword());
            if (r.getRetailerName().equals(name) && r.getPassword().equals(password)){   
                  good = true;
                  //go to next page
                   Retailer retailer = (Retailer) retailerComboBox.getSelectedItem();
                   RetailerWorkAreaJPanel swajp = new RetailerWorkAreaJPanel(userProcessContainer, retailer);
                   userProcessContainer.add("SupplierWorkAreaJPanel", swajp);
                   CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                   layout.next(userProcessContainer); 
                  break;
            }
        }
        if (!good)
            JOptionPane.showMessageDialog(null, "Please enter correct credentials"); 
    }//GEN-LAST:event_btnGoActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox retailerComboBox;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    
}
