/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8;

/**
 *
 * @author sarif
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;




public abstract class Employee{
    private String firstname;
    private String lastname;
    private String id;
    public Employee(String firstname,String lastname,String id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.id=id;
    }
    public abstract double earning();
    public abstract double bonus(int year);
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public String getId() {
        return id;
    }
}


class SalariedEmployee extends Employee{
    
    public double salary;
    
    SalariedEmployee(String firstname,String lastname,String id, double sal)
    {
        super(firstname,lastname,id);
        this.salary = sal;
    }
    
    @Override
    public double bonus(int year)
    {
        if(year> 5)
        {
            return salary*12;
        }
        else{
            return salary*6;
        }
        
    }
    
    @Override
    public double earning()
    {
        return salary - salary*(5/100);
    }
    
}

class ComEmployee extends Employee
{
    public double grossSale;
    public double ComRate;
    ComEmployee(String firstname,String lastname,String id, double sales, double percent)
    {
        super(firstname,lastname,id);
        grossSale = sales;
        ComRate = percent;
    }
    
    
    @Override
    public double bonus(int year)
    {
        if(year> 5)
        {
            return grossSale*6;
        }
        else{
            return grossSale*3;
        }
    }
    
    @Override
    public double earning(){
        double Commission = grossSale*ComRate;
        grossSale = grossSale+Commission;
        return grossSale;
    }
    
}

class FinalEmployee
{
    public static void main(String [] args)
    {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new ComEmployee("IRENE", "BAE", "001", 10000, 0.4));
        emp.add(new ComEmployee("SEULGI", "KANG", "002", 5000, 0.4));
        emp.add(new SalariedEmployee("sa", "rif", "003", 10000));
        emp.add(new SalariedEmployee("dsd", "ss", "004", 5000));
        printEmp(emp);
    }
    
    public static void printEmp(ArrayList<Employee> a)
    {
       

        for (int i=0; i<4; i++){
            if (a.get(i) instanceof ComEmployee){
               
                System.out.println(a.get(i).getId()+" "+a.get(i).getFirstname()+" "+a.get(i).getLastname()+" "+a.get(i).earning()+" "+a.get(i).bonus(2));
            }
            if (a.get(i) instanceof SalariedEmployee){
                System.out.println(a.get(i).getId()+" "+a.get(i).getFirstname()+" "+a.get(i).getLastname()+" "+a.get(i).earning()+" "+a.get(i).bonus(2));
            }
        }
    }
    
}