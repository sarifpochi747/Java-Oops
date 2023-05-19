/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example;

/**
 *
 * @author sarif
 */
import java.util.*;
public class Example2 {
    public static void main(String[] args){
        int money ;
        Double amount = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount => ");
        money = sc.nextInt();
        for(int i=1;i<=6;i++){
            amount = (amount + money)*(1+0.00417);
        }
        System.out.print(String.format("After the sixth month, the account value is => $%.2f" , amount));
    }
}
