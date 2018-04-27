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
public class ClassSupervisorList {
 private ArrayList<ClassSupervisor> supervisorList;   

    public ClassSupervisorList() {
        supervisorList=new ArrayList();
    }

    public ArrayList<ClassSupervisor> getSupervisorList() {
        return supervisorList;
    }

    public void setSupervisorList(ArrayList<ClassSupervisor> supervisorList) {
        this.supervisorList = supervisorList;
    }
    public ClassSupervisor addClassSupervisor(ClassSupervisor cs){
    supervisorList.add(cs);
    return cs;
    }
}
