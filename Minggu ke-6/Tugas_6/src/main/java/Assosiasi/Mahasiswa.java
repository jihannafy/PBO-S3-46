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
public class Mahasiswa {
    private String name;
    
    //nama kampus
    Mahasiswa(String name)
    {
        this.name = name;
    }
    
    public String getMahasiswaName()
    {
        return this.name;
    }
    
}
