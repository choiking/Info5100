/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrphanageAdmin;

/**
 *
 * @author prach
 */
public class AdopterDetails {
    
    private int id;
    private String firstName;
    private String lastName;
    private String contactNum;
    private String salary;
    //private String childName;
    private String address;
    private static int count=1;
    
    public AdopterDetails(){
        id=count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

//    public String getChildName() {
//        return childName;
//    }
//
//    public void setChildName(String childName) {
//        this.childName = childName;
//    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return firstName;
    }
}
