/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author preet
 */
public class RetailerDirectory {

    private ArrayList<Retailer> retailerList;

    public RetailerDirectory() {

        retailerList = new ArrayList<Retailer>();
    }

    public ArrayList<Retailer> getRetailerList() {
        return retailerList;
    }
    
    public Retailer addRetailer() {
        Retailer retailer = new Retailer();
        retailerList.add(retailer);
        return retailer;
    }
    
    public void removeRetailer(Retailer retailer) {
        retailerList.remove(retailer);
    }
    
    
    public ArrayList<Retailer> searchRetailerByRegion(String region) {
        ArrayList<Retailer> newList = new ArrayList<> ();
        for (Retailer retailer : retailerList) {
            if (retailer.getRegion() == region) 
                newList.add(retailer);
        }
        return newList;
    }
}
