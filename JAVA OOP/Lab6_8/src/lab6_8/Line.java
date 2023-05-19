/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_8;

/**
 *
 * @author sarif
 */

import java.util.*;
public class Line {
    //Attribute
    private double x1,y1;
    private double x2,y2;
    
    
    //non argument Constructor
    Line()
    {
        
    }
    
    //Constructor
    Line(double x1,double y1,double x2,double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public double getX1()
    {
        return x1;
    }
    public double getX2()
    {
        return x2;
    }
    public double getY1()
    {
        return y1;
    }
    public double getY2()
    {
        return y2;
    }
  
    public double getLong(Line a)
    {
        return Math.sqrt(Math.pow(a.x1-a.x2, 2) + Math.pow(a.y1-a.y2, 2));
    }
    
    
}
