/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarif
 */
class Thread1 extends Thread{
   Thread1(String name){
      super(name);
   }
   public void run(){
      for(int i=0;i<10;i++){
         System.out.println(getName()+" ");
      }
   }
}
class TestThread1{
   public static void main(String args[]){
      new Thread1("A").start();
      new Thread1("B").start();
   }
} 

