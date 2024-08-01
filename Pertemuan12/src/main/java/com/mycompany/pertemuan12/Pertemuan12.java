/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan12;

/**
 *
 * @author Farhannn
 */
// Kelas Induk
// Kelas Induk
class Karyawan {
    protected int gaji;
    protected int bonus;
    protected int tunjanganMakan;
    protected int transport;

    public Karyawan(int gaji, int bonus, int tunjanganMakan, int transport) {
        this.gaji = gaji;
        this.bonus = bonus;
        this.tunjanganMakan = tunjanganMakan;
        this.transport = transport;
    }

    public int hitungGajiTotal() {
        return gaji + bonus + tunjanganMakan + transport;
    }
}

// Kelas Anak
class SystemAnalyst extends Karyawan {
    public SystemAnalyst(int gaji, int bonus, int tunjanganMakan, int transport) {
        super(gaji, bonus, tunjanganMakan, transport);
    }
}

public class Pertemuan12 {
    public static void main(String[] args) {
        int gaji = 4000000;
        int bonus = 1000000;
        int tunjanganMakan = 400000;
        int transport = 500000;

        SystemAnalyst analyst = new SystemAnalyst(gaji, bonus, tunjanganMakan, transport);
        int gajiTotal = analyst.hitungGajiTotal();

        System.out.printf("Gaji System Analyst: %d%n", gaji);
        System.out.printf("Bonus: %d%n", bonus);
        System.out.printf("Tunjangan Makan: %d%n", tunjanganMakan);
        System.out.printf("Transport: %d%n", transport);
        System.out.printf("Gaji Total: %d%n", gajiTotal);
    }
}
