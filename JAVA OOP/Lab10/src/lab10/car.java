/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author sarif
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class car {
     public static void main(String[] args) {
        JFrame frame = new PlayGame();
        frame.setSize(600,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
class PlayGame extends JFrame{
    JLabel lbCar1 = new JLabel("speedcar1");
    JLabel lbCar2 = new JLabel("speedcar2");
    JLabel lbCar3 = new JLabel("speedcar3");
    JLabel lbCar4 = new JLabel("speedcar4");
    JTextField speedCar1 = new JTextField(7);
    JTextField speedCar2 = new JTextField(7);
    JTextField speedCar3 = new JTextField(7);
    JTextField speedCar4 = new JTextField(7);
    RaceCar car1 = new RaceCar();
    RaceCar car2 = new RaceCar();
    RaceCar car3 = new RaceCar();
    RaceCar car4 = new RaceCar();
    listener l = new listener();
    public PlayGame(){
        setLayout(new BorderLayout());
        speedCar1.addActionListener(l);
        speedCar2.addActionListener(l);
        speedCar3.addActionListener(l);
        speedCar4.addActionListener(l);
        JPanel p1 = new JPanel();
        p1.add(lbCar1);
        p1.add(speedCar1);
        p1.add(lbCar2);
        p1.add(speedCar2);
        p1.add(lbCar3);
        p1.add(speedCar3);
        p1.add(lbCar4);
        p1.add(speedCar4);
        JPanel p2 = new JPanel(new GridLayout(4, 1));
        p2.add(car1);
        p2.add(car2);
        p2.add(car3);
        p2.add(car4);
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
    }

    class listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == speedCar1){
                int speed1 = Integer.parseInt(speedCar1.getText());
                car1.speed = speed1;
            }
            if (e.getSource() == speedCar2){
                int speed2 = Integer.parseInt(speedCar2.getText());
                car2.speed = speed2;
            }
            if (e.getSource() == speedCar3){
                int speed3 = Integer.parseInt(speedCar3.getText());
                car3.speed = speed3;
            }
            if (e.getSource() == speedCar4){
                int speed4 = Integer.parseInt(speedCar4.getText());
                car4.speed = speed4;
            }
        }
    }
}

class RaceCar extends JPanel {
    private int xBase = 0;
    int speed = 0;
    private Timer timer = new Timer(10, new Listener());
    public RaceCar() {
        timer.start();
        this.setFocusable(true);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int yBase = getHeight();
        if (xBase > getWidth()) {
            xBase = -20;
        } else {
            xBase += speed;
        }
        g.setColor(Color.BLACK);
        g.fillOval(xBase + 10, yBase - 10, 10, 10);
        g.fillOval(xBase + 30, yBase - 10, 10, 10);
        g.setColor(Color.GREEN);
        g.fillRect(xBase, yBase - 20, 50, 10);
        g.setColor(Color.RED);
        Polygon polygon = new Polygon();
        polygon.addPoint(xBase + 10, yBase - 20);
        polygon.addPoint(xBase + 20, yBase - 30);
        polygon.addPoint(xBase + 30, yBase - 30);
        polygon.addPoint(xBase + 40, yBase - 20);
        g.fillPolygon(polygon);
    }
}

