/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FundsSupervisorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FundsOrganization extends Organization{

    public FundsOrganization(){   
        super(Organization.Type.Funds.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundsSupervisorRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    }

    
   

