/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarif
 */
public class Test1 {
    private double r;
    private double area;
    
    
    //method setter radius
    public void setterRadius(double radius)
    {
        r = radius;
    }
    
    public void calArea()
    {
        area = 3.14*Math.pow(r, 2);
    }
    
    public void display()
    {
        System.out.format("%.2f\n", area);
    }
    
    //main method
    public static void main(String[] args)
    {
        //create objec style array of reference variable
        Test1[] circle = new Test1[10];
        for(int i=0;i<10;i++)
        {
            circle[i] = new Test1();
            circle[i].setterRadius(i);
            circle[i].calArea();
            circle[i].display();
        }
        
    }
    
    
}
