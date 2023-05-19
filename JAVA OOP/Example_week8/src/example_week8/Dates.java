/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week8;

/**
 *
 * @author sarif
 */
public class Dates {
    int d,m,y;
    
    Dates(){
    
    }
   
    public Dates(int date,int month, int year){
        d = date;
        m = month;
        y = year;
    }
    
    @Override
    public String toString(){
    return d+" "+m+" "+y;
    }
}