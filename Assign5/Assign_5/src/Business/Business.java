/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Hello
 */


public class Business {
    private RetailerDirectory retailerDirectory;
    
    private MasterOrderCatalog masterOrderCatalog;
    
    private AdminDirectory adminDirectory;
    
    private CustomerDirectory customerDirectory;

    public Business() {
        retailerDirectory = new RetailerDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        adminDirectory = new AdminDirectory();
        customerDirectory = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
    
    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }

    public void setAdminDirectory(AdminDirectory adminDirectory) {
        this.adminDirectory = adminDirectory;
    }
    
    
    public RetailerDirectory getRetailerDirectory() {
        return retailerDirectory;
    }

    public void setRetailerDirectory(RetailerDirectory retailerDirectory) {
        this.retailerDirectory = retailerDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }
   


}
