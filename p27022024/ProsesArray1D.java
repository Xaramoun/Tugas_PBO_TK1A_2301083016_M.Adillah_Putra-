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
import java.util.Random;
public class ProsesArray1D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int i,n;
        int jum,max,min;
        int imax,imin; //indeks t4 nilai max min berada
        float rata;
        
        System.out.print("Masukkan Banyak Data = ");
        n = in.nextInt(); //menjadi ukuran Array
        int [] A = new int[n]; //Buat Array A dengan ukuran n
        
        //isi array A 
        //System.out.println("\n***mengisi Array A***");
        for(i=0;i<=n-1;i++)
        {
           //System.out.print("Array["+i+"] =);
           //A[i] = in.nextInt();
           A[i] = rand.nextInt(100)+1; //1-100
           
        }  
        //Proses isi Array
        jum = A[0];
        max = A[0]; imax = 0;
        min = A[0]; imin = 0;
        for(i=1;i<=n-1;i++)
        {
            jum = jum + A[i];
            if(A[i]>max)
            {
                max = A[i];
                imax = i;
            }
            if(A[i]<min)
            {
                min = A[i];
                imin = i;
            }
        }
        rata = (float)jum/n;
        //Menampilkan isi Array A
        System.out.println("\n***menampilkan isi Array A***");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
        //Menampilkan Isi Array A
        System.out.println("\n***Menampilkan isi Array A yang Ganjil***");
        for(i=0;i<n;i++)
        {
            if(A[i]%2!=0)
                System.out.print(A[i]+"\t");
            //endif
        }
        //Menampilkan Isi Array A
        System.out.println("\n***menampilkan isi Array A Pada indeks Ganjil***");
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
                System.out.print(A[i]+"\t");
                        //endif
        }
        System.out.println("\nJumlah      = "+jum);
        System.out.println("\nRata-rata      = "+rata);
        System.out.println("\nNilai Terbesar      = "+max+" pada indeks ke = "+imax);
        System.out.println("\nNilai Terkecil      = "+min+" pada indeks ke = "+imin);
        
    }
    
}
