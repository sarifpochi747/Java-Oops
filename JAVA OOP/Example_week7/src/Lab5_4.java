/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarif
 */

import java.util.*;
public class Lab5_4 {
    
    public int FindMax(int[][] a,int r,int c,int target)
    {
        int max =0;
        int temp = 0;
        for(int i=0;i<=r-target;i++)
        {
            for(int j=0;j<=c-target;j++)
            {
                for(int z=0;z<target;z++)    
                {
                    for(int k=0;k<target;k++)
                    {
                        temp += a[i+z][j+k];
                    }
                }
                max = (max>temp)?max:temp;
                temp = 0;
            
            }
        }
        return max;
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //input row and column
        int row = sc.nextInt();
        int column = sc.nextInt();
        int target = sc.nextInt();
        //create array
        int[][] arr = new int[row][column];
        
        //assign value to array
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                int num = sc.nextInt();
                arr[i][j] = num;
                
            }
        }
        //create object
        Lab5_4 obj = new Lab5_4();
        int result = obj.FindMax(arr, row, column,target);
        
        //Display
        System.out.format("MAX: %d\n",result);
    }
}


/*
Test Case
5 10
2
5 9 2 9 1 2 8 9 1 6
9 1 3 9 8 4 2 1 5 7
2 7 9 3 8 5 2 7 6 8
1 6 2 1 7 7 1 9 4 1
8 5 2 3 9 8 5 6 3 3
*/
