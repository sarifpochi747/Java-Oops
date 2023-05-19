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
public class Example3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double area,s;
        Double side1,side2,side3;
        Double x1,y1;
        Double x2,y2;
        Double x3,y3;
        System.out.print("Enter three points for a triangle:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        side1 = Math.pow((Math.pow(x1-x2,2))+Math.pow((y1-y2), 2),0.5);
        side2 = Math.pow((Math.pow(x1-x3,2))+Math.pow((y1-y3), 2),0.5);
        side3 = Math.pow((Math.pow(x2-x3,2))+Math.pow((y2-y3), 2),0.5);
        s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.print(String.format("The area of the triangle is %.2f",area));
    }
}
