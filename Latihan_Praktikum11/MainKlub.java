/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum11;

public class MainKlub {
    public static void main(String[] args) {
        // Membuat klub
        Klub klub1 = new Klub("Klub Programmer");

        // Membuat anggota
        Anggota a1 = new Anggota("Septiana");
        Anggota a2 = new Anggota("Diyah Ayu");
        Anggota a3 = new Anggota("Wulandari");

        // Menambahkan anggota ke klub
        klub1.tambahAnggota(a1);
        klub1.tambahAnggota(a2);
        klub1.tambahAnggota(a3);

        // Menampilkan info klub
        klub1.infoKlub();
    }
}


