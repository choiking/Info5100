/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author samsamtu
 */
public class vitalSignHistory {
    private ArrayList<vitalSigns> vitalSignHistory;
    
    public vitalSignHistory () {
        vitalSignHistory = new ArrayList();
    }

    public ArrayList<vitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<vitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public vitalSigns addVitals() {
       vitalSigns vs = new vitalSigns();
       vitalSignHistory.add(vs);
       return vs;
}
    public void deleteVitals(vitalSigns vs) {
       vitalSignHistory.remove(vs);
}
}
