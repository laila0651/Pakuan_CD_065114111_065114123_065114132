/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perhitungan_dasar;

import java.util.Scanner;

/**
 *
 * @author aquarius
 */
public class Perhitungan_dasar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai1, nilai2;
              double hasiljumlah;
                      
              Scanner DataIn = new Scanner(System.in);
              System.out.print("Masukan angka ke-1: ");
              nilai1 = DataIn.nextInt();
            
              System.out.print("Masukan angka ke-2: ");
              nilai2 = DataIn.nextInt();

              hasiljumlah = nilai1+nilai2;
                            
              System.out.print("Penjumlahan \n"); 
              System.out.println("Hasil penjumlahan: " + hasiljumlah);
    }
}
