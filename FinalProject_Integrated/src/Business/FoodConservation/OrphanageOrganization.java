/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodConservation;

import Business.Organization.Organization;
import Business.Role.OrphanageTeamRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class OrphanageOrganization extends Organization{

    public OrphanageOrganization() {
        super(OrganizationType.Orphanage.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new OrphanageTeamRole());
        return roleList;
    }
    
}
