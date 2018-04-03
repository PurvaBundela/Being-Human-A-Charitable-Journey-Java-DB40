/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author panchi
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    
    private OrganizationDirectory organizationDirectory;
    
    
    
    public enum EnterpriseType{
        
        BeingHuman("BeingHuman Enterprise"), Blood("Blood Donation Enterprise"), Food("Food Conservation Enterprise"),Plastic("Plastic Conservation Enterprise"), Help("Help Enterprise");
        
        private String value;
        
        private EnterpriseType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
    }

    public Enterprise(String name, EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        this.organizationDirectory = new OrganizationDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    
}
