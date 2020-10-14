/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial2week3.question2;

/**
 *
 * @author USER
 */
public class Monitor {
    
    private int size;
    public Dimension dimension;

    public Monitor() 
    {
        this.size = 0;       
        this.dimension = dimension;
    }

    public Monitor(int size, Dimension dimension) 
    {
        this.size = size;
        this.dimension = dimension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() 
    {
        return "Monitor of size " + this.getSize() + " inches and maximum resolution" + this.dimension + " pixel";
    }
    
    
    
    
    
}
