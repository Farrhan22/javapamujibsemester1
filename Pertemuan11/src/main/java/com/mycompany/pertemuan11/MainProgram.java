/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan11;
import java.util.Scanner;
/**
 *
 * @author Farhannn
 */
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = scanner.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = scanner.nextLine();

        System.out.print("Masukkan Golongan (1-5): ");
        int golongan = scanner.nextInt();

        DataKaryawan karyawan = new DataKaryawan(idKaryawan, namaKaryawan, golongan);
        karyawan.tampilkanData();
        
        scanner.close();
    }
}

