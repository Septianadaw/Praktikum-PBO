/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2019);
        Mobil mobil2 = new Mobil("Honda", "Civic", 2020);
        mobil1.info();
        mobil1.startEngine();
        
        System.out.println();
        
        mobil2.info();
        mobil2.startEngine();
         
        System.out.println();
        
        mobil1.setWarna("Merah");
        mobil2.setWarna("Hitam");
        
        mobil1.info();
        System.out.println();
        mobil2.info();
    }
    
}
