package gui;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2 extends JFrame {
    //atribute
    // create component

    // label and input feild
    public JLabel jlbFName = new JLabel("FIRSTNAME");
    public JTextField jlfFName = new JTextField(10);
    public JLabel jlbLName = new JLabel("LASTNAME");
    public JTextField jlfLName = new JTextField(10);

    //button
    public JButton jbtOk = new JButton("OK");
    public JButton jbtcancel = new JButton("CANCEL");
    
    //show detail
    public JLabel jlbdetail = new JLabel("DETAIL");
    public JTextField jlfdetail = new JTextField(40);


    //constructor
    GUI2()
    {
        //set Layout Manager -> flowLayout , GridLayout(row,column),BorderLayout
        //setLayout(new FlowLayout());
        setLayout(new GridLayout(4,2));
        // add componet
        add(jlbFName);
        add(jlfFName);
        add(jlbLName);
        add(jlfLName);
        add(jlbdetail);
        add(jlfdetail).setEnabled(false);
        add(jbtOk);
        add(jbtcancel);
        
        
        //create Object Listener
        Listener lst = new Listener();
        jbtOk.addActionListener(lst);
        jbtcancel.addActionListener(lst);
    }


    //inner class
    //class Listener action as listener

    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("OK"))
            {
                String s = jlfFName.getText() + " " + jlfLName.getText();
                jlfdetail.setText(s);
            }
            else if(e.getActionCommand().equals("CANCEL"))
            {
                jlfdetail.setText("");
                jlfFName.setText("");
                jlfLName.setText("");
            }

        }
        
    }
    public static void main(String [] args)
    {
        JFrame frame = new GUI2();
        frame.setTitle("SARIF");
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);// set frame to center moniter
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set when close 
        frame.setVisible(true); // set show monitor
    }
}