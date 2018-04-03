/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BloodDonation.BloodSpecification;

/**
 *
 * @author Tejesh
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private String bloodType;
    
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

}
