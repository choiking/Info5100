/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.OrphanageAdmin.AdopterDetailsDirectory;
import Business.OrphanageAdmin.ChildDetailsDirectory;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author MyPC1
 */
public class OrphanageEnterprise extends Enterprise {
    
    
    private ChildDetailsDirectory cdd;
    private AdopterDetailsDirectory add;
    
    public OrphanageEnterprise(String name){
        super(name,EnterpriseType.Orphanage);
        this.add = new AdopterDetailsDirectory();
        this.cdd = new ChildDetailsDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ChildDetailsDirectory getCdd() {
        return cdd;
    }

    public void setCdd(ChildDetailsDirectory cdd) {
        this.cdd = cdd;
    }

    public AdopterDetailsDirectory getAdd() {
        return add;
    }

    public void setAdd(AdopterDetailsDirectory add) {
        this.add = add;
    }
    
    
    
}
