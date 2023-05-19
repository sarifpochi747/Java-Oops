/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_7;

/**
 *
 * @author sarif
 */
public class MainMyRectangle2D {
    public static void main(String [] args)
    { 
        MyRectangle2D obj1 = new MyRectangle2D(2.5 ,4, 2.5,43);
        MyRectangle2D obj2 = new MyRectangle2D(1.5,5,0.5,3);
        MyRectangle2D obj3 = new MyRectangle2D(1,2,3,3);
        MyRectangle2D obj4 = new MyRectangle2D(40,45,3,2);
        System.out.print("Inside : "+obj1.contains(obj2)+"\n");
        System.out.print("Overlaps : "+obj3.overlaps(obj4)+"\n");
    }

}


/*
2.5 ,4 ,2.5,43
1.5,5,0.5,3

Overlap
1 ,2 ,3 ,5.5
3,4,4.5,5

Not overlaps
1,2,3,3
40.45,3,2
//

*/