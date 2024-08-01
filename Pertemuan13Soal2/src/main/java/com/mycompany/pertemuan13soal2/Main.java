/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan13soal2;

/**
 *
 * @author Farhannn
 */
public class Main {

    public static void main(String[] args) {
        
        Segitiga segitiga = new Segitiga(10, 5);

        
        System.out.println("Luas Segitiga (dihitung oleh konstruktor): " + segitiga.getLuas());

        
        double luasBaru = segitiga.hitungLuas(15, 7);
        System.out.println("Luas Segitiga (dihitung dengan method overloading): " + luasBaru);

        
        segitiga.setAlas(12);
        segitiga.setTinggi(6);
        System.out.println("Luas Segitiga (setelah update atribut): " + segitiga.getLuas());
    }
}
