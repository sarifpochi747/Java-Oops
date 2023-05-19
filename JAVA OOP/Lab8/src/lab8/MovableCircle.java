/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author sarif
 */
class MovablePoint implements Movable{
    int x,y,xSpeed,ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed)
    {
        
    }
    @Override
    public String toString()
    {
        return "string";
    }

    @Override
    public void moveUp() {
    }

    @Override
    public void moveDown() {
    }

    @Override
    public void moveLeft() {
    }

    @Override
    public void moveRight() {
    }
    
    
}
public class MovableCircle implements Movable{
    
    private int radius;
    private MovablePoint center;
    
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius)
    {
        
    }
    @Override
    public String toString()
    {
        return "string";
    }

    @Override
    public void moveUp() {
    }

    @Override
    public void moveDown() {
    }

    @Override
    public void moveLeft() {
    }

    @Override
    public void moveRight() {
    }
    
}

interface Movable
{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}