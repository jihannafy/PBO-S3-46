/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author Jihan Afifah
 */
class horse extends animals{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String args[]){
    animals obj = new horse();
    obj.sound();
    }
}
