/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tank;

/**
 *
 * @author sarif
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Tank extends JPanel implements KeyListener{
    private int xT = 300;
    private int yT = 440;
    private int xS = xT+35;
    private int yS = yT - 40;
    private int widthT = 80;
    private int heightT = 30;
    private int widthS = 10;
    private int heightS = 40;
    private ArrayList <SmallBall> smallball = new ArrayList<SmallBall>();
    public Tank()
    {
        this.setFocusable(true);
        this.addKeyListener(this);
        
    }
    
    
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillRect(xT, yT, widthT, heightT);
        g.setColor(Color.red);
        g.fillRect(xS, yS, widthS, heightS);
        
        for(int i=0;i<smallball.size();i++)
        {
            SmallBall s = smallball.get(i);
            if(s.y > 0)
            {
                g.fillOval(s.x, s.y, s.r, s.r);
                
            }
            else
            {
                smallball.remove(s);
            }
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == 37 && xT > 0)
        {
            xT -=5;
            xS -=5;
            repaint();
        }
        if(e.getKeyCode() == 39 && xT < getWidth())
        {
            xT +=5;
            xS +=5;
            repaint();
        }
        
        if(e.getKeyCode() == 38 || e.getKeyCode() == 32)
        {
            smallball.add(new SmallBall(xS,yT-50,this));
            repaint();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}


class SmallBall 
{
    public int x,y,r;
    
    public SmallBall(int x,int y1,JPanel game)
    {
        this.x =x ;
        this.y =y1;
        this.r = 10;
        Thread th_smallball = new Thread (new Runnable(){
            @Override
            public void run() {
                while(true)
                {
                    y -= 10;
                    game.repaint();
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){}

                }
            }
        });
        th_smallball.start();
        
    }
    
    
}