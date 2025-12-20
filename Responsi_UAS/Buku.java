/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uas;

public class Buku extends Koleksi {
    private String penulis;
    private boolean tersedia;

    public Buku(String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
        this.tersedia = true;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    @Override
    public String getInfo() {
        String status = tersedia ? "Tersedia" : "Dipinjam";
        return "ID: " + id + ", Judul: " + judul +
               ", Penulis: " + penulis +
               ", Status: " + status;
    }
}






