/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;



import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.BeingHuman.UserOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.User.UserWorkAreaJPanel;

/**
 *
 * @author Tejesh
 */
public class UserRole extends Role {

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new UserWorkAreaJPanel(userProcessContainer, account, (UserOrganization) organization, enterprise, business);
    }

}
