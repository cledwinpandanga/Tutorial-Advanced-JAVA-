/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial2week3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tutorial2Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
            Scanner key = new Scanner(System.in);               
            System.out.println("Masukkan arah jendela : ");
            String direction = key.nextLine();

            Window window = new Window(direction);

            System.out.println("Masukkan width : ");
            int width = key.nextInt();

            System.out.println("Masukkan length : ");
            int length = key.nextInt();               

            Dimension dimension = new Dimension(width,length);
                        
            System.out.println("Masukkan nama room : ");
            String name = key.next();

            System.out.println("Masukkan jumlah kursi : ");
            int noOfChairs = key.nextInt();

            System.out.println("Sudah dipesan? <TRUE>/<FALSE>");        
            boolean isBooked = key.nextBoolean();        

            Room tutorial = new Room(name,noOfChairs,isBooked, dimension, window);
            System.out.println(tutorial.toString());                        
    }
}

 
           