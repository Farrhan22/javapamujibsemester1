/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal1;

/**
 *
 * @author Farhannn
 */
public class Pertemuan16Soal1 extends aritmatika{

    public void tambah(double a, double b) {
        System.out.println(a + b);
    }
    
    public void kurang(double a, double b) {
        System.out.println(a - b);
    }
    
    public void kali(double a, double b) {
        System.out.println(a * b);
    }
    
    public void bagi(double a, double b) {
        System.out.println(a / b);
    }
    
    public static void main(String[] args) {
        aritmatika obj = new Pertemuan16Soal1();
        obj.tambah(9.5, 2.5);
        obj.kurang(9.5, 2.5);
        obj.kali(9.5, 2.5);
        obj.bagi(9.5, 2.5);
    }
}