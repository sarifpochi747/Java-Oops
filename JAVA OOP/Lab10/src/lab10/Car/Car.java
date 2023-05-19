/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10.Car;

/**
 *
 * @author sarif
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class Car extends JPanel implements KeyListener {
    
    private int xBase;
    private int x,y,radius;
    private int speed;
    private boolean flag = true;
    Thread carThread ;
    Car(int x,int y,int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xBase = x+speed;
        this.addKeyListener(this);
//        timer = new Timer(10, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                xBase +=10;
//                repaint();
//            }
//            
//        });
        this.setFocusable(true);
        
        
        carThread = new Thread(){
            @Override
            public void run()
                {
                    while(true)
                    {
                        xBase +=10;
                        repaint();
                        try
                        {
                            sleep(100);
                        }catch(InterruptedException ex) { }
                    }
                }
            
        };
        carThread.start();

        
    }
    
    
    
    //drawCar//
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(xBase < getWidth())
        {
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
        else
        {
            xBase = x+speed;
        }
            
    }
    
    
    public void carGO()
    {
        if(flag)
        {
            flag = false;
            //timer.start();
            carThread.resume();
        }
        else
        {
            flag = true;
            //timer.stop
            carThread.suspend();
        }
            
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == 32)
        {
            carGO();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
    
    
    
}
