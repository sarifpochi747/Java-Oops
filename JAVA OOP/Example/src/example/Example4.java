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
public class Example4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Double interest;
        Double balance;
        Double interestRate;
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%) => ");
        balance = sc.nextDouble();
        interestRate = sc.nextDouble();
        interest = balance *(interestRate / 1200);
        System.out.print(String.format("The interest is => %.5f",interest));
    }
}
