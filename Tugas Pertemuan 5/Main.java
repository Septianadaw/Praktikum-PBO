/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Hewan Kucing
        System.out.println("====Hewan====");
        Kucing Kucing = new Kucing();
        Kucing.nama = "Septiana";
        Kucing.jenis = "Persia";
        Kucing.tampilkanInfo();
        Kucing.suara();
        System.out.println();
        
        // Hewan Anjing
        Anjing Anjing = new Anjing();
        Anjing.nama = "Dory";
        Anjing.jenis = "Bullog";
        Anjing.tampilkanInfo();
        Anjing.suara();
        System.out.println();
        
        // Kendaraan Mobil
        System.out.println("====Kendaraan====");
        Mobil Mobil = new Mobil();
        Mobil.nama = "Civic";
        Mobil.jumlahRoda = 4;
        Mobil.jumlahPintu = 4;
        Mobil.tampilkanInfo();
        System.out.println();
        
        // Kendaraan SepedaMotor
        SepedaMotor sepedamotor = new SepedaMotor();
        sepedamotor.nama = "Yamaha";
        sepedamotor.jumlahRoda = 2;
        sepedamotor.jenisMesin = "2-Tak";
        sepedamotor.tampilkanInfo(); 
    }
}
