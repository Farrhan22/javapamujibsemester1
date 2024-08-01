/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan15soal2;
import KalkuPack2.*;
/**
 *
 * @author Farhannn
 */
public class Pertemuan15Soal2 {

    public static void main(String[] args) {
        kalkulatortambah obj1 = new kalkulatortambah();
        System.out.println(obj1.tambah(22,23));
        
        kalkulatorkurang obj2 = new kalkulatorkurang();
        System.out.println(obj2.kurang(32,23));
        
        kalkulatorkali obj3 = new kalkulatorkali();
        System.out.println(obj3.kali(8, 4));
        
        kalkulatorbagi obj4 = new kalkulatorbagi();
        System.out.println(obj4.bagi(20, 10));
    }
}
