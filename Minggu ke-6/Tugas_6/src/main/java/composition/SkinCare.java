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
public class SkinCare {
    FaceWash faceWash; //komposisi part a
    String jenisFacewash;
    
    public void setJenisFacewash(String jenisFacewash) {
        this.jenisFacewash = jenisFacewash;
    }
    
    public String getJenisFacewash() {
        return jenisFacewash;
    }
    
    public void setFaceWash(String m, int n) {
        faceWash = new FaceWash(m, n);
    }
    
    public String getMerkFaceWash() {
        return faceWash.getMerk();
    }
    
    public int getNettoFaceWash() {
        return faceWash.getNetto();
    }
    
}
