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
public class FindPokemon {
    
    public void Findpokemon(int[][] a,int h,int w)
    {
        int max =0;
        int c=0;
        int r =0;
        for(int i=0;i<h;i++)
        {
            for(int j=1;j<w;j++)
            {
                if((Math.abs(a[i][j-1] - a[i][j])) < 10)
                {
                    max = (max>(a[i][j-1] + a[i][j]))? max:(a[i][j-1] + a[i][j]);
                    r= (max>(a[i][j-1] + a[i][j]))? r:i;
                    c= (max>(a[i][j-1] + a[i][j]))? c:j-1;
                }
            }
        }
        for(int i=0;i<w;i++)
        {
            for(int j=1;j<h;j++)
            {
                if((Math.abs( a[j-1][i] - a[j][i] )) < 10)
                {
                    max = (max> (a[j-1][i] + a[j][i]))?max :( a[j-1][i] + a[j][i] );
                    r = (max>( a[j-1][i] +a[j][i] ))? r : j-1;
                    c = (max>( a[j-1][i] + a[j][i] ))? c :i;
                }
            }
        }
        System.out.format("max: %d row: %d column: %d",max,r+1,c+1);
    }
    
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // input height matrix
        int h = sc.nextInt();
        // input weight matrix
        int w = sc.nextInt();
        //create array for matrix;
        int[][] arr = new int[h][w];
        //assign value to matrix
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        //create object;
        FindPokemon obj = new FindPokemon();
        obj.Findpokemon(arr, h, w);
    }
    
    
    
}
