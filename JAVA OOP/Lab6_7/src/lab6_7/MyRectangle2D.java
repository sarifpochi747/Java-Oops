/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_7;

/**
 *
 * @author sarif
 */
public class MyRectangle2D {
    
    private double x,y;
    private double width,height;
    
    
    //Default Constructor
    MyRectangle2D()
    {
        x =0;
        y =0;
        width = 1;
        height = 1;
    }
    
    //Construtor OverLoading
    MyRectangle2D(double newX,double newY,double newWidth,double newHeight)
    {
        x = newX;
        y = newY;
        width = newWidth;
        height = newHeight;
    }
    
    public double getHeight()
    {
        return height;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getWidth()
    {
        return width;
    }
    
    
    //Method get area
    public double getArea()
    {
        return width * height;
    }
    
    // Method get Perimeter
    public double getPerimeter()
    {
        return 2*(width + height);
    }
    
    public boolean contains(double x,double y)
    {
        return this.x+ getWidth()/2>=x&&x>=this.x-getWidth()/2 && this.y+getHeight()>=y && y>=this.y - getHeight();
    }
    
    
    public boolean contains(MyRectangle2D r)
    {
        double xtopRight = r.x + r.getWidth()/2;
        double ytopRight = r.y + r.getHeight()/2;
        double xbottomLeft = r.x - r.getWidth()/2;
        double ybottomLeft = r.y - r.getHeight()/2;
        double xtemptop = x + getWidth()/2;
        double ytemptop = y + getHeight()/2;
        double xtempbottom = x - getWidth()/2;
        double ytempbottom = y - getHeight()/2;
        
        return xtemptop >= xtopRight && xtempbottom <= xbottomLeft && ytemptop >= ytopRight && ytempbottom<= ybottomLeft ;
    }
    
    public boolean overlaps(MyRectangle2D r)
    {
        double xtopRight = r.x + r.getWidth()/2;
        double ytopRight = r.y + r.getHeight()/2;
        double xbottomLeft = r.x - r.getWidth()/2;
        double ybottomLeft = r.y - r.getHeight()/2;
        double xtemptop = x + getWidth()/2;
        double ytemptop = y + getHeight()/2;
        double xtempbottom = x - getWidth()/2;
        double ytempbottom = y - getHeight()/2;
        boolean c1 = xbottomLeft >= xtemptop;
        boolean c2 = ytopRight <= ytempbottom;
        boolean c3 = xtopRight <= xtempbottom;
        boolean c4 = ybottomLeft >=  ytemptop;
        boolean c5 = xtemptop >= xtopRight && xtempbottom <= xbottomLeft && ytemptop >= ytopRight && ytempbottom<= ybottomLeft ;
        
        return !(c1 || c2 || c3 || c4) && !c5;
        
        
    }
    
        
      
    
}
