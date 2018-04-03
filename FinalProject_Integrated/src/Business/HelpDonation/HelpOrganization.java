/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpDonation;

import Business.BeingHuman.*;
import Business.BloodDonation.*;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class HelpOrganization extends Organization{

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public enum HelpOrganizationType{
        DisasterManagement("Disaster Management Organization");
        
        private String value;
        
        private HelpOrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public HelpOrganization(String name){
        super(name);
    }

}
