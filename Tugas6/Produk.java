/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

// Kelas abstrak Produk
abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungDiskon();

    public double hargaSetelahDiskon() {
        return harga - hitungDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Produk: " + nama);
        System.out.println("Harga Asli: Rp " + harga);
        System.out.println("Diskon: Rp " + hitungDiskon());
        System.out.println("Harga Setelah Diskon: Rp " + hargaSetelahDiskon());
        System.out.println("----------------------------------");
    }
}

// Kelas turunan Buku
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.10; // diskon 10%
    }
}

// Kelas turunan Elektronik
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.20; // diskon 20%
    }
}

// Kelas turunan Pakaian
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.15; // diskon 15%
    }
}

// Kelas KeranjangBelanja
class KeranjangBelanja {
    private List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public void tampilkanSemuaProduk() {
        for (Produk p : daftarProduk) {
            p.tampilkanInfo();
        }
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.hargaSetelahDiskon();
        }
        return total;
    }
}