/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_week5;

/**
 *
 * @author sarif
 */
import java.util.*;
public class RoachPopulation {
    
    //attribute 
    private double num;
    
    
    //method 
    //constructor
    RoachPopulation(int n)
    {
        num = n;
    }
    
    public void Wait()
    {
        num = num * 2;
    }
    
    public void Spay()
    {
        num = num - Math.floor((num*10)/100);
        //Math.floor(num);
        System.out.println(num);
    }
    
    public double getNum()
    {
        return Math.floor(num);
    }
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //create object
        RoachPopulation obj;
        int n = sc.nextInt();
        int time = sc.nextInt();
        obj = new RoachPopulation(n);
        
        for(int i=0;i<time;i++)
        {
            obj.Wait();
            obj.Spay();
        }
        System.out.print(obj.getNum());
    }
    
}
