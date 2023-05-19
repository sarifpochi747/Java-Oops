import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class BalloonPanel extends JPanel
{
    //attribute
    final static int BALLOON_RADIUS = 10;
    final static int BALL_RADIUS = 5;
    final static int GUN_LENGTH = 25;
    final static int PANEL_WIDTH = 200;
    final static int PANEL_HEIGHT = 100;
    final static int UPDATE_RATE = 60 ;
    public void paint(Graphics g)    
    {
        
    }
}

public class Test2 extends JFrame{
    
    Test2()
    {

    }




    public static void main(String [] args)
    {
        JFrame frame = new Test2();
		frame.setSize(600,400);
		frame.setTitle("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
