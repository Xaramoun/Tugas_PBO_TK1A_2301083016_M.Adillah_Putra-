/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083016.p230124;

/**
 *
 * @author konto
 */
public class StudentExample {
    
    public static void printInformation( Person p){
        if(p instanceof Student){
            System.out.println("Nama Siswa   = "+p.getName());
            System.out.println("Alamat       = "+p.getAddress());    
        }
        if(p instanceof Employee){
            System.out.println("Nama Karyawan   = "+p.getName());
            System.out.println("Alamat          = "+p.getAddress());
        }
    }
    public static void main (String[] args){
    Person ref; 
    Student baba = new Student();
    baba.setName("Baba");
    baba.setAddress("Los Angeles");
    Employee alee = new Employee();
    alee.setName("Alee");
    alee.setAddress("DownTown");
    
//    ref = baba;
//    System.out.println("Nama Mahasiswa       = "+ref.getName());
//    System.out.println("Alamat               = "+ref.getAddress());
//    
//    ref = alee;
//    System.out.println("Nama Karyawan        = "+ref.getName());
//    System.out.println("Alamat               = "+ref.getAddress());
    
    printInformation(baba);
    printInformation(alee);
    
    
    }
    
}
