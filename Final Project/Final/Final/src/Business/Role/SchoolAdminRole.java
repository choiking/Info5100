/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.SchoolAdmin.ClassSupervisorList;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.SchoolRole.SchoolWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SchoolAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business, Network netWork) {

        return new SchoolWorkAreaJPanel(userProcessContainer, enterprise, account);
    }

}
