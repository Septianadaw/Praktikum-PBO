/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
// Kelas Induk
public class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewan: " + jenis);
    }
}

// Kelas Turunan Kucing
class Kucing extends Hewan {
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kucing ini suka bermain bola yang kecil.");
    }

    //Method suara di kelas Kucing
    public void suara() {
        System.out.println("Meong... Meong...");
    }
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Anjing ini suka berlari-lari.");
    }
    
    //Method suara di kelas Anjing
    public void suara() {
        System.out.println("Guk... Guk...");
    }
}