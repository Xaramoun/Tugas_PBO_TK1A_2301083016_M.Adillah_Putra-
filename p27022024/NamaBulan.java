/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083016.p27022024;

/**
 *
 * @author konto
 */
import java.util.Scanner;
public class NamaBulan {
    public static void main(String[] args){
        int nobulan;
        char ulang;
        Scanner in = new Scanner(System.in);
        System.out.println("===Program menentukan Nama Bulan===");
    do
    {
        System.out.print("Nomor Bulan = ");
        nobulan = in.nextInt();
        switch(nobulan)
        {
            case 1 -> System.out.println("Bulan Januari");
            case 2 -> System.out.println("Bulan Februari");
            case 3 -> System.out.println("Bulan Maret");
            case 4 -> System.out.println("Bulan April");
            case 5 -> System.out.println("Bulan Mei");
            case 6 -> System.out.println("Bulan Juni");
            case 7 -> System.out.println("Bulan Juli");
            case 8 -> System.out.println("Bulan Agustus");
            case 9 -> System.out.println("Bulan September");
            case 10 -> System.out.println("Bulan Oktober");
            case 11 -> System.out.println("Bulan November");
            case 12 -> System.out.println("Bulan Desember");
            default -> System.out.println("Nomor Bulan Anda Salah");
        }    
        System.out.print("Ulang Proses (Y/T)?");
        ulang = in.next().charAt(0);
    }while (ulang=='y'||ulang=='Y');    
    }
    
}
