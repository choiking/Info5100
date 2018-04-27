/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.SchoolAdmin.AllClassList;
import Business.SchoolAdmin.ClassSupervisorList;
import Business.SchoolAdmin.OrphanageList;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class SchoolEnterprise extends Enterprise {
    
    private AllClassList acl;
    private ClassSupervisorList csl;
    private OrphanageList oll;

    public AllClassList getAcl() {
        return acl;
    }

    public void setAcl(AllClassList acl) {
        this.acl = acl;
    }

    public ClassSupervisorList getCsl() {
        return csl;
    }

    public void setCsl(ClassSupervisorList csl) {
        this.csl = csl;
    }

    public OrphanageList getOll() {
        return oll;
    }

    public void setOll(OrphanageList oll) {
        this.oll = oll;
    }

    

    
    public SchoolEnterprise(String name){
        super(name,EnterpriseType.School);
        this.acl = new AllClassList();
        this.csl = new ClassSupervisorList();
        this.oll = new OrphanageList();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
