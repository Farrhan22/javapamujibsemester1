/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5no2;
import java.util.Scanner;
/**
 *
 * @author Farhannn
 */
public class Pertemuan5No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai alas: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = scanner.nextDouble();

        double luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga: " + luas);
        
        scanner.close();
    }
}

