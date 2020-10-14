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
public class Dimension 
{
    private int width, length;
    
    public Dimension()
    {
        this.width = 0;
        this.length = 0;        
    }
    public Dimension(int width, int length)
    {
        this.width = width;
        this.length = length;      
    }
    
    public int getWidth()
    {
        return this.width;
    }
    
    public int getLength()
    {
        return this.length;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }
    
    @Override
    public String toString()
    {
        return "width " + this.getWidth() +" X"+ " length " + this.getLength();
    }
    
}
