/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example;

/**
 *
 * @author sarif
 */
import java.util.*;
public class Example6 {
    public static void main(String [] args ){
        int col,row,result =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input number of columns and rows => ");
        col = sc.nextInt();
        row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                result = i * j;
                if( i ==1 && j== 1 ){
                    System.out.print("\t");
                }
                else{
                    
                    System.out.print(result+"\t");
                }
            }
            System.out.print("\n");
        }
    }
}
