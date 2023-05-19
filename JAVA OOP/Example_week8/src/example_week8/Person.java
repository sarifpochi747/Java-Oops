/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week8;

/**
 *
 * @author sarif
 */
public class Person {   
    private String name;
    private String Surname;
    private int age;
    private Dates bdate;
    //Constructor 
    public Person(){
        this.name = "defualt";
        this.Surname = "defualt";
    }
    public Person(String name, String Surname,int age ,Dates bdate){
           this.name = name;
           this.Surname = Surname;
           this.age = age;
           this.bdate = bdate;
    }
    
    @Override
    public String toString(){
    return "Persanl Data= Name"+name+" Surname "+Surname+" Age "+age+" dateCreate "+bdate+"\n";
    }
}