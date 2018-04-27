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
public class AdopterDetailsDirectory {
    
    private ArrayList<AdopterDetails> adopterDetailsList;
    
    public AdopterDetailsDirectory(){
        adopterDetailsList=new ArrayList();
    }

    public ArrayList<AdopterDetails> getAdopterDetailsList() {
        return adopterDetailsList;
    }
    
    public AdopterDetails addAdopterDetails(AdopterDetails ad){
        
        adopterDetailsList.add(ad);
        return ad;
    }
}
