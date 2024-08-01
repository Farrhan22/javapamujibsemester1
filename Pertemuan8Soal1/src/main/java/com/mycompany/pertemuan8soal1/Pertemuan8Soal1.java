/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8soal1;
import java.util.Scanner; 
/**
 *
 * @author Farhannn
 */
public class Pertemuan8Soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai awal dan nilai akhir dari pengguna
        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();

        System.out.println("Hasil nya :");

        // Inisialisasi nomor urut untuk hasil output
        int nomorUrut = 1;

        // Perulangan for untuk menampilkan bilangan dengan pertambahan 5
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(nomorUrut + ". " + i);
            nomorUrut++;
        }

        // Menutup scanner
        scanner.close();
    }
}
