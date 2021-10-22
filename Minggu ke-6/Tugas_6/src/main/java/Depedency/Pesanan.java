/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Depedency;

/**
 *
 * @author Jihan Afifah
 */
import java.util.*;

public class Pesanan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Restoran restoran = new Restoran();
        Pemesan pemesan = new Pemesan();
        int pilih;
        String notelp;
        String nama;
        
        System.out.println("==============MENU==================");
        System.out.println("1. Ayam Goreng          Rp. 15.000");
        System.out.println("2. Rendang              Rp. 20.000");
        System.out.println("3. Ikan Goreng          Rp. 17.500");
        System.out.println("4. Sayur Sop            Rp. 8.000");
        System.out.println("Pilih menu : ");
        pilih = in.nextInt();
        
        switch (pilih) {
        case 1 :
        {
            System.out.println("Anda memesan Ayam Goreng.");
            restoran.setMakanan("Ayam Goreng");
            restoran.setHargaMakanan(15000.0);
            break;
        }
        case 2 :
        {
            System.out.println("Anda memesan Rendang.");
            restoran.setMakanan("Rendang");
            restoran.setHargaMakanan(20000.0);
            break;
        }
        case 3 :
        {
            System.out.println("Anda memesan Ikan Goreng.");
            restoran.setMakanan("Ikan Goreng");
            restoran.setHargaMakanan(17500.0);
            break;
        }
        case 4 :
        {
            System.out.println("Anda memesan Sayur Sop.");
            restoran.setMakanan("Sayur Sop");
            restoran.setHargaMakanan(8000.0);
            break;
        }
    }   
  }    
}
 
