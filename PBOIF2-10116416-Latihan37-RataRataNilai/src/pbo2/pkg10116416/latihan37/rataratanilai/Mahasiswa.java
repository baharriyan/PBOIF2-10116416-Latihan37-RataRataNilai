/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116416.latihan37.rataratanilai;

/**
 * 
 * @author  
 * NAMA     : riyan bahar
 * KELAS    : IF-2
 * NIM      : 10116416
 */
public class Mahasiswa {
    private double nilai = 0;
    private int jmlMahasiswa;

    public void setNilai(double nilai) {
        this.nilai = this.nilai + nilai;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public void setJmlMahasiswa(int jmlMahasiswa) {
        this.jmlMahasiswa = jmlMahasiswa;
    }
    
    public double hitungRataRata() {
        return nilai / jmlMahasiswa;
    }
}
