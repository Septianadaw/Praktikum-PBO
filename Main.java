/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum9;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        System.out.println("\nPercobaan membuat objek langsung dari kelas abstrak: ");
        
        System.out.println("Percobaan: Kendaraan kendaraan = new Kendaraan();");
        System.out.println("Hasil: ERROR karena Kelas Kendaraan adalah abstrak dan tidak dapat diinstansiasi.");
        System.out.println("Pesan error yang akan muncul jika dijalankan:");
        System.out.println("\"Kendaraan is abstract; cannot be instantiated\"");
    }
}
