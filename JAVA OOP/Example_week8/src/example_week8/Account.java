/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week8;

import java.util.Date;

/**
 *
 * @author sarif
 */
public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;
    private Dates dateCreate;
    
    
    //Defualt Cinstructor
    Account()
    {
        
    }
    
    // COnstructor
    Account(int newId ,double newBalance,Dates newDate)
    {
        id = newId;
        balance = newBalance;
        dateCreate = newDate;
    }
    
    
    //Method setId
    public void setId(int newId)
    {
        id = newId;
    }
    
    //Method setBalance
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    
    public void setannualInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }
    
    //method setDate
    public void setDate(Dates date)
    {
        dateCreate = date;
    }
    
    //method Desposit
    public void Desposit(double newMoney)
    {
        balance += newMoney;
    }
    
    //method Withdraw
    public void Withdraw(double newMoney)
    {
        balance -= newMoney;
    }
    
    //method getMonthyInterest
    public double getMonthlyInterest()
    {
        return ((annualInterestRate/(12))*balance)/12;
    }
    
    
    //Method TransferMoney
    public void TransferMoney(Account acc1,double amount)
    {
        acc1.balance += amount;
        this.balance -= amount;
    }
    
    @Override
    public String toString(){
        return "Account = " + id+ "\nBalance = "+balance+"\nGetMonthlyInterest = "+getMonthlyInterest()+"\nDate = "+dateCreate.toString()+"\n"+
                "------------------------------------------------------------------------------------------------------\n";
    }
    
}





