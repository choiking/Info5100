/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClassSupervisorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ClassOrganization extends Organization{

    public ClassOrganization() {
        super(Organization.Type.Classes.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClassSupervisorRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
   
     
}