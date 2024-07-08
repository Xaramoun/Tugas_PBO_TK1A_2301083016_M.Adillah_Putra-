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


public class KaryawanExample {
    public static void main(String[] args){
        String nama;
        String nip;
        int msKerja;
                
        Scanner input = new Scanner (System.in);
        //karyawan 1 -- kons 1
        System.out.println("--Karyawan 1--");
        Karyawan k1 = new Karyawan();
        System.out.println("Nama = "); nama = input.nextLine();
        k1.setNama(nama);
        System.out.println("Nip = "); nip = input.nextLine();
        k1.setNip(nip);
        System.out.println("Masa Kerja = "); msKerja = input.nextInt();
        k1.setmsKerja(msKerja);
        k1.printKaryawan(k1.getGaji(), k1.hitungTunjangan(), k1.hitungGajiTotal());
        
        //karyawan 2 -- kons 2
        System.out.println("--Karyawan 2--");
        Karyawan k2 = new Karyawan ("Reemar", "231124");
        k2.setmsKerja(5);
        k2.printKaryawan();
        k2.printKaryawan(k2.getGaji(), k2.hitungTunjangan(), k2.hitungGajiTotal());
        
        //karyawan 3 -- kons 3
        System.out.println("--Karyawan 3--");
        System.out.println("Nama = "); nama = input.nextLine();
        System.out.println("Nip = "); nip = input.nextLine();
        System.out.println("Masa Kerja = "); msKerja = input.nextInt();
        Karyawan k3 = new Karyawan(7);
        k3.printKaryawan(k3.getGaji(), k3.hitungTunjangan(), k3.hitungGajiTotal());
    }
    
}
