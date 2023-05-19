package Car;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarif
 */

import java.awt.*;
import javax.swing.*;
public class DisplayCar extends JFrame {
    
    //create obejct
    Car c = new Car();
    DisplayCar()
    {
        //setFrame
        add(c);
    }
    
    
    public static void main(String [] args)
    {
        JFrame frame= new DisplayCar();
        frame.setSize(800,600);
        frame.setTitle("Car");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    
}
