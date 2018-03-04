/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author preet
 */
public class ProductCatalog {

    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
     public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
  public Product searchProduct(int modelNum) {
        
        for (Product p : productCatalog) {
            if (p.getModelNumber() == modelNum) 
               return p;
        } 
  return null;
    }
   public void removeProduct(Product p) {
        
        productCatalog.remove(p);
        }
}
