/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13soal1;

/**
 *
 * @author Farhannn
 */
public class Pertemuan13Soal1 {

    
    public int operasi(int a, int b) {
        return a + b;
    }

    
    public int operasiPengurangan(int a, int b) {
        return a - b;
    }

   
    public int operasiPembagian(int a, int b) {
        return a / b;
    }

    
    public int operasiPerkalian(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Pertemuan13Soal1 kalkulator = new Pertemuan13Soal1();
        int a = 20;
        int b = 10;

        System.out.println("Hasil Pertambahan: " + kalkulator.operasi(a, b));
        System.out.println("Hasil Pengurangan: " + kalkulator.operasiPengurangan(a, b));
        System.out.println("Hasil Perkalian: " + kalkulator.operasiPerkalian(a, b));
        System.out.println("Hasil Pembagian: " + kalkulator.operasiPembagian(a, b));
    }
}
