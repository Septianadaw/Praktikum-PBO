/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package praktikum11;

public class MainPerpustakaan {
    public static void main(String[] args) {

        // Membuat objek pengarang (Agregasi)
        Pengarang p1 = new Pengarang("Septiana Daw");
        Pengarang p2 = new Pengarang("Ciwa Anindya");
        Pengarang p3 = new Pengarang("Faezya Fadhil");  

        // Membuat perpustakaan dengan kapasitas 5 buku
        Perpustakaan perpus = new Perpustakaan(5);

        // Membuat buku dan menghubungkannya dengan pengarang
        Buku b1 = new Buku("Bumi", p1);
        Buku b2 = new Buku("Hujan", p2);
        Buku b3 = new Buku("Laskar Pelangi", p3);

        // Menambah buku ke perpustakaan (komposisi)
        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);
        
        // Menampilkan informasi perpustakaan
        perpus.infoPerpustakaan();
    }
}

