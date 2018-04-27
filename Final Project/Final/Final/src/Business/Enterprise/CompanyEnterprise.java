/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.CompanyAdmin.DonationList;
import Business.Role.Role;
import Business.SchoolAdmin.AllClassList;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class CompanyEnterprise extends Enterprise {
    
    
    private DonationList donationList;
   
    
    public CompanyEnterprise(String name){
        super(name,EnterpriseType.Company);
        this.donationList = new DonationList();
    }
    
    
    public DonationList getDonationList() {
        return donationList;
    }

    public void setDonationList(DonationList donationList) {
        this.donationList = donationList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
