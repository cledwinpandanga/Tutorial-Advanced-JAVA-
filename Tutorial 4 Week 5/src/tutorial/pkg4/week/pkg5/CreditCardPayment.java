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
public class CreditCardPayment extends Payment{
    private String name,expireDate, year,number;

    public CreditCardPayment(double amount,String name, String expireDate,String year,String number) {
        super(amount);
        this.name = name;
        this.expireDate = expireDate;
        this.year = year;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "for credit-card payment, amount paid is " + getAmount();        
    }    
    
}
