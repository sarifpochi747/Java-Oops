/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week4;

/**
 *
 * @author sarif
 */

import java.util.*;
public class Example9 {
    private int arr[];
    private int size;
    
    //CONSTRUCTOR
    Example9()
    {
        arr = new int[100];
        size = -1;
    }
    public void add(int n)
    {
        if(isPrimeNumber(n))
        {
            size ++ ;
            arr[size] = n;
        }
    }
    
    public void maxNumber()
    {
        int max = 0;
        //System.out.println(size);
        if(size >= 0)
        {
            for(int i=0;i<=size;i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
        else
        {
            System.out.println("-1");
        }
    }
    
    public boolean isPrimeNumber(int n)
    {
        int m= n/2;
        int flag = 0;
        boolean temp = false;
        
        // is not prime number
        if(n == 0 || n == 1)
        {
           // System.out.println("Not prime number");
            temp = false;
        }
        else
        {
            for(int i=2;i<=m;i++)
            {
                // is not prime number
                if(n%i == 0)
                {
                    //System.out.println("Not prime Number");
                    flag = 1;
                    temp = false;
                    break;
                    
                }
            }
            // is prime number
            if(flag == 0)
            {
                //System.out.println("is prime number");
                temp = true;
            }
        }
        return temp;
        
    }
    
    public void Display()
    {
        for(int i=0;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    // method Main
    public static void main(String [] args)
    {
        //crete object
        Example9 obj1 = new Example9();
        Scanner sc = new Scanner(System.in);
        int num;
        do
        {
            num = sc.nextInt();
            obj1.add(num);
            
        }while(num != 0);
        obj1.maxNumber();
        
    }
}

