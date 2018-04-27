/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrphanageAdmin;

/**
 *
 * @author Hello
 */
public class EachClass {

    private String className;
    private int minAge;
    private int maxAge;
    private int classAveragePerformance;

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

    @Override
    public String toString() {
        return className;
    }
}
