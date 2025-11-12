/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

// Kelas Main
public class Main2 {
    public static void  main(String[] args) {
         // Objek produk Elektronik
        Pembayaran handphone = new Elektronik();
        double hargaHp = 5500000;
        double pajakHp = handphone.hitungPajak(hargaHp);
        double totalHp = hargaHp + pajakHp;

        // Objek produk Makanan
        Pembayaran roti = new Makanan();
        double hargaRoti = 20000;
        double pajakRoti = roti.hitungPajak(hargaRoti);
        double totalRoti = hargaRoti + pajakRoti;

        // Menampilkan hasil untuk produk Elektronik
        System.out.println("PRODUK ELEKTRONIK");
        System.out.println("Nama Produk  : Handphone");
        System.out.println("Harga Produk : Rp " + hargaHp);
        System.out.println("Pajak (10%)  : Rp " + pajakHp);
        System.out.println("Total Bayar  : Rp " + totalHp);

        // Menampilkan hasil untuk produk Makanan
        System.out.println("\nPRODUK MAKANAN");
        System.out.println("Nama Produk  : Roti");
        System.out.println("Harga Produk : Rp " + hargaRoti);
        System.out.println("Pajak (5%)   : Rp " + pajakRoti);
        System.out.println("Total Bayar  : Rp " + totalRoti);

        // Menampilkan total keseluruhan
        System.out.println("\n=== TOTAL PEMBAYARAN ===");
        System.out.println("Total Harga Produk : Rp " + (hargaHp + hargaRoti));
        System.out.println("Total Pajak        : Rp " + (pajakHp + pajakRoti));
        System.out.println("Total yang Dibayar : Rp " + (totalHp + totalRoti));
    }
}