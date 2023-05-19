/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;

/**
 *
 * @author sarif
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class LoanCalculator extends JFrame {
   // Create text fields for interest rate, years
   // loan amount, monthly payment, and total payment
   private JTextField jtfAnnualInterestRate = new JTextField();
   private JTextField jtfNumberOfYears = new JTextField();
   private JTextField jtfLoanAmount = new JTextField();
   private JTextField jtfMonthlyPayment = new JTextField();
   private JTextField jtfTotalPayment = new JTextField();
 
 // Create a Compute Payment button
   private JButton jbtComputeLoan = new JButton("Compute Payment");
   public LoanCalculator() {
     // Panel p1 to hold labels and text fields
     JPanel p1 = new JPanel(new GridLayout(5, 2));
     p1.add(new JLabel("Annual Interest Rate"));
     p1.add(jtfAnnualInterestRate);
     p1.add(new JLabel("Number of Years"));
     p1.add(jtfNumberOfYears);
     p1.add(new JLabel("Loan Amount"));
     p1.add(jtfLoanAmount);
     p1.add(new JLabel("Monthly Payment"));
     p1.add(jtfMonthlyPayment);
     p1.add(new JLabel("Total Payment"));
     p1.add(jtfTotalPayment);
     p1.setBorder(new
       TitledBorder("Enter loan amount, interest rate, and years"));
     // Panel p2 to hold the button
     JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
     p2.add(jbtComputeLoan);
     // Add the panels to the frame
     add(p1, BorderLayout.CENTER);
     add(p2, BorderLayout.SOUTH);
 
     // Register listener
     jbtComputeLoan.addActionListener(new ButtonListener());
   }
 /** Handle the Compute Payment button */
   private class ButtonListener implements ActionListener {
     @Override 
     public void actionPerformed(ActionEvent e) {
       // Get values from text fields
       double interest =
         Double.parseDouble(jtfAnnualInterestRate.getText());
       int year = Integer.parseInt(jtfNumberOfYears.getText());
       double loanAmount =
         Double.parseDouble(jtfLoanAmount.getText());
 
       // Create a loan object
       Loan loan = new Loan(interest, year, loanAmount);
 
       // Display monthly payment and total payment
      
     }
   }
   public static void main(String[] args) {
     LoanCalculator frame = new LoanCalculator();
     frame.pack();
     frame.setTitle("LoanCalculator");
     frame.setLocationRelativeTo(null); // Center the frame
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
   }
 }

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default constructor */
    public Loan() {
      this(2.5, 1, 1000);
    }

    /** Construct a loan with specified annual interest rate,
        number of years, and loan amount
      */
    public Loan(double annualInterestRate, int numberOfYears,
        double loanAmount) {
      this.annualInterestRate = annualInterestRate;
      this.numberOfYears = numberOfYears;
      this.loanAmount = loanAmount;
      loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
    return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) {
      this.annualInterestRate = annualInterestRate;
    }
    /** Return numberOfYears */
    public int getNumberOfYears() {
      return numberOfYears;
    }
  /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) {
      this.numberOfYears = numberOfYears;
    }
}
