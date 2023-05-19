/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_8;

/**
 *
 * @author sarif
 */
public class Rectangle {
    //Attribute
    private double width,height;
    private double x,y;
    
    //No-arg Constructor
    Rectangle()
    {
        
    }
    
    Rectangle(double w,double h,double x,double y)
    {
        width = w;
        height = h;
        this.x = x;
        this.y = y;
    }
    
    public double getArea(Rectangle a)
    {
        return a.height * a.width;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getHeight()
    {
        return height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
}
