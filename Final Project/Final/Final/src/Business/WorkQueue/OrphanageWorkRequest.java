/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class OrphanageWorkRequest extends WorkRequest{
    
    private String adoptResult;
    private int age;

    
    

    public String getAdoptResult() {
        return adoptResult;
    }

    public void setAdoptResult(String adoptResult) {
        this.adoptResult = adoptResult;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    @Override
    public String toString() {
        return this.age + "";
    }
    
    
   
    
    
}
