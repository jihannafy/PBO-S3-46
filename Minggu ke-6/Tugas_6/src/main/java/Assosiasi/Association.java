/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assosiasi;

/**
 *
 * @author Jihan Afifah
 */
public class Association {
    public static void main (String[] args)
    {
        Kampus kmps = new Kampus("Polban");
        Mahasiswa mhs = new Mahasiswa("Jihan");
        
        System.out.println(mhs.getMahasiswaName() + " merupakan mahasiswa dari " + kmps.getKampusName());
    }
}
