/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author sarif
 */

class Employee
{
    protected int id;
    protected String name;
    protected double salary;
    protected Address address;
    public String getDetails()
    {
        return "id:"+ id+"\tname: "+name+"\tsalary: "+salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address ad)
    {
        address = ad;
    }

}

class Address
{
    protected String street;
    protected String city;
    String getStreet(){
        return street;
    }
    void setStreet(String street){
        this.street =street;
    }
    String getCity(){
        return street;
    }
    void setCity(String city){
        this.city =city;
    }
    public String getAddressInfo(){
        return street + " " + city;
    }

}

class Manager extends Employee{
    public String parkingNo;
    String getParkingNo(){
        return parkingNo;
    }
    void setParkingNo(String parkingNo){
        this.parkingNo = parkingNo;
    }
    @Override
    public String getDetails(){
        return "Id: " + getId() + " Name: " + getName() + "\tSalary " + getSalary();
    }
}


public class Lab7_5 {
    public static void main(String[] args){
        Employee emp = new Manager();
        //set Addresss
        Address ad_emp1 = new Address();
        ad_emp1.setStreet("Wall Street");
        ad_emp1.setCity("NYC");
        /// casting object class
        ((Manager)emp).setParkingNo("10");
        emp.setAddress(ad_emp1);
        // Employee
        emp.setId(1101);
        emp.setName("Minstone");
        emp.setSalary(50000);
        //Display
        System.out.println(emp.getDetails());
        System.out.println("Address:" + ad_emp1.getAddressInfo());
        System.out.println("parking no: "+((Manager)emp).getParkingNo());
    }
}
