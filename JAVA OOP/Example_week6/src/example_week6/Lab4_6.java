/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week6;

/**
 *
 * @author sarif
 */
import java.util.*;
public class Lab4_6 {
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        double[] d1 = new double[100];
        
        for(int i=0;i<n;i++)
        {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            x[i] = x1;
            y[i] = y1;
        }
        int c =0;
                double min =100;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i != j && j> i)
                {
                    double d = Math.sqrt(Math.pow(x[i]-x[j],2) + Math.pow(y[i] - y[j], 2));
                    if(d<min)
                    {
                        min = d;
                    }
                    
                    
                    
                }
            }
        }
                System.out.print(String.format("%.2f",min));
        
        
        
        
    }
}
