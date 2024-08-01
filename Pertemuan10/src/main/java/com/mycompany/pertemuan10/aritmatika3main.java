/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan10;

/**
 *
 * @author Farhannn
 */
public class aritmatika3main {
    public static void main(String[] args) {
        aritmatika3 aritmatikaku = new aritmatika3();
        int bilangan1 = 10;
        int bilangan2 = 20;

        
        aritmatikaku.pengurangan(bilangan1, bilangan2);
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + aritmatikaku.getHasil());

        
        aritmatikaku.perkalian(bilangan1, bilangan2);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + aritmatikaku.getHasil());

        
        aritmatikaku.pembagian(bilangan1, bilangan2);
        System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + aritmatikaku.getHasil());


        aritmatikaku.pangkat(bilangan1, bilangan2);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + aritmatikaku.getHasil());
    }
}
