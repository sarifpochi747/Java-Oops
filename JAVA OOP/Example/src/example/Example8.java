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
public class Example8 {
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please input n, a0 and a1: ");
        int n;
        int a0;
        int a1;
        int temp;
        n = sc.nextInt();
        a0 = sc.nextInt();
        a1 = sc.nextInt();
        System.out.print("Output is => "+a0+" "+a1+" ");
        for(int i=2;i<=n;i++){
            temp = (int) (Math.pow(i, 2)*a1 - a0 + Math.pow(3,i));
            System.out.print(temp+" ");
            a0 = a1;
            a1 = temp;
            
        }
        System.out.print("\n");
        
        
    }
}
