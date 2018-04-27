/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CompanyAdmin;

import java.util.ArrayList;

/**
 *
 * @author nanshengtu
 */
public class ProductList {
    
    private ArrayList<Product> productList;

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public void addProduct(Product p) {
        productList.add(p);
    }
    
    public void removeProduct(Product p) {
        productList.remove(p);
    }
    
    
}
