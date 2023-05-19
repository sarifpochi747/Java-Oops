/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week4;

/**
 *
 * @author sarif
 */
import java.lang.Math;
import java.util.*;
public class RegularPolygon {
    private int n;
    private double side ;
    private double x ;
    private double y ;
    private double area;
    
    RegularPolygon()
    {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    
    RegularPolygon(int newN,double newSide )
    {
        n = newN;
        side = newSide;
    }
    
    RegularPolygon(int newN,double newSide,double newX,double newY)
    {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }
    public double getPerimeter()
    {
        return side*n;
    }
    
    public double getArea()
    {
        area = (n * Math.pow(side, 2)) / ( 4 * Math.tan(Math.PI/n) );
        return area;
    }
    
    public void Display()
    {
        System.out.println(String.format("Area %.2f, Perimeter %.2f", getArea(),getPerimeter()));
    }
    
    public static void main(String[] args)
    {
        RegularPolygon obj1 = new RegularPolygon();
        RegularPolygon obj2 = new RegularPolygon(6,4);
        RegularPolygon obj3 = new RegularPolygon(10,4,5.6,7.8);
        obj1.Display();
        obj2.Display();
        obj3.Display();
        
    }
    
}
