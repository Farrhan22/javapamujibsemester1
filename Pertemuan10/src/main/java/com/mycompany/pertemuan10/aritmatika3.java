/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan10;

/**
 *
 * @author Farhannn
 */

public class aritmatika3 {
    int hasil;

    
    void setTambah(int bil1, int bil2) { 
        hasil = bil1 + bil2;
    }

    
    int getTambah() {
        return hasil;
    }

    
    void pengurangan(int bil1, int bil2) {
        hasil = bil1 - bil2;
    }

    
    void perkalian(int bil1, int bil2) {
        hasil = bil1 * bil2;
    }

    
    void pembagian(int bil1, int bil2) {
        if (bil2 != 0) {
            hasil = bil1 / bil2;
        } else {
            System.out.println("Pembagi tidak boleh nol.");
            hasil = 0;  
        }
    }

    
    void pangkat(int bil1, int bil2) {
        hasil = (int) Math.pow(bil1, bil2);
    }

    
    int getHasil() {
        return hasil;
    }
}

