/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodDonation;

import net.sourceforge.barbecue.Barcode;

/**
 *
 * @author palakagrawal
 */
public class BloodSpecification {
    private String bloodGroup;
    private int quantity;
    private String dateOfDonation;
    
    

    public BloodSpecification() {

    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDateOfDonation() {
        return dateOfDonation;
    }

    public void setDateOfDonation(String dateOfDonation) {
        this.dateOfDonation = dateOfDonation;
    }

   
}
