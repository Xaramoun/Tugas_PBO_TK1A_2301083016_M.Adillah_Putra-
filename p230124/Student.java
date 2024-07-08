/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083016.p230124;

/**
 *
 * @author konto
 */
public class Student extends Person {
    public Student(){
        //super("Baba","Los Angeles");
        super.name = "Baba";
        super.address = "Los Angeles";
        System.out.println("Student Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
    
}
