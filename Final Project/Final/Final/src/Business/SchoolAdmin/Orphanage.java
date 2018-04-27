/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SchoolAdmin;

/**
 *
 * @author Hello
 */
public class Orphanage {
   private String name;
   private String address;
   private String email;
   private static int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Orphanage.id = id;
    }
    @Override
    public String toString(){
    return name;
    }
}
