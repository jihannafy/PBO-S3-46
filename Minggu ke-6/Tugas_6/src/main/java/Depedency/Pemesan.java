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
public class Pemesan {
    private String namaPemesan;
    private String telpPemesan;
    
    public String getNamaPemesan() {
        return namaPemesan;
    }
    
    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }
    
    public String getTelpPemesan() {
        return telpPemesan;
    }
    
    public void setTelpPemesan(String telpPemesan) {
        this.telpPemesan = telpPemesan;
    }
    
    public void infoPemesan() {
        System.out.println("================pesanan=================");
        System.out.println("Nama pemesan    : " + this.namaPemesan);
        System.out.println("No Telepon      : " + this.telpPemesan);
    }
}
