/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week5;

/**
 *
 * @author sarif
 */
public class Test1 {
    public static void method1(int i)
    {
        do{
            if( i % 3 != 0)
            {
                System.out.print(i + " ");
                i--;
                
            }
        }while(i>=1);
        System.out.println();
    }
    
    public static void main(String [] args)
    {
        int i =0 ;
        while(i<=4)//0,1,2,3,4
        {
            
            method1(i);
            i++;
        System.out.println("i is :"+i);
        }
    }
    
    
};

