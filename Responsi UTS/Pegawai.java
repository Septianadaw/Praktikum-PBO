/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeptianaDiyahAyuWulandari;

/**
 *
 * @author ASUS
 */
// Kelas Induk Pegawai
public class Pegawai {
    // Atribut dienkapsulasi menggunakan akses modifier private
    private String namaPegawai;
    private double gaji;
    
    // Konstruktor untuk inisialisasi objek pegawai
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Getter dan Setter untuk setiap atribut
    // Getter atribut namaPegawai
    public String getnamaPegawai() {
        return namaPegawai;
    }
    // Setter atribut namaPegawai
    public void setnamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    // Getter atribut gaji
    public double getGaji() {
        return gaji;
    }
    // Setter atribut gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Method tampilkanInfo() untuk menampilkan informasi pegawai
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

// Pewarisan (Inheritance) dari Pegawai
// Tambahan Kelas turunan PegawaiTetap
class PegawaiTetap extends Pegawai {
    private double tunjangan; // atribut tambahan untuk pegawai tetap
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji); // memanggil constructor Pegawai
        this.tunjangan = tunjangan;
    }
    
    // Getter atribut tunjangan
    public double getTunjangan() { 
        return tunjangan; 
    }
    // Setter atribut tunjangan
    public void setTunjangan(double tunjangan) { 
        this.tunjangan = tunjangan; 
    }
    
    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info dasar pegawai
        System.out.println("Tunjangan: " + tunjangan);
    }
}

// Tambahan Kelas turunan PegawaiKontrak
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // atribut tambahan lama kontrak dalam bulan

    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    // Getter atribut LamaKontrak
    public int getLamaKontrak() { 
        return lamaKontrak; 
    }
    // Setter atribut LamaKontrak
    public void setLamaKontrak(int lamaKontrak) { 
        this.lamaKontrak = lamaKontrak; 
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}




