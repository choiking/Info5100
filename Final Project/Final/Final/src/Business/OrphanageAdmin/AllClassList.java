/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrphanageAdmin;

import java.util.ArrayList;

/**
 *
 * @author Hello
 */
public class AllClassList {
  private ArrayList<EachClass> allClassList;  

    public AllClassList() {
        allClassList=new ArrayList<>();
    }

    public ArrayList<EachClass> getAllClassList() {
        return allClassList;
    }

    public void setAllClassList(ArrayList<EachClass> allClassList) {
        this.allClassList = allClassList;
    }
     public EachClass addClass(EachClass ec) {
        allClassList.add(ec);
        return ec;
    }
}
