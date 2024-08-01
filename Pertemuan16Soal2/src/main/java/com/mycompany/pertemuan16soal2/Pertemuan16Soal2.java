/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal2;
import Kalkulator.Kalkulatorlagi;
/**
 *
 * @author Farhannn
 */
public class Pertemuan16Soal2 {

    public static void main(String[] args) {
        Kalkulatorlagi kalkulator = new Kalkulatorlagi();
        
        double tambah = kalkulator.getTambah(9.5, 2.5);
        System.out.println(tambah);
             
        double kurang = kalkulator.getKurang(9.5, 2.5);
        System.out.println(kurang);
        
        double bagi = kalkulator.getBagi(9.5, 2.5);
        System.out.println(bagi);
        
        double kali = kalkulator.getKali(9.5, 2.5);
        System.out.println(kali);
    }
}
