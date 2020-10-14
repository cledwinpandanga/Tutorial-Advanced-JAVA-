/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial2week3.question2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tutorial2Week3Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);        
        System.out.println("SELAMAT MEMBELI KOMPUTER");        
        System.out.println("------------------------");
        System.out.println("HARD DISK");
        System.out.println("Masukkan Ukuran Hard Disk : ");
        int unit = key.nextInt();        
        HardDisk hdd = new HardDisk(unit,"GB");
        System.out.println("------------------------");
        System.out.println("MONITOR");
        System.out.println("Masukkan Ukuran Pixel (width): ");
        int width = key.nextInt();
        System.out.println("Masukkan Ukuran Pixel (length): ");
        int length = key.nextInt();
        Dimension pixel = new Dimension(width,length);                
        System.out.println("Masukkan ukuran monitor : ");        
        int Msize =key.nextInt();
        Monitor monitor = new Monitor(Msize,pixel);
        System.out.println("------------------------");
        
        System.out.println("KOMPUTER");
        System.out.println("Masukkan Brand Komputer : ");        
        String merek = key.next();
        Computer computer1 = new Computer(merek, hdd, monitor);                                
        
        System.out.println(computer1.toString());
    }
    
    
    
}
