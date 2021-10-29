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
public class Shape {
    private String color = "red";
    private boolean filled = true;
    
    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    
    public Shape(String c, boolean f){
        this.color = c;
        this.filled = f;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean f){
        this.filled = f;
    }
    
    public String toString(){
        if (isFilled()==true){
            return "A Shape with color of "+this.color+" and filled";
        }else{
            return "A Shape with color of "+this.color+" and not filled";
        }
    }
    
}
