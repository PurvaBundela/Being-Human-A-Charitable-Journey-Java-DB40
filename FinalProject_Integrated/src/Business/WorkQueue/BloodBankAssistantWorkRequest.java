/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author palakagrawal
 */
public class BloodBankAssistantWorkRequest extends WorkRequest{
      private String bloodType;
      private int bloodBankQuantity;
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getBloodBankQuantity() {
        return bloodBankQuantity;
    }

    public void setBloodBankQuantity(int bloodBankQuantity) {
        this.bloodBankQuantity = bloodBankQuantity;
    }
      
    
}
