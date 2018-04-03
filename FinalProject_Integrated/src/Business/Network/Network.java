/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;


import Business.BloodDonation.BloodBank;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author panchi
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseList;
    private NetworkAddress networkAddress;
    BloodBank bloodBank;
    
    public Network(){
        this.enterpriseList = new EnterpriseDirectory();
        this.networkAddress = new NetworkAddress();
        this.bloodBank = new BloodBank();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseList() {
        return enterpriseList;
    }

    public NetworkAddress getNetworkAddress() {
        return networkAddress;
    }

    public void setNetworkAddress(NetworkAddress networkAddress) {
        this.networkAddress = networkAddress;
    }
     public BloodBank getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
