package gui;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Fan extends JFrame{
    //attribute
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    //timer -> ทุกๆๆ 1 วิจะไปเรียกให้ object ไม่มีชื่อ 
    Listener l = new Listener();
    Timer timer = new Timer(1, l);
    int speed = 1;
    int A;
    
    //create object Arcs panel
    ArcsPanel arcs = new ArcsPanel();
    //coonstructor
    Fan()
    {
        //create panel p1 for button
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,5));
        p1.add(btn0);
        p1.add(btn1);
        p1.add(btn2);
        p1.add(btn3);
        p1.add(btn4);

        // add ActionListener
        btn0.addActionListener(l);
        btn1.addActionListener(l);
        btn2.addActionListener(l);
        btn3.addActionListener(l);
        btn4.addActionListener(l);
        

        //setFrame
        setLayout(new BorderLayout());
        add(arcs,BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);



    }
    //inner class
    class ArcsPanel extends JPanel {
        
        //timer start
        //Painting
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int xCenter = getWidth() / 2;
            int yCenter = getHeight() / 2;
            int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
            System.out.println("1");
            int x = xCenter - radius;
            int y = yCenter - radius;

            g.fillArc(x, y, 2*radius,2* radius,speed+ 0, 30);
            g.fillArc(x, y, 2*radius,2* radius,speed+ 90, 30);
            g.fillArc(x, y, 2*radius,2* radius, speed+180, 30);
            g.fillArc(x, y, 2*radius,2* radius, speed+270, 30);

            if(A == 1){
                speed+=10;
            }
            else if(A == 2){
                speed+=15;
            }
            else if(A == 3){
                speed+=20;
            }
            else if(A == 4){
                speed += 40;
            }
            
        }
    }


    //inner class
    class Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
            if(e.getSource() == btn0){
                timer.stop();
            }
            else if(e.getSource() == btn1){
                timer.start();
                A = 1;
            }
            else if(e.getSource() == btn2){
                timer.start();
                A = 2;
            }
            else if(e.getSource() == btn3){
                timer.start();
                A = 3;
            }
            else if(e.getSource() == btn4){
                timer.start();
                A = 4;
            }
            
        }   
    }
    public static void main(String[] args){
        JFrame frame = new Fan();
        frame.setTitle("Fan");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
