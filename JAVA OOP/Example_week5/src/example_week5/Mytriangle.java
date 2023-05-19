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
public class Mytriangle {
    
    public boolean isValid(double side1,double side2,double side3)
    {
        return (side1 + side2) > side3;
    }
   
    
    public double Area(double side1,double side2,double side3)
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }
    
    public static void main(String [] agrs)
    {
        Scanner sc = new Scanner(System.in);
        double s1= sc.nextDouble();
        double s2= sc.nextDouble();
        double s3= sc.nextDouble();
        Mytriangle obj = new Mytriangle();
        
        if (obj.isValid(s1, s2, s3))
        {
            System.out.print(String.format("%.2f", obj.Area(s1, s2, s3)));
        }
        else
        {
            System.out.println(0);
                
        }
    }
}
