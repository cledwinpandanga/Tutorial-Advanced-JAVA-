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
public class HardDisk 
{
    private int size;
    private String unit;   
    
    public HardDisk()
    {
        this.size = 0;
        this.unit = "GB";
    }

    public HardDisk(int size, String unit) 
    {
        this.size = size;
        this.unit = unit;
    }

    public int getSize() {
        return size;
    }

    public String getUnit() {
        return unit;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() 
    {
        return this.getSize() +" "+  this.getUnit() + " hard disk";
    }
    
}
