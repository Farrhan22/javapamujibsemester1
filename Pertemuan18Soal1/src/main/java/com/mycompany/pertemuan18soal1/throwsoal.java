/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan18soal1;

/**
 *
 * @author Farhannn
 */
public class throwsoal {
    public class Main {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("DIBAWAH UMUR!!!");
        } else {
            System.out.println("SUDAH CUKUP UMUR!");
        }
    }
}
}
