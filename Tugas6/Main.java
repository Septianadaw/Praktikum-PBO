/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Smartphone", 3000000));
        keranjang.tambahProduk(new Pakaian("Jaket", 250000));

        // Tampilkan detail tiap produk
        keranjang.tampilkanSemuaProduk();

        // Tampilkan total
        System.out.println("Total harga setelah diskon: Rp " + keranjang.hitungTotal());
    }
}


