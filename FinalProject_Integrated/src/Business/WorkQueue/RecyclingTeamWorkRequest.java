/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Tejesh
 */
public class RecyclingTeamWorkRequest extends WorkRequest{

    
    private String plasticResult;
    private String location;

    public String getPlasticResult() {
        return plasticResult;
    }

    public void setPlasticResult(String plasticResult) {
        this.plasticResult = plasticResult;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
