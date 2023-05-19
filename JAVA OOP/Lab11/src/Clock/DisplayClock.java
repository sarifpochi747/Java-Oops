/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clock;

/**
 *
 * @author sarif
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class DisplayClock extends JFrame {
    
    Clock c = new Clock();
    
    DisplayClock()
    {
        add(c);
        Timer timer = new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setCurrentTime();
                c.repaint();
            }
        });
        timer.start();
        
    }
    
    public static void main(String [] args)
    {
        JFrame frame = new DisplayClock();
        frame.setSize(800,500);
        frame.setTitle("THREAD");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    
}
