/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author panchi
 */
public class BeingHumanEnterprise extends Enterprise{
    
    private BloodEnterprise bloodEnterprise;
    private FoodEnterprise foodEnterprise;
    private PlasticEnterprise plasticEnterprise;
    private HelpEnterprise helpEnterprise;
    private BankDetails bankDet;
    private int amountCollected;
    private ArrayList<SocialCauseDetails> socialCauseDirectory;
    
    public BeingHumanEnterprise(String name){
        
        super(name, EnterpriseType.BeingHuman);
        
        bloodEnterprise = new BloodEnterprise("Blood Donation");
        foodEnterprise = new FoodEnterprise("Food Conservation");
        plasticEnterprise = new PlasticEnterprise("Plastic Conservation");
        helpEnterprise = new HelpEnterprise("Help Donation");
        bankDet = new BankDetails();
        socialCauseDirectory = new ArrayList<SocialCauseDetails>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public BloodEnterprise getBloodEnterprise() {
        return bloodEnterprise;
    }

    public void setBloodEnterprise(BloodEnterprise bloodEnterprise) {
        this.bloodEnterprise = bloodEnterprise;
    }

    public FoodEnterprise getFoodEnterprise() {
        return foodEnterprise;
    }

    public void setFoodEnterprise(FoodEnterprise foodEnterprise) {
        this.foodEnterprise = foodEnterprise;
    }

    public PlasticEnterprise getPlasticEnterprise() {
        return plasticEnterprise;
    }

    public void setPlasticEnterprise(PlasticEnterprise plasticEnterprise) {
        this.plasticEnterprise = plasticEnterprise;
    }

    public HelpEnterprise getHelpEnterprise() {
        return helpEnterprise;
    }

    public void setHelpEnterprise(HelpEnterprise helpEnterprise) {
        this.helpEnterprise = helpEnterprise;
    }
    public BankDetails getBankDet() {
        return bankDet;
    }

    public void setBankDet(BankDetails bankDet) {
        this.bankDet = bankDet;
    }

    public int getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(int amountCollected) {
        this.amountCollected = amountCollected;
    }

    public ArrayList<SocialCauseDetails> getSocialCauseDirectory() {
        return socialCauseDirectory;
    }

    public void setSocialCauseDirectory(ArrayList<SocialCauseDetails> socialCauseDirectory) {
        this.socialCauseDirectory = socialCauseDirectory;
    }
    
    
}
