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
public class isConsectiveFour {
    
    public boolean isConsectiveHorizon(int[][] a,int h,int w)
    {
        int value = a[0][0];
        int count =1;
        for(int i=0;i<h;i++)
        { 
            count = 1;
            for(int j=0;j<w;j++)
            {
                if(i==0&&j==0)
                {
                    continue;
                }
                else if(value == a[i][j])
                {
                    count ++;
                }
                else if(count == 4)
                {
                    i =  h;
                    break;
                }
                else
                {
                    value = a[i][j];
                    count = 1;
                }
                
            }
        }
        return count == 4;
    }
    
    public boolean isConsectiveVertical(int[][] a,int h,int w)
    {
        int value = a[0][0];
        int count =1;
        for(int i=0;i<w;i++)
        {
            count = 1;
            for(int j=0;j<h;j++)
            {
                if(i==0&&j==0 && value == a[j+1][i])
                {
                    count ++;
                }
                else if(value == a[j][i])
                {
                    count ++;
                }
                else if(count == 4)
                {
                    
                    break;
                }
                else
                {
                    value = a[j][i];
                    count = 1;
                }
            }
            if(count==4)
            {
                break;
            }
            
        }
        return count == 4;
    }
    
    public boolean DiagonalRight(int[][] a,int h,int w)
    {
        int value = a[0][0];
        int count = 1;
        //DaigonalRight Upper
        for(int k=3;k<h;k++)
        {
            int j=0;
            for(int i=k;i>=0;i--,j++)
            {
                if(value == a[i][j])
                {
                    count++;
                }
                else if(count == 4)
                {
                    k = h+1;
                    break;
                }
                else
                {
                    value = a[i][j];
                    count =1;
                }
            }
            if(count == 4)
            {
                break;
            }
            
        }
        if(count <4)
        {
            //Diagonal Right Lowwer
            for(int k=1;k<w-3;k++)
            {
                int i =h-1;
                count = 1;
                for(int j=k;j<w;j++,i--)
                {
                 if(value == a[i][j])
                    {
                        count++;
                    }
                    else if(count == 4)
                    {
                        k = h+1;
                        break;
                    }
                    else
                    {
                        value = a[i][j];
                        count =1;
                    }
                }
                if(count == 4)
                {
                    break;
                }
                
            }
        }
        
        return count == 4;
    }
    
    public boolean DiagonalLeft(int[][] a,int h,int w)
    {
        int count = 1;
        int value = a[0][0];
        //DiagonalLeft Upper
        for(int k=0;k<w-2;k++)
        {
            int j =k;
            for(int i=0;i<h-k;i++,j++)
            {
                if(i==0&&j==0)
                {
                    continue;
                }

                else if(value == a[i][j])
                {
                    count++;
                }
                else if(count == 4)
                {
                    break;
                }
                else
                {
                    value = a[i][j];
                    count =1;
                }
            }
            if(count== 4)
            {
                break;
            }
            
                
        }
        if(count < 4)
        {
            //Diagonal KeftLowwer
            for(int k=1;k<h-2;k++)
            {
                int j=0;
                
                for(int i=k;i<h;i++)
                {
                    if(value == a[i][j])
                {
                    count++;
                }
                else if(count == 4)
                {
                    break;
                }
                else
                {
                    value = a[i][j];
                    count =1;
                }
                }
                if(count == 4)
                {
                    break;
                }
            }
        }
        
        
        return count == 4;
    }
    public boolean isConsectiveDiagonal(int[][] a,int h,int w)
    {
        
        if(DiagonalRight(a,h,w))
        {
            System.out.format("isConsecutive : DiagonalRight");
            return true;
        }else if(DiagonalLeft(a,h,w))
        {
            System.out.format("isConsecutive : DiagonalLeft");
            return true;
        }else
        {
            System.out.format("isNotConsecutive\n");
            return false;
        }
        
        
        
    }
            
            
    public void isConsecutiveFour(int[][] a,int h,int w)
    {
        if(isConsectiveVertical(a,h,w) )
        {
            System.out.format("isConsecutive : Vertical");
        }
        else if(isConsectiveHorizon(a,h,w))
        {
            
            System.out.format("isConsecutive : Horizon");
        }
        else if( isConsectiveDiagonal(a,h,w))
        {
        }
        else 
        {
            
            System.out.format("isNotConsecutive\n");
        }
        
        
        
        
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  h = sc.nextInt();
        int w  = sc.nextInt();
        int[][] arr = new int[h][w];
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        //create object
        isConsectiveFour obj = new isConsectiveFour();
        obj.isConsecutiveFour(arr, h, w);
        /*
        test case
        6 7
        0 0 0 1 0 1 1
        1 1 0 0 6 0 1
        5 5 2 1 8 2 9
        6 0 6 1 1 9 1
        1 5 6 1 4 0 7
        0 5 0 1 1 6 1
        4 4
        1 2 3 4 
        5 1 7 8
        9 10 1 12
        13 14 15 1
         
        */
    }
}
