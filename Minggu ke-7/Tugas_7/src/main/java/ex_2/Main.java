/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2;

/**
 *
 * @author Jihan Afifah
 */
public class Main {
    public static void main(String[] args){
		Shape shape = new Shape();
		Circle circle = new Circle();
		Rectangle rec = new Rectangle();
		Square square = new Square();
		
                System.out.println("------SHAPE-------");
		System.out.println(shape);
		System.out.println("------CIRCLE-------");
		System.out.println(circle);
		System.out.println("------RECTANGLE-------");
		System.out.println(rec);
		System.out.println("------SQUARE-------");
		System.out.println(square);
 	}
}
//        Shape sh1 = new Shape();
//        Shape sh2 = new Shape("yellow",false);
//        sh1.setColor("pink");
//        System.out.println(sh1.toString());
//        System.out.println(sh2.toString());
//        System.out.println(sh2.getColor());
//        sh1.setFilled(false);
//        System.out.println(sh1.isFilled());
//        System.out.println(sh1.toString());
//    }
    
