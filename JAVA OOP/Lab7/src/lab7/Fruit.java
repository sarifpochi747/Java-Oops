/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

/**
 *
 * @author sarif
 */
public class Fruit {
    @Override
    public String toString(){
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString(){
        return "Apple";
    }
}

class Orange extends Fruit {
    @Override
    public String toString(){
        return "Orange";
    }
}

class GoldenDelicious extends Apple {
    @Override
    public String toString(){
        return "GoldenDelicios";
    }
}

class Macintosh extends Apple {
    @Override
    public String toString(){
        return "Macintosh";
    }
}

class Main1 {
    public static void main(String[] args){
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange() ; 
        System.out.println("1.Is fruit instanceof Orange? ->"+(fruit instanceof Orange));
        System.out.println("2.Is fruit instanceof Apple? ->"+(fruit instanceof Apple));
        System.out.println("3.Is fruit instanceof GoldenDelicious? ->"+(fruit instanceof GoldenDelicious));
        System.out.println("4.Is fruit instanceof Macintosh? ->"+(fruit instanceof Macintosh));
        System.out.println("5.Is orange instanceof Orange? ->"+(orange instanceof Orange));
        System.out.println("6.Is orange instanceof Fruit? ->"+(orange instanceof Fruit));
//        System.out.println("7. Is orange instanceof Apple? ->"+(orange instanceof Apple));
        System.out.println("8.1Can fruit invoke Apple class? ->"+(fruit instanceof Apple));
//        System.out.println("8.2 Can Orange invoke Apple class? ->"+(orange instanceof Apple));
        System.out.println("9.1Can orange invoke Orange class? ->"+(orange instanceof Orange));
        System.out.println("9.2Can fruit invoke Orange class? ->"+(fruit instanceof Orange));
    }
}