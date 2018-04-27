/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdopterSupervisorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdopterSupervisorOrganization extends Organization{

    public AdopterSupervisorOrganization() {
        super(Organization.Type.AdopterSupervisor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdopterSupervisorRole());
        return roles;
    }
     
   
    
    
}
