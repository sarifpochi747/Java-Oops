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
public class CheckTriangle {
    private double x0,y0;
    private double x1,y1;
    private double x2,y2;
    private double  slope1;
    private double slope2;
    //constructor
    CheckTriangle(double x0,double y0,double x1,double y1,double x2,double y2)
    {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void findSlope()
    {
        slope1 = (y1-y0)/(x1-x0);
        slope2 = (y2-y1) / (x2-x1);
        //System.out.print(String.format("slope1: %.2f, slope2: %.2f", slope1,slope2));
    }
    
    public boolean onTheSameLine()
    {
        return slope1 == slope2;
            
    }
    
    public boolean leftOfTheLine()
    {
        return slope2 > slope1;
    }
    
    public boolean rightOfTheLine()
    {
        return slope2 < slope1;
    }
    
    public void Display()
    {
        if(onTheSameLine())
        {
            System.out.println(0);
        }else if(leftOfTheLine())
        {
            System.out.println(2);
        }else if(rightOfTheLine())
        {
            System.out.println(1);
        }
    }
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        //create object
        CheckTriangle obj1 = new CheckTriangle(x0,y0,x1,y1,x2,y2);
        obj1.findSlope();
        obj1.Display();
    }
    
}
