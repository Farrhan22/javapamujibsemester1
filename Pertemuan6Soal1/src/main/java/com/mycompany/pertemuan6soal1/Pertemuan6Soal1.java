/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6soal1;
import java.util.Scanner;
/**
 *
 * @author Farhann
 */
public class Pertemuan6Soal1 {

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

        if (nilai < 50) {
            grade = "Tidak lulus";
        } else if (nilai >= 50 && nilai < 60) {
            grade = "D";
        } else if (nilai >= 60 && nilai < 70) {
            grade = "C";
        } else if (nilai >= 70 && nilai < 80) {
            grade = "B";
        } else if (nilai >= 80 && nilai < 90) {
            grade = "A";
        } else if (nilai >= 90 && nilai <= 100) {
            grade = "A+";
        } else {
            grade = "Data Nilai Salah!";
        }

        System.out.println("Output:");
        System.out.println("grade " + grade);

        scanner.close();
    }
}

