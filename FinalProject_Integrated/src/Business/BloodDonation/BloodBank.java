/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodDonation;

import java.util.ArrayList;

/**
 *
 * @author palakagrawal
 */
public class BloodBank {
    private ArrayList<BloodSpecification> bloodList;

    public BloodBank() {
        this.bloodList = new ArrayList<BloodSpecification>();
    }

    public ArrayList<BloodSpecification> getBloodList() {
        return bloodList;
    }

    public void setBloodList(ArrayList<BloodSpecification> bloodList) {
        this.bloodList = bloodList;
    }
    
   public BloodSpecification createBloodBank()
   {
       BloodSpecification bloodSpecification = new BloodSpecification();
       bloodList.add(bloodSpecification);
       return bloodSpecification;
   }
    
}
