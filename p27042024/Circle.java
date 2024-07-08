/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083016.p27042024;

/**
 *
 * @author konto
 */
public class Circle extends Shape {
    private float jari;
    private static double phi = 3.14;
     
    public Circle(){
        
    }
    
    public float getJari(){
        return jari;
    }
    
    public void setJari(float jari){
        this.jari = jari;
    }
    
     public String getName(){
        return "Circle";
    }
    public float getArea(){
        return(float)(phi*jari*jari);
    }
    
     public static void main(String[] args){
        Circle circle = new Circle();
        circle.setJari(5);
        System.out.println("Nama     = "+circle.getName());
        System.out.println("Area     = "+circle.getArea());
    }
    
}
