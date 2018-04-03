/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.BloodDonation.BloodBank;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author panchi
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecosystem;
    //private WorkQueue workQueue;
    private ArrayList<Network> networkList;
    private ArrayList<String> sponsorList;
   
    
    public static EcoSystem getInstance(){
        if (ecosystem == null){
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }
    
    private EcoSystem(){
        super(null);
      //  workQueue = new WorkQueue();
        networkList = new ArrayList<Network>();
       sponsorList = new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }
//
//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
        networkList = new ArrayList<Network>();
    }

   public ArrayList<String> getSponsorList() {
        return sponsorList;
    }

    public void setSponsorList(ArrayList<String> sponsorList) {
        this.sponsorList = sponsorList;
    }
    
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkUsernameIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        
        for(Network network :networkList){
            
        }
        return true;
    }
    
}
