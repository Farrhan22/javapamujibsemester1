/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan4no1;

/**
 *
 * @author Farhannn
 */
public class Pertemuan4No1 {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 3;

        int hasilTambah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
        int hasilKali = angka1 * angka2;
        double hasilBagi = (double) angka1 / angka2;

        System.out.println("Hasil Pertambahan A + B = " + hasilTambah);
        System.out.println("Hasil Pengurangan A - B = " + hasilKurang);
        System.out.println("Hasil Perkalian A * B = " + hasilKali);
        System.out.println("Hasil Pembagian A / B = " + String.format("%.6f", hasilBagi));
    }
}
