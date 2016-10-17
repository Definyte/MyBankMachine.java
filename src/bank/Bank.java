/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "334455");
        
        Scanner input = new Scanner(System.in);
        double data;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println(munozAccount);
        
        System.out.println("Enter deposit amount: ");
        data = input.nextDouble();
        munozAccount.deposit(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
        
        System.out.println("Enter withdrawl amount: ");
        data = input.nextDouble();
        munozAccount.withdrawl(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
    }
    
}
