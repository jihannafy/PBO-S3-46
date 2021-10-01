/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;

/**
 *
 * @author Jihan Afifah
 */
import java.util.Scanner;
        
public class Soal5 {
    public static void main(String[] args){
        Scanner Userinput = new Scanner(System.in);
        
        String plat1 = Userinput.next();
        String plat2 = Userinput.next();
        String plat3 = Userinput.next();
        String plat4 = Userinput.next();
        
        String plno = plat1 + plat2 + plat3 + plat4;
        
        long nomor = Long.parseLong(plno);
        long hasil = (nomor-999999)%5;
        if(hasil == 0){
           System.out.println("Jalan");
        }else{
            System.out.println("Berhenti");
        }
    }
}
    
