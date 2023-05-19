/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circleprojectrc;

/**
 *
 * @author sarif
 */
public class Circle {
   
    //attribute
    private double radius;
    private double area;
    private double perimeter;
    
    //method
    // constructor
    Circle()
    {
        area = 0;
        perimeter = 0;
        radius = 0;
    }
    
    //set area
    public void setRadius(double r)
    {   
        if(r >= 0)
        {
            radius = r;
        }
        else
        {
            radius = 0;
        }
    }
    
    //calculator area
    
    public void calculatorArae()
    {
        area = Math.PI*Math.pow(radius, 2);
    }
    
    public void calculatorPerimeter()
    {
        perimeter = 2 * Math.PI * radius;
    }
    
    public void display()
    {
        System.out.print(String.format("Radius => %.2f\n", radius));
        System.out.print(String.format("Area => %.2f\n", area));
        System.out.print(String.format("Perometer => %.2f\n", perimeter));
    }
    
     
    
}

