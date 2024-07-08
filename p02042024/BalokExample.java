/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083016.p02042024;

/**
 *
 * @author konto
 */
import java.util.Scanner;
public class BalokExample {
    public static void main(String[] args){
        int pjg,lbr,tggi,la;
        Scanner in = new Scanner (System.in);
        
        System.out.println("===Balok 1===");
        Balok b1 = new Balok();
        System.out.print("Panjang = "); pjg = in.nextInt();
        b1.setPanjang(pjg);
        System.out.print("Lebar = "); lbr = in.nextInt();
        b1.setLebar(lbr);
        System.out.print("Tinggi = "); tggi = in.nextInt();
        b1.setTinggi(tggi);
        la = b1.hitungLuasAlas();
        b1.printBalok(la, b1.hitungLuasPermukaan(), b1.hitungVolume());
    
    
    System.out.println("===Balok 2===");
    Balok b2 = new Balok(10);
    b2.setLebar(4);
    b2.setTinggi(5);
    b2.printBalok();
    b2.printBalok(b2.hitungLuasAlas(), b2.hitungLuasPermukaan(), b2.hitungVolume(b2.hitungLuasAlas()));
    
   System.out.println("===Balok 3===");
   System.out.print("Panjang = "); pjg = in.nextInt();
   System.out.print("Lebar = "); lbr = in.nextInt();
   System.out.print("Tinggi = "); tggi = in.nextInt();
   Balok b3 = new Balok(pjg,lbr,tggi);
   la = b3.hitungLuasAlas();
   b3.printBalok(la, b3.hitungLuasPermukaan(), b3.hitungVolume(la));
}   
}
