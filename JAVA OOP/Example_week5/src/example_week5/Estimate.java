/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week5;

/**
 *
 * @author sarif
 */

import java.util.*;
public class Estimate {
    //attribute
    private int i;

    // method
    //constructor
    Estimate(int i)
    {
         this.i = i;
    }
    
    public double calEstimate(int i)
    {
        if( i == 0)
        {
            
            return  0;
        }
        else
        {
            return ((Math.pow(-1, i+1) / (2*i -1) )  + calEstimate(i-1));
            
        }
        
        
    }
    
    public double getEstimate()
    {
        return 4*calEstimate(i);
    }
            
        
    public void Display()
    {
        System.out.println(String.format("i: %d  M(i): %.4f", i,getEstimate()));
    }
    
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Estimate obj1 = new Estimate(n);
        obj1.Display();
    }
}
