/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
      
        if (type.getValue().equals(Type.Funds.getValue())){
            organization = new FundsOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Adopter.getValue())){
            organization = new AdopterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AdopterSupervisor.getValue())){
            organization = new AdopterSupervisorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Classes.getValue())){
            organization = new ClassOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    
    
    public void deleteOrganization(String name) {
        
        
        for (Organization o : organizationList) {
            if (o.getName().equals(name)) {
                organizationList.remove(o);
                return;
            }
        }
    }
}