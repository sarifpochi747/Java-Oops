/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week4;

/**
 *
 * @author sarif
 */
public class Example1 {
    //attribute
    private double r,i;
    
    // method 
    //constructor
    public Example1(double r,double i)
    {
        this.r = r;
        this.i = i;
    }
    
    public Example1(Example1 c)
    {
        this(c.r,c.i);
    }
    
    public void add(Example1 c)
    {
        r += c.r;
        i += c.i;
    }
    public void sub(Example1 c)
    {
        r -= c.r;
        i -= c.i;
    }
    
    public void multi(Example1 c)
    {
        double tempr = (r*c.r - i*c.i);
        double tempi = (r*c.i + i*c.r);
        r = tempr;
        i = tempi;
    }
    
    public void devic(Example1 c)
    {
        double tempr = (r*c.r - i*c.i) / (Math.pow(c.r,2) + Math.pow(c.i,2));
        double tempi = (i*c.r - r*c.i) / (Math.pow(c.r,2) + Math.pow(c.i,2));
        r = tempr;
        i = tempi;
        
    }
    
    public void display()
    {
        System.out.println(String.format("r: %.2f + %.2fi",r,i));
    }
    
    public static void main(String [] agrs)
    {
        Example1 obj1 = new Example1(1,2);
        Example1 obj2 = new Example1(3,4);
        Example1 c  = new Example1(obj1);
        c.add(obj2);
        c.display();
        c  = new Example1(obj1);
        c.sub(obj2);
        c.display();
        c  = new Example1(obj1);
        c.multi(obj2);
        c.display();
        c  = new Example1(obj1);
        c.devic(obj2);
        c.display();
        
        
        
    }
    
}
