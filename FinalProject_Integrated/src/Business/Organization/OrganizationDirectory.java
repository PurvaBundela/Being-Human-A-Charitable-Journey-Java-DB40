/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BeingHuman.AdvertisementOrganization;
import Business.BeingHuman.FinanceOrganization;
import Business.BloodDonation.BloodBankAssistantOrganization;
import Business.BloodDonation.LabAssistantOrganization;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.FoodConservation.FCEmployeeOrganization;
import Business.FoodConservation.OrphanageOrganization;
import Business.Organization.Organization.OrganizationType;
import Business.PlasticConservation.PCEmployeeOrganization;
import Business.PlasticConservation.RecyclingTeamOrganization;
import Business.BeingHuman.UserOrganization;
import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(OrganizationType orgType, EnterpriseType entType) {
        Organization organization = null;
        if (entType.getValue().equals(EnterpriseType.BeingHuman.getValue())) {
            if (orgType.getValue().equals(OrganizationType.Advertisement.getValue())) {
                organization = new AdvertisementOrganization();
                organizationList.add(organization);
            } else if (orgType.getValue().equals(OrganizationType.Finance.getValue())) {
                organization = new FinanceOrganization();
                organizationList.add(organization);
            } else if (orgType.getValue().equals(OrganizationType.User.getValue())) {
                organization = new UserOrganization();
                organizationList.add(organization);
            }
        } else if (entType.getValue().equals(EnterpriseType.Blood.getValue())) {
            if (orgType.getValue().equals(OrganizationType.BloodBankAssistant.getValue())) {
                organization = new BloodBankAssistantOrganization();
                organizationList.add(organization);
            } else if (orgType.getValue().equals(OrganizationType.LabAssistant.getValue())) {
                organization = new LabAssistantOrganization();
                organizationList.add(organization);
            }
        } else if (entType.getValue().equals(EnterpriseType.Food.getValue())) {
            if (orgType.getValue().equals(OrganizationType.FCEmployee.getValue())) {
                organization = new FCEmployeeOrganization();
                organizationList.add(organization);
            } else if (orgType.getValue().equals(OrganizationType.Orphanage.getValue())) {
                organization = new OrphanageOrganization();
                organizationList.add(organization);
            }
        } else if (entType.getValue().equals(EnterpriseType.Plastic.getValue())) {
            if (orgType.getValue().equals(OrganizationType.PCEmployee.getValue())) {
                organization = new PCEmployeeOrganization();
                organizationList.add(organization);
            } else if (orgType.getValue().equals(OrganizationType.RecyclingTeam.getValue())) {
                organization = new RecyclingTeamOrganization();
                organizationList.add(organization);
            }
        }

        return organization;
    }
}
