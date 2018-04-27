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
public class Orphan {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int id;
    private static int counter = 1;
    private Orphanage orphanageDetails;
    private OrphanPerformanceDirectory performanceDirectory;
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Orphan() {
        id = counter;
        ++counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Orphanage getOrphanageDetails() {
        return orphanageDetails;
    }

    public void setOrphanageDetails(Orphanage orphanageDetails) {
        this.orphanageDetails = orphanageDetails;
    }

    public OrphanPerformanceDirectory getPerformanceDirectory() {
        return performanceDirectory;
    }

    public void setPerformanceDirectory(OrphanPerformanceDirectory performanceDirectory) {
        this.performanceDirectory = performanceDirectory;
    }
    @Override
    public String toString(){
    return String.valueOf(id);
    }

}
