/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6_8;

/**
 *
 * @author sarif
 */
public class MainLab6_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MainLab6_8 obj = new MainLab6_8();
        Line L1 = new Line(-1,-2,3,-4);
        
        Rectangle R1 = new Rectangle(1 ,2 ,3 ,5.5);
        Rectangle R2 = new Rectangle(3,4,4.5,5);
        
        
        System.out.print("Line L1 insides R1 : "+obj.contains(L1, R2)+"\n");
        System.out.println("Overlaps R1 and R2 : "+obj.contains(R1, R2)+"\n");
        
    }
    
    
    
    public boolean contains(Line a,Rectangle b)
    {
        double xtopRight = b.getX() + b.getWidth()/2;
        double ytopRight = b.getY() + b.getHeight()/2;
        double xdownLeft = b.getX() - b.getWidth()/2;
        double ydownLeft = b.getY() - b.getHeight()/2;
        
        boolean c1 = a.getX1()>= xdownLeft && a.getX1()<=xtopRight && a.getY1()>= ydownLeft && a.getY1()<=ytopRight;
        boolean c2 = a.getX2()>= xdownLeft && a.getX2()<=xtopRight && a.getY2()>= ydownLeft && a.getY2()<=ytopRight;
        
        return c1 && c2;
        
    }
    
    public boolean contains(Rectangle a,Rectangle b)
    {
        
        double xtopRight1 = a.getX() + a.getWidth()/2;
        double ytopRight1 = a.getY() + a.getHeight()/2;
        double xdownLeft1 = a.getX() - a.getWidth()/2;
        double ydownLeft1 = a.getY() - a.getHeight()/2;
        
        double xtopRight2 = b.getX() + b.getWidth()/2;
        double ytopRight2 = b.getY() + b.getHeight()/2;
        double xdownLeft2 = b.getX() - b.getWidth()/2;
        double ydownLeft2 = b.getY() - b.getHeight()/2;
        
        boolean c1 = xdownLeft2 >= xtopRight1;
        boolean c2 = ytopRight2 <= ydownLeft1;
        boolean c3 = xtopRight2 <= xdownLeft1;
        boolean c4 = ydownLeft2 >= ytopRight1;
        boolean c5 = xdownLeft2 >= xdownLeft1 && xtopRight2 <= xtopRight1 && ytopRight2 <= ytopRight1 && ydownLeft2 >= ydownLeft1;
        
        return !(c1 || c2 || c3 || c4) && !c5;
        
    }
    
}
