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
public class Example7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x,n, sum =0.0 ;
        System.out.print("Please input x, n => ");
        x = sc.nextDouble();
        n = sc.nextDouble();
        for(int i=0;i<=n;i++){
            sum += Math.pow(x,i);
        }
        System.out.println(String.format("Output is => %.0f", sum));
            
    }
}
