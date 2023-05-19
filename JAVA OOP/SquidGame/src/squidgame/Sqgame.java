/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squidgame;

/**
 *
 * @author sarif
 */



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.*;

public class Sqgame extends JFrame{
    Sqgame(){
        URL imageURL = this.getClass().getResource("./img/s1.png");
        Image image = new ImageIcon(imageURL).getImage(); //Contain Image
        add(new DrawArea(image));
    }
    
    //Inner class; JPanel;
    public static class DrawArea extends JPanel{ //Area for Drawing
        private Image image;
        //background
        URL backgroundURL = this.getClass().getResource("./img/bg1.jpg");
        Image bg = new ImageIcon(backgroundURL).getImage();
        Timer time = new Timer(100, new Listener());
        int x = 800;
        int y = 600;
        
        //Constructor
        DrawArea(Image img){
            setFocusable(true); //Focus on JPanel;
            this.image = img;
            time.start();
            
            //MouseListener
            addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    time.stop();
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    time.start();
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    
                }
            });
        }
        
        //Painter 
        @Override
        public void paintComponent(Graphics g){ //Graphic G = tool for drawing
            if(y >= 0){
                y = y -3;
            }
            
            super.paintComponent(g);
            g.drawImage(bg, 0, 0, getWidth(),getHeight(),this);
            g.drawImage(image, x,y, 100, 100,this);
        }
        
        //Listener 
        class Listener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
            
        }
    }
    
    
    public static void main(String[] args){
        JFrame game = new Sqgame();
        game.setTitle("Sq");
        game.setSize(1000,800);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}

