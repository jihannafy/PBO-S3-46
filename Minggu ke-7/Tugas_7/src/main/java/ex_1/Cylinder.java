/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_1;

/**
 *
 * @author Jihan Afifah
 */
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		super();
		height = 1.0;
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius); // call superclass constructor Circle(r)
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	//task 1.2
	public double getVolume() {
		return super.getArea()*height;
	}
	
	//task 1.2
	public double getArea() {
		return super.getArea() + (2*Math.PI*getRadius()*height);
	}
	
	//task 1.3
	public String toString() {
		return "Cylinder: subclass from" + super.toString()
		+ " height=" + height;
	}
}
    

