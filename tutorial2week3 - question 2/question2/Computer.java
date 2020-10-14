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
public class Computer 
{
    private String brand;
    public HardDisk harddisk;
    public Monitor monitor;
      
    public Computer(String brand, HardDisk harddisk, Monitor monitor) 
    {
        this.brand = brand;
        this.harddisk = harddisk;
        this.monitor = monitor;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Override
    public String toString() 
    {
        return "a Computer " + this.getBrand() + " with " + this.harddisk + ", and a "+ this.monitor;
    }   
    
}
