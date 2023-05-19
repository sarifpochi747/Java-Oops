package gui;


/**
 *
 * @author sarif
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KeyEventDemo extends JFrame {
    
    //attribute
    private int x =100;
    private int y = 100;
    private char keyChar = 'A';
    JPanel p1 = new JPanel();
    JLabel lb = new JLabel("0,0",JLabel.LEFT);
    //create object DrawArea
    DrawArea d = new DrawArea();
    //constructor
    KeyEventDemo()
    {
        lb.setBounds(0,0,50,20);
        lb.setForeground(Color.white);
        lb.setFont(new Font("TimesRoman",Font.BOLD, 24));
        lb.setOpaque(true);
        lb.setBackground(Color.BLACK);
        p1.add(lb);
        p1.setFocusable(true);
        p1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)
        {
            lb.setText(e.getX()+","+e.getY());
            lb.setLocation(e.getX(),e.getY());
        }
        });

        
        //set into Frame
        setLayout(new GridLayout(1,2));
        add(d);
        add(p1);
        d.setFocusable(true);
        d.addKeyListener( new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                //super.keyPressed(e);
                repaint();
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_DOWN: y+=10;
                        break;
                    case KeyEvent.VK_UP: y-=10;
                        break;
                    case KeyEvent.VK_RIGHT: x+=10;
                        break;
                    case KeyEvent.VK_LEFT:  x-=10;
                }
            }
        });
        

    }
    
    
    
    //paper for paint
    //inner class
    class DrawArea extends JPanel{
       
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            //setFont
            g.setFont(new Font("TimesRoman",Font.BOLD, 24));
            //srawString
            g.drawString(String.valueOf(keyChar), x, y);
        }
        
        
    } 
    
    
    
    
    //mainMethod
    public static void main(String[] args){
        JFrame frame = new KeyEventDemo();
        frame.setTitle("KeyBoard");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
