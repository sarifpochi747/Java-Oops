/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week5;

/**
 *
 * @author sarif
 */
import java.util.*;
public class Palindrome {
    private String str;
    
    Palindrome(String s)
    {
        str = s;
    }
    
    public boolean isPalindrome(String s)
    {
        int i =0;
        int j =str.length() -1;
        while (i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static void main(String [] agrs)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Palindrome obj  = new Palindrome(s);
        if(obj.isPalindrome(s))
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(1);
        
        
        
    }
    }
}
