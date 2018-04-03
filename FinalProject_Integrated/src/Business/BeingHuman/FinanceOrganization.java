/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BeingHuman;

import Business.Organization.Organization;
import Business.Role.FinanceRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;



/**
 *
 * @author palakagrawal
 */
public class FinanceOrganization extends Organization{

    public FinanceOrganization() {
        super(OrganizationType.Finance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new FinanceRole());
        return roleList;
    }
    
}
