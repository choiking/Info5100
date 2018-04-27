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
public class OrphanDirectory {
 private ArrayList<Orphan> orphanList;   

    public ArrayList<Orphan> getOrphanList() {
        return orphanList;
    }

    public void setOrphanList(ArrayList<Orphan> orphanList) {
        this.orphanList = orphanList;
    }
    public Orphan addOrphan(){
    Orphan o=new Orphan();
    orphanList.add(o);
    return o;
    }
}