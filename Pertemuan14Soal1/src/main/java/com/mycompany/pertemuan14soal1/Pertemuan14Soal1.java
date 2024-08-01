/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14soal1;

/**
 *
 * @author Farhannn
 */
public class Pertemuan14Soal1 extends abstrakHewan{
    public void suara() {
        System.out.println("Suara Kucing MIAWWWW");
    }
    
    public static void main(String[] args) {
        abstrakHewan objek = new Pertemuan14Soal1();
        objek.suara();
        objek.suara2();
    }
}
