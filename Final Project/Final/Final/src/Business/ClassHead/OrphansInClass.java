/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClassHead;

/**
 *
 * @author Hello
 */
public class OrphansInClass {

    private String id;
    private String firstName;
    private String lastName;
    private PerformanceDirectory performanceDirectory;

    public PerformanceDirectory getPerformanceDirectory() {
        return performanceDirectory;
    }

    public void setPerformanceDirectory(PerformanceDirectory performanceDirectory) {
        this.performanceDirectory = performanceDirectory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

}
