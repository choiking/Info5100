/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author sunwe_000
 */
public class Airliner {
    private String name;
    private ArrayList<Flight> flightSchedule;
    private String abbr;

    public Airliner() {
    }

    
    public Airliner(String name, ArrayList<Flight> flightSchedule, String abbr) {
        this.name = name;
        this.flightSchedule = flightSchedule;
        this.abbr = abbr;
    }
     public Flight addFlight()
     {
         Flight flight = new Flight();
         this.getFlightSchedule().add(flight);
         return flight;
     }
    
    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public ArrayList<Flight> getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(ArrayList<Flight> flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }
    
     @Override
    public String toString()
    {
        return this.name;
    }
    
}
