/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum11;

public class MainPerpustakaan {
    public static void main(String[] args) {
        
        // Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        
        // Menambah buku ke perpustakaan (komposisi)
        perpustakaan.tambahBuku(new Buku("Pemrograman Berorientasi Objek"));
        perpustakaan.tambahBuku(new Buku("Algoritma dan Struktur Data"));
        perpustakaan.tambahBuku(new Buku("Basis Data Lanjut"));
        
        // Menampilkan informasi perpustakaan
        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.infoPerpustakaan();
    }
}
