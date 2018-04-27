/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SchoolAdmin;

import java.util.ArrayList;

/**
 *
 * @author Hello
 */
public class OrphanageList {
private ArrayList<Orphanage> orphanageList;

    public ArrayList<Orphanage> getOrphanageList() {
        return orphanageList;
    }

    public void setOrphanageList(ArrayList<Orphanage> orphanageList) {
        this.orphanageList = orphanageList;
    }
    public Orphanage createOrphanage(String name,String email,String address){
        Orphanage o = new Orphanage();
        o.setName(name);
        o.setEmail(email);
        o.setAddress(address);
        orphanageList.add(o);
        return o;
    }
}
