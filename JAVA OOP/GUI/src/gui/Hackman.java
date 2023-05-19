/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author sarif
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Hackman extends JFrame{
    //attribute
    Timer timer = new Timer(1, new Listener());
    int xrighttop = 200;
    int xlefttop = 120;
    int x=0;
    int y=0;
    int b=0;

    //create object Draw Area
    DrawArea a = new DrawArea();
    //constructor
    Hackman()
    {
        add(a);
    }
    
    
    class DrawArea extends JPanel
    {
        @Override
        public void paintComponent(Graphics g)
        {
            timer.start();
            //structure
            super.paintComponent(g);
            g.drawArc(20, 220, 80, 40, 0, 180);
            g.drawLine(20 + 40, 220, 20 + 40, 20);
            g.drawLine(20 + 40, 20, 20 + 40 + 100, 20);
            
            if(160 - x ==xrighttop || 160 + y==120)
            {
                b=1;
            }
            else if(160 - x ==xlefttop || 160 + y==200)
            {
                b=0;
            }
            
            int radius = 20;
            g.drawLine(20 + 40 + 100, 20, 20 + 40 + 100-x, 40);
            //body
            //head
            g.drawLine(160, 20, 160-x, 40);
            g.drawOval(20 + 40 + 100 - x - radius, 40, 2*radius, 2*radius);  //head
            g.drawLine(20 + 40 + 100 - x - (int)(radius * Math.cos(Math.toRadians(45))),40 + radius + 
                    (int)(radius * Math.sin(Math.toRadians(45))),20 + 40 + 100 - 60-x*2, 40 + radius + 60); //a-left
            g.drawLine(20 + 40 + 100 - x + (int)(radius *Math.cos(Math.toRadians(45))),40 + radius + 
                    (int)(radius * Math.sin(Math.toRadians(45))),20 + 40 + 100 + 60-x*2, 40 + radius + 60);//a-right
            g.drawLine(20 + 40 + 100 - x, 40 + 2* radius,160-x*2, 40 + radius + 80);  //body
            g.drawLine(20 + 40 - 2 * x + 100, 40 + radius + 80, 140-x*3,40 + radius + 80 + 40);//l-left
            g.drawLine(20 + 40 - 2 * x + 100, 40 + radius + 80, 180-x*3,40 + radius + 80 + 40);//l-left
            if(b==1)
            {
                x++;
                y++;
            }else if(b==0)
            {
                x--;
                y--;
            }
        }
    }
    
    
    //inner class Listener
    //inner class
    class Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }   
    }
    
    
    public static void main(String[] args){
        JFrame frame = new Hackman();
        frame.setTitle("HackMan");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    
}
