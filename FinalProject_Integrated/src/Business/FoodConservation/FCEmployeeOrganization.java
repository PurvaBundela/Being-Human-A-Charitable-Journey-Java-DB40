/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodConservation;


import Business.Organization.Organization;
import Business.Role.FoodConservationEmpRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class FCEmployeeOrganization extends Organization{

    public FCEmployeeOrganization() {
        super(OrganizationType.FCEmployee.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new FoodConservationEmpRole());
        return roleList;
    }
    
}
