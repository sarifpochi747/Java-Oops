package gui;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Microwave extends JFrame
{
    public JButton  jbtNumber;
    public JButton  jbtzero;
    public JButton  jbtstart;
    public JButton  jbtstop;
    public JTextField jtf ;
    public boolean check = true;
    //constructor
    /**
     * 
     */
    Microwave()
    {
        //button
        //create panel p1
        // Listener
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));
        Listener lst = new Listener();
        //add button to panel p1
    
        for (int i = 1; i <=9; i++) {
            jbtNumber = new JButton(""+i);
            //listener
            jbtNumber.addActionListener(lst);
            p1.add(jbtNumber);
        }
        jbtzero = new JButton(""+0);
        jbtstart = new JButton("start");
        jbtstop = new JButton("stop");
        jbtzero.addActionListener(lst);
        jbtstart.addActionListener(lst);
        jbtstop.addActionListener(lst);
        p1.add(jbtzero);
        p1.add(jbtstart);
        p1.add(jbtstop);
        
        //create panel p2
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2,1));
        //add textfeild to p2 
        jtf = new JTextField();
        p2.add(jtf);
        p2.add(p1); 

        // add content into frame
        setLayout(new GridLayout(1,2));
        add(new JButton("FOOD TO BE PLACE HERE"));
        add(p2);

    }
    //create Listener
    //inner classs
    class Listener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource() == jbtstart)
            {
                jbtzero.setEnabled(false);
                
            }else if(e.getSource() == jbtstop){
                
                jbtzero.setEnabled(true);
            }
            else
            {
               jtf.setText(jtf.getText()+((JButton) e.getSource()).getText());
            }
            
            
        }

    }

    public static void main(String [] args)
    {
        JFrame frame = new Microwave();
        frame.setTitle("SARIF");
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);// set frame to center moniter
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set when close 
        frame.setVisible(true); // set show monitor
    }
    
}