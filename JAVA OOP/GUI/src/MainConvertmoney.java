import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
class Convertmoney extends JFrame {

    // attribute
    //create component

    public JLabel jlbmonney1= new JLabel("USD");
    public JTextField jtfmoney1 = new JTextField();
    public JLabel jlbmonney2 = new JLabel("THB");
    public JTextField jtfmoney2 = new JTextField();

    //button
    public JButton btnChange = new JButton("Change");
    public JButton btnReset = new JButton("Reset");


    Convertmoney()
    {
        //create event listener

        


        //create panel p1 for label usd and textField usd
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(jlbmonney1,BorderLayout.WEST);
        p1.add(jtfmoney1,BorderLayout.CENTER);
        jtfmoney1.addActionListener(lst);
        
        //create panel p2 for label thb and textField thb
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(jlbmonney2,BorderLayout.WEST);
        p2.add(jtfmoney2,BorderLayout.CENTER);
        jtfmoney2.setEnabled(false);

        // create pane p3 for button
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(2,1));
        p3.add(btnChange);
        p3.add(btnReset);
        btnChange.addActionListener(lst);
        btnReset.addActionListener(lst);


        //create panel p4 for p1 ,p2
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(2,1));
        p4.add(p1);
        p4.add(p2);

        //add to Frame
        setLayout(new BorderLayout());
        add(p4,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);




    }

    //inner classs Listener action as listener
    class Listener implements ActionListener
    {
        private double rate = 35.3;
        private double thbChange ;

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource() == btnChange)
            {
                thbChange = 0;
                thbChange = rate *  Double.parseDouble(jtfmoney1.getText());
                jtfmoney2.setText(Double.toString(thbChange));
            }
            else if(e.getSource() == btnReset)
            {
                thbChange = 0;
                jtfmoney1.setText("");
                jtfmoney2.setText("");
            }
        }

    }

    Listener lst = new Listener();
    
}

public class MainConvertmoney
{
    public static void main(String[] args)
    {
        JFrame frame = new Convertmoney();
        frame.setTitle("Change Money");
        frame.setSize(300,180);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}



