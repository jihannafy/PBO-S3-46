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
public class Dosen {
    private String nidn;
    private String nama;
    
    public Dosen(String nidn, String nama){
        this.nidn = nidn;
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNidn() {
        return nidn;
    }
}
