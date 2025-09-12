/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Manusia {
    // Atribut dengan access modifier berbeda
    private String nama;        // hanya bisa diakses lewat getter/setter
    protected int usia;         // bisa diakses subclass atau package sama
    public String pekerjaan;    // bisa diakses dari mana saja
    
// Contructor
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    
 // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}

