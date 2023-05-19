/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week8;

/**
 *
 * @author sarif
 */
public class MainAccount {
    
    public static void main(String [] args)
    {
        Dates dateLisa = new Dates(1,8,2022);
        SavingAccount Lisa = new SavingAccount(1122,20000,dateLisa);
        FixAccount Lisa1  = new FixAccount(1122,30000,dateLisa);
        Lisa.setannualInterestRate(4.5);
        Lisa.Withdraw(2500);
        Lisa.Desposit(3000);
        Lisa.setDate(dateLisa);
        System.out.print(Lisa);
        
        Dates dateRose = new Dates(22,9,2022);
        SavingAccount Rose  = new SavingAccount(1123,30000,dateRose);
        FixAccount Rose1  = new FixAccount(1123,30000,dateRose);
        System.out.print(Rose.toString());
        
        //create object person
        Person personLisa = new Person("Lisa","Lee",20,dateLisa);
        Person personRose = new Person("Rose","Lee",20,dateRose);
        
        //saving account lisa to rose
        Lisa.TransferMoney(Rose, 1000);
        System.out.print(Rose);
        System.out.print(Lisa);
        
        //Fix Account
        Lisa1.TransferMoney(Rose1, 1000);
        
        
    }
}
