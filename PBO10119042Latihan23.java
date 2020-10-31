/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;

/**
 *
 * @author Stks
 */
public class IF110119042Latihan23 {
    public static void main (String[] args){
        int i, jumlah_nilai,terbesar=0, terkecil=0;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("PROGRAM NILAI TERBESAR DAN TERKECIL MAHASISWA");
        System.out.print("Masukan Nama Petugas : ");
        String petugas = Scanner.next();
        System.out.print("Masukan Banyaknya nilai Mahasiswa: ");
        jumlah_nilai= Scanner.nextInt();
        int nilai[];
        nilai = new int[jumlah_nilai];
        for(i = 0; i < jumlah_nilai; i++){
         System.out.printf("Masukan Nilai Mahasiswa ke-%d : ", i+1);   
         nilai[i] =Scanner.nextInt();
        }
        
        System.out.println();
        System.out.println("======Hasil Nilai Mahasiswa======");
        terkecil = nilai[0];
        for(i = 0; i < jumlah_nilai; i++){
        System.out.printf("Nilai Mahasiswa ke=%1$d = %2$d%n", i+1,nilai[1]);
        if (nilai[i] < terkecil){
            terkecil = nilai[i];
        }
        if (nilai[i] > terbesar){
            terbesar = nilai[i];
        }
      }
        System.out.println();
        System.out.println("Nilai terbesar adalah : "+terbesar);
        System.out.println("Nilai terkecil adalah : "+terkecil);
        System.out.println();
        System.out.println("Petugas : "+petugas);
                 
    }
}
