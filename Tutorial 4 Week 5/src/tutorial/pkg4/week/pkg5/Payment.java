/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.pkg4.week.pkg5;

/**
 *
 * @author USER
 */
abstract class Payment 
{
    public double amount;

    public Payment(double amount) {
        this.amount = amount;
    }
    

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {        
        return "CashPayment ," + "amount paid is : " + amount ;
    }
    
    
    
}
