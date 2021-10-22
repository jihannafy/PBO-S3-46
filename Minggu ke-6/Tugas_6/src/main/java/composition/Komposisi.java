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
public class Komposisi {
    public static void main(String[] args) {
        
        //komposisi
        SkinCare skinCare = new SkinCare();
        skinCare.setJenisFacewash("gentle skin");
        skinCare.setFaceWash("Cetaphil",125);
        
        System.out.println("Jenis face wash     : "+skinCare.getJenisFacewash());
        System.out.println("Merk face wash      : "+skinCare.getMerkFaceWash());
        System.out.println("Berat Netto(ml)     : "+skinCare.getNettoFaceWash());
    }
}
