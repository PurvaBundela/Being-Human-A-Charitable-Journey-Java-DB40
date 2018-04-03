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
public class OrphanageWorkRequest extends WorkRequest{
    private String foodResult;
    private double quantity;

    public String getFoodResult() {
        return foodResult;
    }

    public void setFoodResult(String foodResult) {
        this.foodResult = foodResult;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
