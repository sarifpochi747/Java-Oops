/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarif
 */
import java.util.*;

public class Lab5_1 {
    
    private double avg;
    private int max,min;
    
    
    //method average
    public void calAverage(int[][] a,int n,int z)
    {
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<z;j++)
            {
            
                avg += a[i][j];
            }
        }
        avg /=(n*z);
    }
    
    public void findmax(int[][] a,int n,int z)
    {
        max = a[0][0];
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<z;j++)
            {
            
                max = (max>a[i][j])?max:a[i][j];
            }
        }
        
        
    }
    public void findmin(int[][] a,int n,int z)
    {
        min = a[0][0];
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<z;j++)
            {
            
                min = (min<a[i][j])?min:a[i][j];
            }
        }
        
        
    }
    
    public void filter(int[][] a,int n,int z)
    {
        int x=0;
        int y =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<z;j++)
            {
            
                if(a[i][j] % 2 != 0)
                {
                    a[x][y] = a[i][j];
                    System.out.format("%2d", a[x][y]);
                    y++;
                }
                if(y==z)
                {
                    x ++;
                    y=0;
                }
            }
        }
        
       
    }
    public void display()
    {
        System.out.format("avg: %.2f\n", avg);
        System.out.format("max: %d\n", max);
        System.out.format("min: %d\n", min);
    }
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        //get array
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int n = sc.nextInt();
                arr[i][j] = n;
            }
        }
        
        //create object
        Lab5_1 obj = new Lab5_1();
        obj.calAverage(arr, r, c);
        obj.findmax(arr, r, c);
        obj.findmin(arr, r, c);
        obj.display();
        obj.filter(arr, r, c);
        
    }
}

/*
Test Case
5 10
5 9 2 9 1 2 8 9 1 6
9 1 3 9 8 4 2 1 5 7
2 7 9 3 8 5 2 7 6 8
1 6 2 1 7 7 1 9 4 1
8 5 2 3 9 8 5 6 3 3
*/