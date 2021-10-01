/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal6;

/**
 *
 * @author Jihan Afifah
 */
import java.util.Scanner;
import java.math.BigInteger;

public class Soal6 {
    public static void main(String[] args){
     Scanner userinput = new Scanner(System.in);
        
        String A = userinput.nextLine();
        String B = userinput.nextLine();
        
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);
        
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));
}    
    
}
