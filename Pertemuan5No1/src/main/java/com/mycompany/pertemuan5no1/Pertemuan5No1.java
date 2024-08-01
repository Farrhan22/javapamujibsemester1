/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5no1;
import java.util.Scanner;
/**
 *
 * @author Farhannn
 */


public class Pertemuan5No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.print("Nama karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Usia: ");
        int usia = scanner.nextInt();

        System.out.print("Gaji: ");
        double gaji = scanner.nextDouble();

        System.out.println("\n----------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp " + gaji);
        System.out.println("BUILD SUCCESSFUL");
        
        scanner.close();
    }
}
