/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodConservation.FCEmployeeOrganization;
import Business.Organization.Organization;
import Business.BeingHuman.UserOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.FCEmployee.FCEmployeeWorkAreaJPanel;

/**
 *
 * @author Tejesh
 */
public class FoodConservationEmpRole extends Role{


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FCEmployeeWorkAreaJPanel(userProcessContainer,account,(FCEmployeeOrganization)organization, enterprise,business); //To change body of generated methods, choose Tools | Templates.
    }
    
}
