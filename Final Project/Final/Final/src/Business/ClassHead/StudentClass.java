/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClassHead;

import java.util.ArrayList;

/**
 *
 * @author Hello
 */
public class StudentClass {

    private String className;
    private int minAge;
    private int maxAge;
    private int classAveragePerformance;
    private ArrayList<OrphansInClass> orphanList;

    public StudentClass() {
        orphanList=new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getClassAveragePerformance() {
        return classAveragePerformance;
    }

    public void setClassAveragePerformance(int classAveragePerformance) {
        this.classAveragePerformance = classAveragePerformance;
    }

    public ArrayList<OrphansInClass> getOrphanList() {
        return orphanList;
    }

    public void setOrphanList(ArrayList<OrphansInClass> orphanList) {
        this.orphanList = orphanList;
    }

}
