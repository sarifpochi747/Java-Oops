/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tank;

/**
 *
 * @author sarif
 */
import javax.swing.*;
import java.awt.*;
public class Display extends JFrame{
    
    Tank t = new Tank();
    Display()
    {
        add(t);
    }
    
    
    
    public static void main(String[] args)
    {
        JFrame frame = new Display();
        frame.setTitle("Tanks");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    }
    
}
