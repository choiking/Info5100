/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataHistory;

import java.util.Date;

/**
 *
 * @author samsamtu
 */
public class Car {
    private int seatsNum;
    private int serialNum;
    private String company;
    private boolean uber;
    private int manufactureYear;
    private int modelNum;
    private String availTime;
    private String city;
    private String expiredTime;
    private String updateTime;

    public String getAvailTime() {
        return availTime;
    }

    public void setAvailTime(String availTime) {
        this.availTime = availTime;
    }
   

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String isExpired) {
        this.expiredTime = isExpired;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isUber() {
        return uber;
    }

    public void setUber(boolean isBoeing) {
        this.uber = isBoeing;
    }
    
    public  String toString() {
         return Integer.toString(this.serialNum);
    }
}
