/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentprojectrc;

/**
 *
 * @author sarif
 */
public class Student {
    
    // attribute
    
    private String name;
    private String surname;
    private int id;
    private double gpa;
    private char grade;
    
    // method 
    //constructor
    public Student()
    {
        id = 0;
        name = null;
        surname = null;
        grade = ' ';
        gpa = 0;
    }
    
    public Student(int i,String n,String s,double g)
    {
        id = i;
        name = n;
        surname = s;
        gpa = g;
        
    }
   
    public void display()
    {
        System.out.println(String.format("ID: %d %s %s GPA: %.2f",id,name,surname,gpa));
    }
    
 
    
    
}
