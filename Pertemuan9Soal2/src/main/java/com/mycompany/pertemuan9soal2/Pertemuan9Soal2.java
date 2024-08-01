/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9soal2;
import java.util.Scanner;
/**
 *
 * @author Farhannn
 */
public class Pertemuan9Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai awal dan nilai akhir dari pengguna
        System.out.print("Masukan bilangan awal: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Masukan bilangan akhir: ");
        int nilaiAkhir = scanner.nextInt();

        System.out.println("Hasil deret bilangan:");

        int i = nilaiAwal;
        boolean first = true; // Untuk mengatur koma

        // Perulangan while untuk menampilkan bilangan dengan pertambahan 5
        while (i <= nilaiAkhir) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(i);
            i += 5;
            first = false;
        }

        System.out.println(); // Baris baru

        // Menutup scanner
        scanner.close();
    }
}
