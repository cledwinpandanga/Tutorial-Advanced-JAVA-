/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.week1;

/**
 *
 * @author USER
 */
public class Circle
{
    public Point centre = new Point();
    private double radius;
    
    public Circle()
    {
        this.centre.setX(0);
        this.centre.setY(0);
        this.radius = 0 ;       
    }
    
    public Circle(double radius, double x, double y)
    {
        this.centre.setX(x);
        this.centre.setY(y);
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
}
