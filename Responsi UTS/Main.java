/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeptianaDiyahAyuWulandari;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // 1. Output Produk
        System.out.println("1. Output Produk:");
        Elektronik produk1 = new Elektronik("Laptop", 9000000, 2);
        produk1.tampilkanInfo();

        System.out.println(); 

        // 2. Output Pegawai
        System.out.println("2. Output Pegawai:");
        PegawaiTetap pegawai1 = new PegawaiTetap("Septiana Daw", 5000000, 1000000); 
        pegawai1.tampilkanInfo();

        System.out.println();

        // 3. Output Polimorfisme
        System.out.println("3. Output Polimorfisme:");
        // Menggunakan referensi kelas induk untuk objek turunan (Produk)
        Produk produk2 = new Makanan("Snack", 15000, "2025-12-30");
        produk2.tampilkanInfo();

        System.out.println();

        // Menggunakan referensi kelas induk untuk objek turunan (Pegawai)
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai2.tampilkanInfo();
    }
}
