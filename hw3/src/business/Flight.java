/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author sunwe_000
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private String takeOffTime;
    private int price;
    private int avaliSeatNum;
    private String airliner;

    public Flight(String airliner,String flightNum, String from, String to,
            String takeOffTime, int price, int avaliSeatNum) {
        this.airliner = airliner;
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.takeOffTime = takeOffTime;
        this.price = price;
        this.avaliSeatNum = avaliSeatNum;
    }

    public Flight() {
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String Airliner) {
        this.airliner = Airliner;
    }
    
    
    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String FlightNum) {
        this.flightNum = FlightNum;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String From) {
        this.from = From;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String To) {
        this.to = To;
    }

    public String getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(String TakeOffTime) {
        this.takeOffTime = TakeOffTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvaliSeatNum() {
        return avaliSeatNum;
    }

    public void setAvaliSeatNum(int AvaliSeatNum) {
        this.avaliSeatNum = AvaliSeatNum;
    }
    @Override
    public String toString()
    {
        return this.flightNum;
    }
    
}
