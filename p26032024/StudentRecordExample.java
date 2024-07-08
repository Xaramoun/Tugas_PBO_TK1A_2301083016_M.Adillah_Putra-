/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083016.p26032024;

/**
 *
 * @author konto
 */
public class StudentRecordExample {
    public static void main(String[] args){
         StudentRecord student1 = new StudentRecord();
         student1.setName("Fikram");
         student1.setAge(50);
         student1.setAddress("Ohio");
         student1.setMathGrade(100);
         student1.setEnglishGrade(100);
         student1.setScienceGrade(100);
         ////
         System.out.println("Nama                = "+student1.getName());
         System.out.println("Alamat              = "+student1.getAddress());
         System.out.println("Umur                = "+student1.getAge());
         System.out.println("matematika          = "+student1.getMathGrade());
         System.out.println("Bahasa Inggris      = "+student1.getEnglishGrade());
         System.out.println("Sains               = "+student1.getScienceGrade()); 
         System.out.println("Rata-rata           = "+student1.getAverage());
         
        //Menampilkan Jumlah Siswa
        System.out.println("Banyak Siswa      = "+StudentRecord.getStudentCount());
        //Contoh Pemanggilan method Overload
        System.out.println("==============");
        student1.print(student1.getName());
        System.out.println("==============");
        student1.print(student1.getEnglishGrade(),student1.getMathGrade(),student1.getScienceGrade());
        
        StudentRecord KramRecord = new StudentRecord("Kram");
        StudentRecord PakYanRecord = new StudentRecord("PakYan","Kos");
        StudentRecord AngkuRecord = new StudentRecord(100,90,80);
        
        KramRecord.print(KramRecord.getName());
        PakYanRecord.print(PakYanRecord.getName());
        AngkuRecord.print(AngkuRecord.getEnglishGrade(),AngkuRecord.getMathGrade(),AngkuRecord.getScienceGrade());
        
        System.out.println("Banyak Siswa      = "+StudentRecord.getStudentCount());
  }

}
