/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SchoolAdmin;

import java.util.Date;

/**
 *
 * @author Hello
 */
public class OrphanPerformance {
private int performancePercentage;
private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPerformancePercentage() {
        return performancePercentage;
    }

    public void setPerformancePercentage(int performancePercentage) {
        this.performancePercentage = performancePercentage;
    }
}
