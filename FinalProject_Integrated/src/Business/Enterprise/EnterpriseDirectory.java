/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author panchi
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    //Create Enterprise
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.BeingHuman){
            enterprise = new BeingHumanEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type.getValue().equalsIgnoreCase("Blood Donation Enterprise")){
            enterprise = new BloodEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type.getValue().equalsIgnoreCase("Food Conservation Enterprise")){
            enterprise = new FoodEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else{
            enterprise = new PlasticEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
