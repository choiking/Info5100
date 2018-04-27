/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrphanageAdmin;

import java.util.ArrayList;

/**
 *
 * @author prach
 */
public class OrphanageDetailsDirectory {
    private ArrayList<OrphanageDetails> orphanageDetailsList;
    
    public OrphanageDetailsDirectory(){
        orphanageDetailsList=new ArrayList<>();
    }

    public ArrayList<OrphanageDetails> getOrphanageDetailsList() {
        return orphanageDetailsList;
    }

    public void setOrphanageDetailsList(ArrayList<OrphanageDetails> childDetailsList) {
        this.orphanageDetailsList = orphanageDetailsList;
    }
    
    public OrphanageDetails createOrphanageDetails(OrphanageDetails od){
       
        orphanageDetailsList.add(od);
        return od;
    }
}
