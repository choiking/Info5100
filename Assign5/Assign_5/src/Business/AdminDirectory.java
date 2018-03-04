/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author samsamtu
 */
public class AdminDirectory {
    private ArrayList<Administrator> adminList;
    
    public AdminDirectory() {
        adminList = new ArrayList<> ();
    }

    public ArrayList<Administrator> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<Administrator> adminList) {
        this.adminList = adminList;
    }

    
      
    public Administrator addAdmin() {
        Administrator a = new Administrator();
        adminList.add(a);
        return a;
    }
    
    public void removeAdmin(Administrator a) {
        adminList.remove(a);
    }
}
