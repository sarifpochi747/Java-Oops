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
public class Example9 {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int max =-1;
        int number = -1;
        int count = 0;
        while(number != 0){
            number = sc.nextInt();
            
            // check if number > max
            if(number > max){
                max = number;
                count =1;
            }
            else if(max == number){
                count ++;
            }
        }
        System.out.print(max+" "+count);
        
    }        
}
