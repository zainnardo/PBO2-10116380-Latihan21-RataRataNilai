/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan21.rataratanilai;

import java.util.Scanner;

/**
 * @author 
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Program Rata-Rata Nilai
 */
public class PBO210116380Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int jumMhs;
        int i = 1;
        double rataNilai;
        double jumNilai = 0;
        double nilaiMhs;

        Scanner value = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa = ");
        jumMhs = (int) value.nextDouble();

        while (i <= jumMhs) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");

            nilaiMhs = value.nextDouble();
            jumNilai = jumNilai + nilaiMhs;
            i++;

        }
        System.out.print(" ");

        //menghitung rata-rata nilai mahasiswa
        rataNilai = jumNilai / jumMhs;
        System.out.println("Maka, Rata-rata nilainya adalah " + rataNilai);
        System.out.println("(Developed by : Zain Achmad Rizqullah)");
    }
    
}
