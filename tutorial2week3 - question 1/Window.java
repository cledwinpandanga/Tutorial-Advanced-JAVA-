/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial2week3;

/**
 *
 * @author USER
 */
public class Window 
{
    public String direction;
    
    public Window()
    {
        this.direction = "";
    }
    public Window(String direction)
    {
        this.direction = direction;
    }
    
    public String getDirection()
    {
        return this.direction;
    }
    
    public void setDirection(String direction)
    {
        this.direction = direction;
    }
    
    @Override
    public String toString()
    {
        return "Window Facing : " + this.direction;
    }
}