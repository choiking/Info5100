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
public class PerformanceDirectory {
  private ArrayList<Performance> performanceList; 

    public PerformanceDirectory() {
        performanceList=new ArrayList<>();
    }

    public ArrayList<Performance> getPerformanceList() {
        return performanceList;
    }

    public void setPerformanceList(ArrayList<Performance> performanceList) {
        this.performanceList = performanceList;
    }
}
