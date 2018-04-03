/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.HashMap;

/**
 *
 * @author Panchi
 */
public class SocialCauseDetails {
    private String cause;
    private HashMap<String,Double> subCauseAndSupport;
    
    public SocialCauseDetails(){
        subCauseAndSupport = new HashMap<String,Double>();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
    
    public HashMap<String, Double> getSubCauseAndSupport() {
        return subCauseAndSupport;
    }

    public void setSubCauseAndSupport(HashMap<String, Double> subCauseAndSupport) {
        this.subCauseAndSupport = subCauseAndSupport;
    }
    
}
