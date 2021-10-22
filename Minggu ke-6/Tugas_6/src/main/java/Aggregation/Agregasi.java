/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 *
 * @author Jihan Afifah
 */
public class Agregasi {
    public static void main(String[] args) {
        Dosen dsn = new Dosen("567","Jihan");
        Jurusan jrs = new Jurusan("Teknik informatika");
        
        jrs.setDosen(dsn);
        
        System.out.println("NIDN        : "+jrs.getDosen().getNidn());
        System.out.println("Nama Dosen  : "+jrs.getDosen().getNama());
        System.out.println("Jurusan     : "+jrs.getNamaJurusan());
    }
}
