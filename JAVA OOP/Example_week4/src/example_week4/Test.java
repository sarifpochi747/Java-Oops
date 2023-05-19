/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week4;

/**
 *
 * @author sarif
 */


class T {
    static int i = 0;
    
    int j = 0;
    
    //constructor
    T() {
        i++;
        j = 1;
        //System.out.println(i);
    }
}

public class Test {
public static void main(String[] args) {

    //create object
    T t1 = new T();
    System.out.println("t1's i = " + t1.i + " and j = " +t1.j);
    T t2 = new T();
    
    System.out.println("t2's i = " + t2.i + " and j = " +t2.j);
    
    }
}


