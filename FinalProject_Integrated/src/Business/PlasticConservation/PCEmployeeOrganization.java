/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PlasticConservation;

import Business.BeingHuman.*;
import Business.BloodDonation.*;
import Business.Organization.Organization;
import Business.Role.PlasticConservationEmpRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class PCEmployeeOrganization extends Organization{

    public PCEmployeeOrganization() {
        super(OrganizationType.PCEmployee.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new PlasticConservationEmpRole());
        return roleList;
    }
    
}
