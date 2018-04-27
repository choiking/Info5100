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
public class ChildDetailsDirectory {
 
    private ArrayList<ChildDetails> childDetailsList;
    
    public ChildDetailsDirectory(){
        childDetailsList=new ArrayList<>();
    }

    public ArrayList<ChildDetails> getChildDetailsList() {
        return childDetailsList;
    }

    public void setChildDetailsList(ArrayList<ChildDetails> childDetailsList) {
        this.childDetailsList = childDetailsList;
    }
    
    public ChildDetails createChildDetails(ChildDetails cd){
       
        childDetailsList.add(cd);
        return cd;
    }
}
