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
public class Circle {
    private double radius;
    private String color;
    
    public Circle() { 
	radius = 1.0;
	color = "red";
	}
    
    public Circle(double r){
        radius = r;
        color = "red";
    }
    
    //task 1.1
    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }
    
    public void setColor(String c) {
        this.color = c;
    }
    public String getColor() {
        return color;
    }
    
    public void setRadius(double r){
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
