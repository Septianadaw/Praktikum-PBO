/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeptianaDiyahAyuWulandari;

/**
 *
 * @author ASUS
 */
// Kelas dan Objek
// Kelas induk Produk
public class Produk {
    // Atribut dienkapsulasi menggunakan akses modifier private
    private String namaProduk;
    private double harga; 
    
    // Konstruktor untuk inisialisasi objek Produk
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    } 
    
    // Enkapsulasi
    // Getter dan Setter untuk mengakses atribut private
    // Getter namaProduk
    public String getnamaProduk() {
        return namaProduk;
    }
    // Setter namaProduk
    public void setnamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
          
    // Getter harga
    public double getHarga() {
        return harga;
    }
    // Setter harga
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Method tampilkanInfo() untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}

// Pewarisan (Inheritance) dari Produk
// Tambahan Kelas turunan Produk Elektronik
class Elektronik extends Produk {
    private int garansi; // tambahan atribut dalam tahun khusus Elektronik
    
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga); // memanggil constructor Produk
        this.garansi = garansi;
    }
    
    // Getter atribut garansi
    public int getGaransi() {
        return garansi;
    }
    // Setter atribut garansi
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " Tahun");
    } 
}

// Tambahan Kelas turunan Produk Makanan
class Makanan extends Produk {
    private String tanggalKadaluarsa; // Tambahkan atribut tanggalKadaluarsa
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga); // memanggil constructor Produk
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Getter atribut tanggalKadaluarsa
    public String gettanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    
    // Setter atribut tanggalKadaluarsa
    public void settanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // override tampilkanInfo untuk menambah informasi kadaluarsa
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tahun Kadaluarsa: " + tanggalKadaluarsa);
    }
}
