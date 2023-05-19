/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week8;

/**
 *
 * @author sarif
 */
public class SavingAccount extends Account{
    
    //constructor
    SavingAccount(int newId,double newBalance,Dates newDate)
    {
        //send arrgument to construtor of superclass(Account)
        super(newId,newBalance,newDate);
        
    }
    
    @Override
    public void TransferMoney(Account acc1,double amount)
    {
        acc1.balance += amount;
        balance -= (amount - 20);
    }
}
