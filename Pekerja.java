/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */

public class Pekerja extends Manusia {
    private double gaji; // Atribut tambahan khusus untuk gaji
    
    // Contructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil contructor dari kelas induk (Manusia)
        this.gaji = gaji;
    }
    
    // Getter dan Setter untuk gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    @Override
    public String toString() {
        return "Nama       : " + getNama() + "\n" +   // nama private → akses via getter
                "Usia       : " + usia + "\n" +       // usia protected → bisa langsung di subclass
                "Pekerjaan  : " + pekerjaan + "\n" +  // pekerjaan public → bisa langsung diakses
                "Gaji       : " + gaji;
    }
}