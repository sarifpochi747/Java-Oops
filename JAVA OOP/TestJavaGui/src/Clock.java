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
import java.awt.event.*;
public class Clock extends JFrame {
    //attribute
    public int h=0;
    public int m=0;
    public int s=0;

    //label
    JLabel lableTime;
    JButton btnstart = new JButton("Start");
    JButton btnstop = new JButton("Stop");
    JButton btnreset = new JButton("reset");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    //create object
    Timer timer;
    Listener l = new Listener();
    //constructor
    Clock()
    {
        //labelTime
        
        lableTime = new JLabel(String.format("%02d:%02d:%02d", h,m,s),JLabel.CENTER);
        lableTime.setFont(new Font("Arail",Font.BOLD,48));
        p1.add(lableTime);
        
        //set layout
        p2.setLayout(new GridLayout(1,3));
        p2.add(btnstart);
        p2.add(btnstop);
        p2.add(btnreset);
        
        btnstart.addActionListener(l);
        btnstop.addActionListener(l);
        btnreset.addActionListener(l);
        
        //set to frame
        setLayout(new BorderLayout());
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        //Timer
        timer = new Timer(1, e->{
            if(s<99)
            {
                s++;
                lableTime.setText(String.format("%02d:%02d:%02d", h,m,s));
            }
            else if(s>=99)
            {
                s=0;
                m++;
                lableTime.setText(String.format("%02d:%02d:%02d", h,m,s));
            }
            else if(m>=99)
            {
                s=0;
                m=0;
                h++;
                lableTime.setText(String.format("%02d:%02d:%02d", h,m,s));
            }
        });
        
        
    }

    class Listener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource() == btnstart)
            {
                timer.start();
                btnstart.setEnabled(false);
                
            }
            else if(e.getSource() == btnstop)
            {
                timer.stop();
                btnstart.setEnabled(true);
            }
            else if(e.getSource() == btnreset)
            {
                h=0;
                m=0;
                s=0;
                lableTime.setText(String.format("%02d:%02d:%02d", h,m,s));
                timer.stop();
                btnstart.setEnabled(true);
            }
            
        }

    }
    
    
    
    public static void main(String [] args)
    {
        JFrame frame = new Clock();
        frame.setSize(400,200);
        frame.setTitle("TIME WATCH");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
