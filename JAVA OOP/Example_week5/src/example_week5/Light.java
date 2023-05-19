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
public class Light {
    private int[] light = new int[1000];
    private int[] headCraft = new int[1000];
    private int[] endCraft = new int[1000];
    private int sizeCraft;
    private int sizeLight;
    private int count;
    Light()
    {
        count =0;
        sizeCraft = 0;
        sizeLight = 0;
    }
    
    public void addSpaceCraft(int h,int e)
    {
        headCraft[sizeCraft] = h;
        endCraft[sizeCraft] = e;
        sizeCraft ++;
    }
    public void addlight(int n)
    {
        
        light[sizeLight] = n;
        sizeLight++;
    }
    
    public void calLight()
    {
        for(int i=0;i<sizeCraft;i++)
        {
            for(int j=0;j<sizeLight;j++)
            {
                //System.out.println(String.format("h: %d e: %d l: %d", headCraft[i],endCraft[i],light[j]));
                if(light[j]>headCraft[i] && light[j]<endCraft[i])
                {
                    count++;
                }
            }
        }
    }
    
    public void Display()
    {
        System.out.println(count);
    }
    
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Light obj = new Light();
        for(int i=0;i<n;i++)
        {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            obj.addSpaceCraft(num1, num2);
        }
        for(int i=0;i<m;i++)
        {
            int l = sc.nextInt();
            obj.addlight(l);
            
        }
        obj.calLight();
        obj.Display();
    }
}
