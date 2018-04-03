/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BeingHuman;



import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class AdvertisementOrganization extends Organization{

    public AdvertisementOrganization() {
        super(OrganizationType.Advertisement.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
    }
    
}
