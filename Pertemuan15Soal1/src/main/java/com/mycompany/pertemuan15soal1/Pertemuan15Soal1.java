/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan15soal1;
import KalkuPack.Kalkulator;
/**
 *
 * @author Farhannn
 */
public class Pertemuan15Soal1 {


    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        int tambah = kalkulator.tambah(22, 100);
        System.out.println(tambah);
             
        int kurang = kalkulator.kurang(11, 12);
        System.out.println(kurang);
        
        int bagi = kalkulator.bagi(34, 2);
        System.out.println(bagi);
        
        int kali = kalkulator.kali(8, 5);
        System.out.println(kali);
    }
}