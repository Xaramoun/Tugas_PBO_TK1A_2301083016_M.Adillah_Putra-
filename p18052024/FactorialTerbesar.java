/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_2301083016.p18052024;

/**
 *
 * @author konto
 */
public class FactorialTerbesar {
    public static int fpb(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 14;
        int y = 6;
        int fpb = fpb(x, y);
        System.out.println("FPB dari " + x + " dan " + y + " adalah = " + fpb);
    }
}
 
