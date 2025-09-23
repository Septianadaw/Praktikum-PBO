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
        Hewan kucing = new Kucing();
        kucing.bersuara(); // Outputnya Hewan Bersuara
        kucing.makan("Ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("Ikan", 2); // Memanggil metode makan() yang overloaded
        
        Anjing anjing = new Anjing();
        anjing.bersuara(); // Outputnya Woof
        anjing.makan("Daging, 3"); // Memanggil metode makan() yang overloaded pada kelas Hewan
    }
}
