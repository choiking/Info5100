package UserInterface.AdminstrativeRole;

import Business.Address;
import Business.AdminDirectory;
import Business.Administrator;
import Business.Retailer;
import Business.RetailerDirectory;
import UserInterface.CustomerRole.BrowseProductsJPanel;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private RetailerDirectory retailerDirectory;
    private AdminDirectory adminDirectory;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,
            RetailerDirectory retailerDirectory, AdminDirectory adminDirectory) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.retailerDirectory = retailerDirectory;
        this.adminDirectory = adminDirectory;
        readFromLocal();
    }

    public void readFromLocal() {
        String adminFile = "src/Data/AdminData.csv";
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(adminFile));
            //skip first line
            br.readLine();
            adminDirectory = new AdminDirectory();
            while ((line = br.readLine()) != null) {
                String[] localData = line.split(",");    
                Administrator admin = adminDirectory.addAdmin();
                admin.setName(localData[0]);
                admin.setPassword(localData[1]);
            }
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        
        // close the file
        if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        
        String retailerFile = "src/Data/RetailerData.csv";
        BufferedReader br2 = null;
        String line2 = "";
        try {
            br2 = new BufferedReader(new FileReader(retailerFile));
            //skip first line
            br2.readLine();
            if (retailerDirectory == null) 
                retailerDirectory = new RetailerDirectory();
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
    
    public RetailerDirectory getRetailerDirectory() {
        return retailerDirectory;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    public void setRetailerDirectory(RetailerDirectory retailerDirectory) {
        this.retailerDirectory = retailerDirectory;
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }

    public void setAdminDirectory(AdminDirectory adminDirectory) {
        this.adminDirectory = adminDirectory;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, -1));

        jLabel2.setText("Admin Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel3.setText("Admin Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        loginBtn.setText("Log in");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        signupBtn.setText("Sign up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 80, -1));

        jLabel4.setText("If you are a new administrator just sign up");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 290, 20));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        AdSignupJPanel sujp = new AdSignupJPanel(userProcessContainer, adminDirectory);
        userProcessContainer.add("AdSignupJPanel",sujp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_signupBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
    
        boolean good = false;
        for(Administrator a: adminDirectory.getAdminList()) {
        String name = txtName.getText();
        String password = String.valueOf(txtPassword.getPassword());
            if (a.getName().equals(name) && a.getPassword().equals(password)){   
                  good = true;
                  //go to next page
                  ManageRetailers b = new ManageRetailers(userProcessContainer, retailerDirectory);
                  userProcessContainer.add("BrowseProductsJPanel", b);
                  CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                  layout.next(userProcessContainer);   
                  break;
            }
        }
        if (!good)
            JOptionPane.showMessageDialog(null, "Please enter correct credentials");
    }//GEN-LAST:event_loginBtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    
}
