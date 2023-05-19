/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sarif
 */

abstract class Shape{
    
    abstract void draw();
}

class Rectangle extends Shape{
    
    @Override
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape{
    
    @Override
    // used properties class shape
    void draw(){
        System.out.println("Drawing Circle");
    }
}

// main class
public class TestShape {

    
    public static void main(String[] args) {
        // TODO code application logic here
        // create object
        Shape obj1 = new Rectangle();
        Shape obj2 = new Circle();
        obj1.draw();
        obj2.draw();
        
    }
    
}
