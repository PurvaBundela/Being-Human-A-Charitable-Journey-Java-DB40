/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distance;

import java.util.ArrayList;

/**
 *
 * @author Panchi
 */
public class DistanceDirectory {
    
    private ArrayList<Distance> distanceDirectory;

    public DistanceDirectory() {
        
       distanceDirectory = new ArrayList<Distance>();
        
    }
    
    

    public ArrayList<Distance> getDistanceDirectory() {
        return distanceDirectory;
    }

    public void setDistanceDirectory(ArrayList<Distance> distanceDirectory) {
        this.distanceDirectory = distanceDirectory;
    }
    
    public Distance addDistance()
    {
        Distance distance = new Distance();
        distanceDirectory.add(distance);
        return distance;
    }
    
    
    
}
