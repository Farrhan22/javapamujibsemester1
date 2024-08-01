/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan11;

/**
 *
 * @author Farhannn
 */
public class DataKaryawan {
    String idKaryawan;
    String namaKaryawan;
    int golongan;
    String jabatan;
    double gajiPokok;

    public DataKaryawan(String idKaryawan, String namaKaryawan, int golongan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        tentukanJabatanDanGaji(golongan);
    }

    private void tentukanJabatanDanGaji(int golongan) {
        switch (golongan) {
            case 1:
                jabatan = "Assisten Staff";
                gajiPokok = 3000000;
                break;
            case 2:
                jabatan = "Staff";
                gajiPokok = 3500000;
                break;
            case 3:
                jabatan = "Supervisor";
                gajiPokok = 4000000;
                break;
            case 4:
                jabatan = "Assisten Manager";
                gajiPokok = 5000000;
                break;
            case 5:
                jabatan = "Manager";
                gajiPokok = 6000000;
                break;
            default:
                jabatan = "Tidak Diketahui";
                gajiPokok = 0;
                break;
        }
    }

    public void tampilkanData() {
        System.out.println("ID Karyawan   : " + idKaryawan);
        System.out.println("Nama Karyawan : " + namaKaryawan);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Jabatan       : " + jabatan);
        System.out.println("Gaji Pokok    : " + gajiPokok);
    }
}

