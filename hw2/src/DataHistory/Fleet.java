/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataHistory;

import java.util.ArrayList;

/**
 *
 * @author samsamtu
 */
public class Fleet {
    private ArrayList<Car> fleet;
    
    public Fleet () {
        fleet = new ArrayList();
    }

    public ArrayList<Car> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Car> fleet) {
        this.fleet = fleet;
    }
 
    
    public void addCar(Car car) {
       //Plane plane = new Car();
       fleet.add(car);
}
    public void deleteCar(Car car) {
       fleet.remove(car);
}
   
}
