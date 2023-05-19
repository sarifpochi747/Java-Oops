package example_week6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarif
 */

import java.util.Scanner;

public class Lab4_4 {
    
    public void SortMethod(double[] a){
        for(int i = 0; i<a.length-1 ;i++){
            for(int j = i+1; j< a.length; j++){
                double temp;
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        } 
    }
    
    public void FreqMethod(double[] a){
        int count = 0;
        for(int i = 0; i<a.length-1 ;i++){
            for(int j = i+1; j< a.length; j++){
                double temp;
                if(a[i] == a[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
    
 public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] A = new double[n];
        for(int i = 0; i<n;i++){
            double x = sc.nextDouble();
            A[i] = x;
        }
        
        Lab4_4 obj = new Lab4_4();
        obj.SortMethod(A);
        for(int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        obj.FreqMethod(A);
    }   
}



