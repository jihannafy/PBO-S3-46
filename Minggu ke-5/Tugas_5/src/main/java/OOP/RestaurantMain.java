/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Jihan Afifah
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
    menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Gehu", 1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Tahu", 1_000, 0);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Molen", 1_000, 20);

    menu.Pemesanan("Bala-bala", 6);
    System.out.println("\n======== Stok Makanan Tersisa ========");
    menu.tampilMenuMakanan();

    }
}
