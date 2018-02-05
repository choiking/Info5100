/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author sunwe_000
 */
public class TravelAgency {
    private String Name;
    private ArrayList<User> customerDirectory;
    private ArrayList<Flight> masterFlightSchedule;
    private ArrayList<Airliner> airlinerDirectory;
    
    private static BufferedReader x;//Aliner reader
    private static BufferedReader y;//Fight reader

    public TravelAgency() {
        airlinerDirectory= new ArrayList<>();
        masterFlightSchedule= new ArrayList<>();
        customerDirectory = new ArrayList<>();
        
        String AirlinerData="Airliner.csv";
        String flightData="MasterTravelSchedule.csv";
         
        readAirliner(AirlinerData,airlinerDirectory);
        readFlight(flightData,masterFlightSchedule);
        
    }
    
    public User addUser()
    {
        User u = new User();
        customerDirectory.add(u);
        return u;
    }
    
    public Airliner addAirliner()
    {
        Airliner a = new Airliner();
        airlinerDirectory.add(a);
        return a;
    }
    
    public Flight addFlight()
    {
        Flight f = new Flight();
        masterFlightSchedule.add(f);
        return f;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<User> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<User> CustomerDirectory) {
        this.customerDirectory = CustomerDirectory;
    }

    public ArrayList<Flight> getMasterFlightSchedule() {
        return masterFlightSchedule;
    }

    public void setMasterFlightSchedule(ArrayList<Flight> MasterFlightSchedule) {
        this.masterFlightSchedule = MasterFlightSchedule;
    }

    public ArrayList<Airliner> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airliner> AirlinerDirectory) {
        this.airlinerDirectory = AirlinerDirectory;
    }
    
    public static void readAirliner(String filepath,ArrayList<Airliner> AirlinerCatalog)
     {
           try
        {
            x=new BufferedReader (new FileReader(filepath));
            
            //x.useDelimiter("[,\n]");
            String line=null;
            while((line=x.readLine())!=null)
            {
                String item[] = line.split(",");
                String name = item[0];
                String abbr = item[1];
                
                //read flight of the Airliner
                String flightData="MasterTravelSchedule.csv";
                ArrayList<Flight> flights = new ArrayList<Flight>();
                readFlight(flightData,flights,name);
                
                Airliner temp = new Airliner(name,flights,abbr);
                AirlinerCatalog.add(temp);                       
            }
            x.close();
        }
           catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Fail to read from the Airliner file.");
            }
     }
    
    public static void readFlight(String filepath, ArrayList<Flight> flights,String Airliner)
    {
        try
        {
             y=new BufferedReader (new FileReader(filepath));
            
            //x.useDelimiter("[,\n]");
            String line=null;
            while((line=y.readLine())!=null)
            {
                String item[] = line.split(",");
                
                //MasterFlightSchedule.add(f);
                if(item[0].equals(Airliner))
                {
                    Flight f = new Flight(item[0],item[1],item[2],item[3],item[4],Integer.parseInt(item[6]),Integer.parseInt(item[5]));
                    flights.add(f);
                }
            }
            y.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fail to read from the file.");
        }
    }
    public static void readFlight(String filepath, ArrayList<Flight> flights)
    {
        try
        {
             y=new BufferedReader (new FileReader(filepath));
            
            //x.useDelimiter("[,\n]");
            String line=null;
            while((line=y.readLine())!=null)
            {
                String item[] = line.split(",");
                
                    Flight f = new Flight(item[0],item[1],item[2],item[3],item[4],Integer.parseInt(item[6]),Integer.parseInt(item[5]));
                    flights.add(f);
            }
            y.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fail to read from the file.");
        }
    }
}
