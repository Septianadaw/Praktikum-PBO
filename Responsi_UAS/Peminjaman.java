/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uas;

import java.io.Serializable;
import java.util.List;

public class Peminjaman implements PeminjamanInterface, Serializable {
    private Anggota anggota;
    private List<Buku> daftarBuku;

    public Peminjaman(Anggota anggota, List<Buku> daftarBuku) {
        this.anggota = anggota;
        this.daftarBuku = daftarBuku;
    }

    @Override
    public void pinjam() {
        System.out.println("Peminjaman oleh: " + anggota.getNama());
    }

    @Override
    public void kembalikan() {
        System.out.println("Pengembalian buku oleh: " + anggota.getNama());
    }
}



