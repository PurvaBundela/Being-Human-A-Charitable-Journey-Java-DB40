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
public class FinanceWorkRequest extends WorkRequest{
    private int amountCollected;
    private String financeResult;

    public int getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(int amountCollected) {
        this.amountCollected = amountCollected;
    }

    public String getFinanceResult() {
        return financeResult;
    }

    public void setFinanceResult(String financeResult) {
        this.financeResult = financeResult;
    }
}
