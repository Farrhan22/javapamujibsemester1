/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7soal2;
import java.util.Scanner;

public class Pertemuan7Soal2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM : ");
        int nim = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("NAMA : ");
        String nama = scanner.nextLine();

        System.out.print("TAHUN : ");
        int tahun = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("PILIH PEMINATAN : ");
        char peminatan = scanner.next().charAt(0);

        String output = "";
        switch (tahun) {
            case 1:
                output = "Bahasa Inggris, Matematika, Sain";
                break;
            case 2:
                switch (peminatan) {
                    case 'C':
                        output = "Sistem Operasi, Pemrograman Java, Struktur Data";
                        break;
                    case 'E':
                        output = "Algoritma, Logika Informatika";
                        break;
                    case 'M':
                        output = "DBMS, Manajemen Proyek";
                        break;
                    default:
                        output = "Peminatan tidak diketahui.";
                        break;
                }
                break;
            case 3:
                switch (peminatan) {
                    case 'C':
                        output = "Organisasi Komputer, MultiMedia";
                        break;
                    case 'E':
                        output = "Perancangan Sistem, Pemrograman WEB";
                        break;
                    case 'M':
                        output = "Pemrograman Mobile, Pemrograman Java 2";
                        break;
                    default:
                        output = "Peminatan tidak diketahui.";
                        break;
                }
                break;
            case 4:
                switch (peminatan) {
                    case 'C':
                        output = "Komunikasi Data, MultiMedia";
                        break;
                    case 'E':
                        output = "Sistem Terdistribusi, Image Processing";
                        break;
                    case 'M':
                        output = "SIM, Sistem Jaringan";
                        break;
                    default:
                        output = "Peminatan tidak diketahui.";
                        break;
                }
                break;
            default:
                output = "Tahun tidak diketahui.";
                break;
        }

        System.out.println("Output:");
        System.out.println(output);

        scanner.close();
    }
}
