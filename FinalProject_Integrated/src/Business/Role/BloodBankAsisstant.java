/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.BloodEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.BloodBankAssistant.BloodBankAssistantWorkAreaPanel;
import userInterface.LabAssistant.LabAssistantWorkAreaJPanel;

/**
 *
 * @author Tejesh
 */
public class BloodBankAsisstant extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BloodBankAssistantWorkAreaPanel(userProcessContainer, account ,(BloodEnterprise)enterprise,business); //To change bo//BloodBankWorkAreaJPanel(userProcessContainer, account, (BloodBankAssistant)organization, business);
    }
}
