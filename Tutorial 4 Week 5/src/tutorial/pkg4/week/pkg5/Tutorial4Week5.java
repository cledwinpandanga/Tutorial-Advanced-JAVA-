/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.pkg4.week.pkg5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class Tutorial4Week5 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double totalAmount = 0;
        int CashCount = 0, CreditCount = 0;
        String chc;        
        List<Payment> payments = new ArrayList<>();
        Scanner key = new Scanner(System.in);               
        
        //buat menu
        System.out.println("Selamat Datang di Arik Shop");        
            for (int i=0; i<8; i++)
            {                                 
                System.out.print("Pilihan <Cash>/<Credit> : ");  
                chc = key.nextLine();
                
                if (chc.equals("Cash"))
                {              
                    System.out.print("Sales amount(Cash)? : ");
                    double cash = key.nextDouble();                                                 
                    key.nextLine();
                    payments.add(new CashPayment(cash));                      
                }

                else if(chc.equals("Credit"))
                {                            
                    System.out.print("Sales amount(Credit)? : ");
                    double credit = key.nextDouble();
                    key.nextLine();
                    
                    System.out.print("Name : ");
                    String nm = key.nextLine();
                    
                    System.out.print("Expire Date(month) : ");
                    String ed = key.nextLine();
                    System.out.print("Expire Date(year) : ");
                    String year = key.nextLine();
                    
                    System.out.print("Credit Number : ");
                    String num = key.nextLine();                    
                    
                    payments.add(new CreditCardPayment(credit,nm,ed,year,num));             
                    System.out.println("Using card (" + nm + "["+ num + "] exp : " + ed+"/"+year);                                                                 
                }                                   
            } 
            
        // tampilkan penyimpanan
        System.out.println("");        
        System.out.println("Payment Stored >>");
        for(int i= 0; i<payments.size(); i++)
        {           
           System.out.println((i+1)+". "+payments.get(i).toString());
        }
        
        for(Payment i : payments)
        {
            totalAmount+= i.getAmount();
            if (i instanceof CashPayment)
            {
                CashCount++;
            }
            
            else
            {
                CreditCount++;
            }
            
        }
        
        //tampilkan jumlah pembayaran lebih dari 2000
        System.out.println("");        
        System.out.println("List of Payments more than 2000.0");
        for(Payment i : payments)
        {            
            if (i.getAmount() > 2000)
            {
              System.out.println("--> "+ i.toString());         
            }
        }
        
        //tampilkan total amount dan cash
        System.out.println("");  
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Total Cash : " + CashCount);
        System.out.println("Total Credit : " + CreditCount);
     }
    
}
    
