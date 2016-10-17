/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.text.NumberFormat;

/**
 *
 * @author user
 */
public class Account {
    private double balance;
    private Customer cust;
    
    public Account(double bal, String fName, String lName, String str, String city, String st, String zip){
        
        balance = bal;
        cust = new Customer(fName, lName, str, city, st, zip);
    }
    public double getBalance(){
        return(balance);
    }
    public void deposit(double amt){
        balance += amt;
    }
    public void withdrawl(double amt){
        if(amt<=balance){
            balance -= amt;
        }else{
            System.out.println("Not enough money in account");
        }
    }
    public String toString(){
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        accountString = cust.toString();
        accountString += "Current balance is: " + money.format(balance);
        return(accountString);
    }
}
