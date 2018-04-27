/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SchoolAdmin;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Hello
 */
public class OrphanPerformanceDirectory {
 private ArrayList<OrphanPerformance> performanceList;  

    public ArrayList<OrphanPerformance> getPerformanceList() {
        return performanceList;
    }

    public void setPerformanceList(ArrayList<OrphanPerformance> performanceList) {
        this.performanceList = performanceList;
    }
    public OrphanPerformance addPerformance(int performancePercentage,Date date){
        OrphanPerformance performance = new OrphanPerformance();
        performance.setPerformancePercentage(performancePercentage);
        performance.setDate(date);
        performanceList.add(performance);
        return performance;
    }
}
