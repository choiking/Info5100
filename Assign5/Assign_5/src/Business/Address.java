/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author preet
 */
public class Address {

    private String addressLine;
    private String region;
    private String city;
 
    public Address(String addressLine, String region, String city) {
        this.addressLine = addressLine;
        this.region = region;
        this.city = city;
    }
    
    public String getCity() {    
        return city;
    }
    
    public void setCity(String city) {    
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }
}
