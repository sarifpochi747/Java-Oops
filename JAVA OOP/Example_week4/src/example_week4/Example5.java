/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week4;

/**
 *
 * @author sarif
 */
import java.util.*;
public class Example5 {
    //attribute
    private double a,b,c,d,e,f,resultX,resultY;
    
    // method 
    //constructor
    Example5()
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        resultX = 0;
        resultY = 0;
        
    }
    
    public void getValues(double a,double b,double c,double d,double e,double f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public boolean isSolveble()
    {
      if ((a*d - b*c) != 0 )
      {
          return true;
      }
      else
      {
          return false;
      }
      
    };
    public void getX()
    {
        if(isSolveble())
        {
            resultX = (e*d - b*f) / (a*d - b*c) ;
            getY();
            display();
        }
        else
        {
            System.out.println("The Equation has no solution");
        }
    }
    
    public void getY()
    {
        if(isSolveble())
        {
            resultY = (a*f - e*c) / (a*d - b*c) ;
        }
        
    }
    
    public void display()
    {
        System.out.println(String.format("x is %.2f and y is %.2f",resultX,resultY));
    }
    
   public static void main(String [] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a b c d e f: ");
       double a= sc.nextDouble();
       double b= sc.nextDouble();
       double c= sc.nextDouble();
       double d= sc.nextDouble();
       double e= sc.nextDouble();
       double f= sc.nextDouble();
       Example5 obj1 = new Example5();
       obj1.getValues(a, b, c, d, e, f);
       obj1.isSolveble();
       obj1.getX();
       //obj1.getY();
       //obj1.display();
       
   }
    
};
