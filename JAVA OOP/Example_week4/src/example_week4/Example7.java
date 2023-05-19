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
class Point{
    public double x;
    public double y;
    
    //method
    public void pointBottomLeft(double x1,double y1,double w,double h)
    {
        x = x1 -(w/2);
        y = y1 - (h/2);
    }
    public void pointTopRight(double x1,double y1,double w,double h)
    {
        x = x1 +(w/2);
        y = y1 + (h/2);
    }
}
public class Example7 {
    //attribute
    private double x;
    private double y;
    private double width;
    private double height;
    Point topR;
    Point bottomL;
    //constructor
    Example7(double x,double y,double w,double h)
    {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
    }
    
    public void getPoint()
    {
        topR = new Point();
        topR.pointTopRight(x,y,width,height);
        bottomL = new Point();
        bottomL.pointBottomLeft(x, y, width, height);
        
    }
    public void Display()
    {
        System.out.print(String.format("TopR(x,y): %.2f  %.2f \t",topR.x,topR.y));
        System.out.println(String.format("BottomL(x,y): %.2f  %.2f ",bottomL.x,bottomL.y));
    }
    
    
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinate, width, height: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinate, width, height: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();
        //create object;
        Example7 r1 = new Example7(x1,y1,w1,h1);
        r1.getPoint();
        r1.Display();
        Example7 r2 = new Example7(x2,y2,w2,h2);
        r2.getPoint();
        r2.Display();
        //topR
        if(r1.topR.x >= r2.topR.x && r1.topR.y >= r2.topR.y && r1.bottomL.x <= r2.bottomL.x && r1.bottomL.y<=r2.bottomL.y)
        {
            System.out.println("r2 is inside r1");
        }
        else
        {
            System.out.println("Overlap");
        }
    }
    
    
}

