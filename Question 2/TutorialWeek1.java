/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tutorial.week1;

import java.util.*;
/**
 *
 * @author USER
 */
public class TutorialWeek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Point p = new Point();        
        Circle c = new Circle();
        
        Scanner key = new Scanner(System.in);
        System.out.print("Input nilai x : ");
        p.setX(key.nextDouble()); 
        
        System.out.print("Input nilai y : ");
        p.setY(key.nextDouble()); 
        
        System.out.print("Input nilai Circle(X) : ");
        c.centre.setX(key.nextDouble());
        
        System.out.print("Input nilai Circle(Y) : ");
        c.centre.setY(key.nextDouble()); 
        
        System.out.print("Input nilai Radius : ");
        c.setRadius(key.nextDouble());
        
        
        double a = p.getX() - c.centre.getX();
        double b = p.getY() - c.centre.getY();
        double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        
        if(d == c.getRadius())
        {
            System.out.println("Point is on the circle ");
        }
        
        else if (d < c.getRadius())
        {
            System.out.println("Point is inside the circle ");
        }
        
        else
        {
            System.out.println("Point is outside the circle ");
        }
        
    }
    
}
