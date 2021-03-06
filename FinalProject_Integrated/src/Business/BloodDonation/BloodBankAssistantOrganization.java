/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodDonation;

import Business.Organization.Organization;
import Business.Role.BloodBankAsisstant;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class BloodBankAssistantOrganization extends Organization{

    public BloodBankAssistantOrganization() {
        super(OrganizationType.BloodBankAssistant.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new BloodBankAsisstant());
        return roleList;
    }
    
    
}
