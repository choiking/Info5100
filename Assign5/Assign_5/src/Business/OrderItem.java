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
public class OrderItem {

    private int quantity;
    private double salesPrice;
    private Product product;
    
    public OrderItem(Product product, int quantity, double salesPrice) {
    
        this.product = product;
        this.quantity = quantity;
        this.salesPrice = salesPrice;
    
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    @Override
    public String toString() {
        return this.product.getProdName();
    }

}
