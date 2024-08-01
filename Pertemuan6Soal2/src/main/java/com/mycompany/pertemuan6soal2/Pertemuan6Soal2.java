/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6soal2;
import java.util.Scanner;
/**
 *
 * @author Farhann
 */
public class Pertemuan6Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM ? : ");
        int nim = scanner.nextInt();
        scanner.nextLine();

        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();

        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();

        String grade;
        String keterangan;

        if (nilai < 50) {
            grade = "Tidak lulus";
            keterangan = "Tidak lulus";
        } else if (nilai >= 50 && nilai < 60) {
            grade = "D";
            keterangan = "Lulus";
        } else if (nilai >= 60 && nilai < 70) {
            grade = "C";
            keterangan = "Lulus";
        } else if (nilai >= 70 && nilai < 80) {
            grade = "B";
            keterangan = "Lulus";
        } else if (nilai >= 80 && nilai < 90) {
            grade = "A";
            keterangan = "Lulus";
        } else if (nilai >= 90 && nilai <= 100) {
            grade = "A+";
            keterangan = "Lulus";
        } else {
            grade = "Data Nilai Salah!";
            keterangan = "Tidak lulus";
        }

        System.out.println("Output:");
        System.out.println("grade " + grade);
        System.out.println("Keterangan : " + keterangan);

        scanner.close();
    }
}
