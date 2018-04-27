/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CompanyAdmin;

import java.util.ArrayList;

/**
 *
 * @author nanshengtu
 */
public class DonationList {
    
    private ArrayList<Donation> donationList;

    public DonationList() {
        this.donationList = new ArrayList<>();
    }

    public ArrayList<Donation> getDonationList() {
        return donationList;
    }

    public void setDonationList(ArrayList<Donation> donationList) {
        this.donationList = donationList;
    }
    
    
    public void addDonation(Donation donation) {
        
        donationList.add(donation);
    }
    
    
}
