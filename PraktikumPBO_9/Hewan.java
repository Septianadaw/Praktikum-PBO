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
abstract class Hewan {
    // Metode abstrak
    abstract void suara();
    
    // Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah hewan peliharaan.");
    }
}

// Kelas turunan Kucing
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong Meong.");
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk Guk.");
    }
}
