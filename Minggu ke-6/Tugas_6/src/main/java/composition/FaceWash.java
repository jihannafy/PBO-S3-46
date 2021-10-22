/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author Jihan Afifah
 */
public class FaceWash {
    private String merk;
    private int netto;
    
    public FaceWash(String merk, int netto){
        this.merk = merk;
        this.netto = netto;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public int getNetto() {
        return netto;
    }
}
