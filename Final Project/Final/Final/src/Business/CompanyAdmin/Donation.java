/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CompanyAdmin;

/**
 *
 * @author nanshengtu
 */
public class Donation {
    
   
    int quantity;
    private int id;
    private static int count = 1;

    public Donation(int quantity) {
        id = count;
        count++;
        this.quantity = quantity;
    }

   
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    @Override
    public String toString() {
        return id + "";
    }
    
    
    
    
    
}
