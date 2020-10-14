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
public class Room 
{    
    private int a = 0;
    private String name;
    private int noOfChairs;    
    private boolean isBooked;
    Dimension[] dimension = new Dimension[10];
    Window[] window = new Window[10];
    
    public Room()
    {
        this.name = "";
        this.noOfChairs = 0;
        this.isBooked = false;
        dimension[0] = null;
        window[0] = null;        
    }
    
    public Room(String name, int noOfChairs, boolean isBooked, Dimension inDimension, Window inWindow)
    {        
        this.name = name;
        this.noOfChairs = noOfChairs;
        this.isBooked = isBooked;    
        dimension[0] = inDimension;
        window[0] = inWindow;
    }

    public int getNoOfChairs() {
        return noOfChairs;
    }

    public boolean isIsBooked() {
        return isBooked;
    }

    public Dimension[] getDimension() {
        return dimension;
    }    

    public void setDimension(Dimension[] dimension) {
        this.dimension = dimension;
    }

    public void setWindow(Window[] window) {
        this.window = window;
    }        
    
    public String getName()
    {
        return this.name;
    }
    
    public Window[] getWindow() {
        return window;
    }

    public void setNoOfChairs(int noOfChairs) 
    {
        this.noOfChairs = noOfChairs;
    }

    public void setIsBooked(boolean isBooked) 
    {
        this.isBooked = isBooked;
    }
    
    public int getnoOfChairs()
    {
        return this.noOfChairs;
    }
    
    public boolean getisBooked()
    {
        return this.isBooked; 
    }
   
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setnoOfChairs(int noOfChairs)
    {
        this.noOfChairs = noOfChairs;
    }
    
    public void setisBooked(boolean isBooked)
    {
        this.isBooked = isBooked;
    }
    
    public void isBooked()
    {
        String booked = null;
        boolean isBooked;
        
        if(booked.equals('y'))
        {
            isBooked = true;
        } 
        
        else
        {
            isBooked = false;
        }
    }
    
    public void addDimension(Dimension inDimension)
    {        
        dimension[a] = inDimension;
        a++;
    }
    
    public void removeDimension()            
    {
        dimension[a] = null;
    }
    
    public void printDimension()
    {
        for (int i = 0; i < dimension.length; i++)
        {
            System.out.println(dimension[i]);
        }
    }
    
    @Override
    public String toString()
    {
        return "Room " + this.getName() + " with " + this.dimension+ " (in m), with " + this.window
                + " and " + this.getnoOfChairs() + " chairs , and is already booked : " + this.getisBooked() + ".";
    }
  }
