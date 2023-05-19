/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week4;

/**
 *
 * @author sarif
 */
import java.util.*;
public class Account {
    
    //attribute
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated ;
    private double monthlyInterest;
    private double monthlyInterestRate;
            
    //method
    //defaul constructor
    Account()
    {
        id  = 0;
        balance = 0;
        annualInterestRate = 0;
        
    }
    //constructor
    Account(int i,double b,Date d)
    {
        id = i;
        balance = b;
        dateCreated = d;
        
    }
    //
    //constructor
    Account(int i,double b,double a,Date d)
    {
        id = i;
        balance = b;
        annualInterestRate = a;
        dateCreated = d;
        
    }
    //method set
    public void setId(int i)
    {
        id = i;
    }
    
    //method set
    public void setBalanece(double b)
    {
        balance = b;
    }
    
    //method set
    public void setAnnualInterestRate(double a)
    {
        annualInterestRate = a;
    }
    
    //method set
    public void setDate(Date d)
    {
        dateCreated = d;
    }
    
    
    public void getMonthlyInterest()
    {
        monthlyInterest = (monthlyInterestRate)/100;
    }
    
    public void withdraw(double w)
    {
        balance = balance  - w;
    }
    
    public void deposit(double d)
    {
        balance = balance + d;
    }
    
    void tranfer(Account c,double money)
    {
        balance -= money;
        c.balance += money;
    }
    
    //method get
    public void Display()
    {
        System.out.println(String.format("id: %d \nbalance: %.2f \nDate: %s", id,balance,dateCreated.toString()));
        System.out.println(monthlyInterest);
        System.out.println("Earn "+balance * annualInterestRate/100);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    
    //method main 
    public static void main(String [] args)
    {
        //create object
        Date c1 = new Date(2022,8,18);
        Account customer1 = new Account(1122,20000,4.5,c1);
        customer1.withdraw(2500);
        customer1.deposit(3000);
        //customer1.getMonthlyInterestRate();
        customer1.getMonthlyInterest();
        Date c2 = new Date(2022,8,18);
        Account customer2 = new Account(1133,30000,4.5,c2);
        customer1.tranfer(customer2,1000);
        customer1.Display();
        customer2.Display();
    }
    
}
