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
public class Lab4_5 {
    
    
    static void printMatrix(int M[][],
                            int rowSize,
                            int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
 
            System.out.println();
        }
    }
    static void multiplyMatrix(
        int row1, int col1, int A[][],
        int row2, int col2, int B[][])
    {
        int i, j, k;
 
        // Check if multiplication is Possible
        if (col1 == row2) {
 
            
            // Matrix to store the result
            int C[][] = new int[row1][col2];
 
            // Multiply the two matrices
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col2; j++) {
                    for (k = 0; k < row2; k++)
                        C[i][j] += A[i][k] * B[k][j];
                }
            }
            printMatrix(C,row1,col2);
            
        }
        else
        {
            System.out.println("\nMultiplication Not Possible");
        }
        
        
        
        
    }
    
    
    public static void main(String [] args)
    {
        //declaration array of matrix
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        
        int[][] matrix1 = new int[r1][c1];
        
        
        //matrix1
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                int num = sc.nextInt();
                matrix1[i][j] = num;
            }
        }
        
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] matrix2 = new int[r2][c2];
        // matrix 2
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                int num = sc.nextInt();
                matrix2[i][j] = num;
            }
        }
        System.out.println("r1 "+r1);
        System.out.println("c1 "+c1);
        System.out.println("r2 "+r2);
        System.out.println("c2 "+c2);
        multiplyMatrix(
        r1, c1, matrix1,
       r2, c2, matrix2);
        
        
        
    }
}
