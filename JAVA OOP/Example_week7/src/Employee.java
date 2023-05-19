/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LAB_621
 */
public class Employee {
    private String firstname;
    private String lastname;
    private String id;
    private double salary;
    private int year;
    
    public Employee(){
        
    }

    public Employee(String firstname, String lastname, String id, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.salary = salary;
    }

    public double earning(){
        return this.salary -= this.salary*5/100;
    }
    
    public double bonus(int year){
        this.year = year;
        if(year>5){
            return this.salary*12;
        }
        else{
            return this.salary*6;
        }
    }
    @Override
    public String toString(){
        return "Name: "+firstname+" "+lastname+", ID: "+id+", Salary: "+salary;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of employee(s): ");
        int n = sc.nextInt();
        ArrayList<Employee> emp = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Input name, ID and salary: ");
            String firstname = sc.next();
            String lastname = sc.next();
            String id = sc.next();
            double salary = sc.nextDouble();
            Employee obj = new Employee(firstname,lastname,id,salary);
            obj.earning();
            System.out.println("Input work years: ");
            int year = sc.nextInt();
            obj.bonus(year);
            emp.add(obj);
        }
        printEmp(emp);
    }
    
    public static void printEmp(ArrayList<Employee> emp) {
        for (int i=0;i<emp.size();i++) {
            System.out.println(emp.get(i));
        }
    }
}
