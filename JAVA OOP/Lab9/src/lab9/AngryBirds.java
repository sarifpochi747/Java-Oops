/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author sarif
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AngryBirds extends JFrame {
    public AngryBirds() {
        add(new ImagePanel());
    }
    public static void main(String[] args) {
        AngryBirds frame = new AngryBirds();
        frame.setTitle("Angry Birds");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ImagePanel.click = true;
                if(ImagePanel.click){
                    input.mouseCoords = e.getY();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ImagePanel.click = false;
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}

class ImagePanel extends JPanel{
    public static boolean Delete = false, click =false ,run=false;
    public double y;
    public static int score = 0;
    private ImageIcon bg = new ImageIcon(this.getClass().getResource("bg.png"));
    private ImageIcon bird = new ImageIcon(this.getClass().getResource("red.png"));
    private ImageIcon pig = new ImageIcon(this.getClass().getResource("pig.png"));
    private Image BG = bg.getImage();
    private Image BIRD = bird.getImage();
    private Image PIG = pig.getImage();
    private Timer timer = new Timer(3,new Listener());

    public ImagePanel(){
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(BG != null){
            g.drawImage(BG, 0, 0, getWidth(), getHeight(), this);
            g.setColor(Color.white);
            g.setFont(new Font("", Font.BOLD, 60));
            g.drawString("Score = "+score, 120, 100);

            if(!Delete){
                g.drawImage(PIG ,980 ,560 ,100 ,100 ,this);
            }

            g.drawImage(BIRD ,input.recW ,input.recH ,100 ,100 ,this);
            if(click){
                run = true;
                y = (560-input.mouseCoords)/100 + 3;
            }
            if(run && !Delete){
                if(input.recW >= 1180){
                    run=false;
                    input.recW = 120;
                    input.recH = 560;
                    y=0;
                }
                if(input.recW<1180){
                    input.recW+=6;
                    y-=0.1;
                    input.recH-=y;
                    input.isRect();
                }
            }
            else if(Delete){
                new Thread() {
                    public void run() {
                        try {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e) {}
                        run = false;
                        Delete = false;
                        input.recW = 120;
                        input.recH = 560;
                        y = 0;
                    }
                }.start();
            }
        }
    }

    class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            repaint();
        }
    }
}
class input{
    public static int mouseCoords;
    public static int recW = 120;
    public static int recH = 560;

    public static Rectangle BirdRect(){
        return new Rectangle(recW,recH,90,90);
    }
    public static Rectangle PigRect(){
        return new Rectangle(980,560,80,80);
    }
    public static void isRect(){
        if(BirdRect().intersects(PigRect())){
            ImagePanel.Delete = true;
            ImagePanel.score += 10;
        }
    }
}
