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
public class ClassHead {

    private String headID;
    private String name;
    private String email;
    private String phoneNum;
    private StudentClass classDetails;

    public ClassHead() {
        classDetails = new StudentClass();
    }

    public String getHeadID() {
        return headID;
    }

    public void setHeadID(String headID) {
        this.headID = headID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public StudentClass getClassDetails() {
        return classDetails;
    }

    public void setClassDetails(StudentClass classDetails) {
        this.classDetails = classDetails;
    }
}
