/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author acer
 */
// Definisi kelas abstrak
abstract class Kendaraan {
    // Metode abstrak
    abstract void berjalan();
    
    // Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

// Kelas turunan Mobil dari Kendaraan
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

// Kelas turunan Sepeda dari Kendaraan
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}