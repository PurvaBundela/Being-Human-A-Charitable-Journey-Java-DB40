/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpDonation;


import Business.BeingHuman.*;
import Business.BloodDonation.*;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class HelpTeamOrganization extends HelpOrganization{

    public HelpTeamOrganization(String name) {
        super(HelpOrganizationType.DisasterManagement.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
