
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawCircle extends JFrame{
    //button
    public JButton jbtEnlarge = new JButton("ENLARGE");
    public JButton jbtEnShrink = new JButton("ENSHRINK");
    public Circle screen = new Circle();

    //constructor;
    DrawCircle()
    {
        Listener lst = new Listener();
        //create panel p1
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        p1.add(jbtEnlarge);
        p1.add(jbtEnShrink);
        jbtEnlarge.addActionListener(lst);
        jbtEnShrink.addActionListener(lst);




        //set Jfram
        setLayout(new BorderLayout());
        add(screen,BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);
    }

      //inner class
    //class Listener action as listener

    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == jbtEnlarge)
            {
                screen.enlarge();
            }
            else if(e.getSource() == jbtEnShrink)
            {
                screen.enshrink();
            }
        }

    }



    public static void main(String[] args) {
        JFrame frame = new DrawCircle();
        frame.setTitle("SARIF");
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);// set frame to center moniter
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set when close 
        frame.setVisible(true); // set show monitor
    }
    
}


class Circle extends JPanel{
    public int radius = 5;


    public void enlarge()
    {
        radius+=5;
        //call method paint component auto
        repaint();
    }

    public void enshrink()
    {
        radius-=5;
        //call method paint component auto
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g)
    {
        //call super contructor
        super.paintComponent(g);
        g.drawOval(getWidth()/2- radius, getHeight()/2- radius, 2*radius, 2*radius);
        
    }
}