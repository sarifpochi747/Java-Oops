/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author sarif
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Car extends JPanel
{
    public int x;
    public int y = 500;
    public int radius = 10;
    public int xBase = 20;
    public int countCar = 4;
    public Car()
    {
        
        th_Go.start();
    }
    
    Thread th_Go = new Thread(new Runnable(){
        @Override
        public void run() {
          while(true)
          {
              if(xBase < getWidth())
              {
                  xBase+=5;
              }
              else
              {
                  xBase = 20;
              }
                repaint();
              try{
                  Thread.sleep(5);
              } catch(InterruptedException e){}
          }
           
        }
    });
    
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //roller car
        g.setColor(Color.gray);
        g.fillOval(xBase,y , 2*radius, 2*radius);
        g.fillOval(xBase+40,y,2*radius,2*radius);

        //bodycar
        g.setColor(Color.GREEN);
        g.fillRect(xBase-10,y-2*radius,80,20);
        g.setColor(Color.red);
        g.fillRect(xBase+10,y-15-2*radius,40,15);
        
    }
}

