/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Buat objek dari kelas Pekerja
        Pekerja pekerja1 = new Pekerja("Budi", 25, "Programmer", 7000000);

        // Tampilkan informasi pekerja dengan toString()
        System.out.println("==Data Pekerja Awal==");
        System.out.println(pekerja1.toString());

        // Ubah nama pekerja menggunakan setter
        pekerja1.setNama("Andi");

        // Tampilkan ulang informasi pekerja
        System.out.println("\n=== Data Pekerja Setelah Nama Diubah ===");
        System.out.println(pekerja1.toString());

        System.out.println("\n==Percobaan Akses Langsung Atribut==");
        System.out.println("nama (private) : tidak bisa diakses langsung"); // ERROR, karena nama private
        System.out.println("usia (protected) : bisa diakses di subclass/turunan, tapi tidak langsung di luar package kecuali subclass"); 
        System.out.println("pekerjaan (public) : bisa diakses langsung"); // Bisa diakses karena public
        System.out.println("gaji (private) : tidak bisa diakses langsung"); // ERROR, karena gaji private
    }
}
