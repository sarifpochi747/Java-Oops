/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week8;

/**
 *
 * @author sarif
 */
public class FixAccount extends Account {
    
    
    public FixAccount(int id, double balance,Dates newDate) {
        //sent to constructor super class(Account)
        super(id, balance,newDate);
    }

    @Override
    public void TransferMoney(Account target, double amt) {
        System.out.println("Can't Transfer!!!");
    }
}
