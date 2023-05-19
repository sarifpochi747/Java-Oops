/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example;

/**
 *
 * @author sarif
 */
import javax.swing.JOptionPane;
import java.util.*;
public class Example1 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner sc = new Scanner(System.in);
        Double fahrenheit;
        Double celsius;
        String str = JOptionPane.showInputDialog(null,"Enter Farenheit");
        fahrenheit = Double.parseDouble(str);
        celsius =((fahrenheit -32 )* 5)/9;
        JOptionPane.showMessageDialog(null,String.format("%.2f", celsius));
        
        
    }
    
}
