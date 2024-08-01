/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan13soal2;

/**
 *
 * @author Farhannn
 */
public class Segitiga {

    private double alas;
    private double tinggi;
    private double luas;

    // Konstruktor dengan dua parameter (alas dan tinggi)
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        hitungLuas();  // Menghitung luas saat objek dibuat
    }

    // Method untuk menghitung luas berdasarkan nilai atribut
    private void hitungLuas() {
        this.luas = (alas * tinggi) / 2;
    }

    // Method overloading: menghitung luas dengan parameter yang diberikan
    public double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    // Getter untuk luas
    public double getLuas() {
        return luas;
    }

    // Setter untuk alas
    public void setAlas(double alas) {
        this.alas = alas;
        hitungLuas(); // Update luas jika alas berubah
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        hitungLuas(); // Update luas jika tinggi berubah
    }
}

