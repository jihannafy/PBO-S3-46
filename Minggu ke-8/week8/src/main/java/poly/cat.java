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
class cat extends animals{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
    animals obj = new cat();
    obj.sound();
    }
}
