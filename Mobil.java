/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = "Belum di-set";    
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warnaBaru) {
        this.warna = warnaBaru;
        System.out.println("Warna mobil " + merk + " diubah menjadi: " + this.warna);
    }

    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }

    void info() {
        System.out.println("==Informasi Mobil==");
        System.out.println("Merk : " + getMerk());
        System.out.println("Merk : " + getModel());
        System.out.println("Merk : " + getTahun());
        System.out.println("Merk : " + getWarna());
    }
}
