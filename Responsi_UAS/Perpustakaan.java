/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Anggota> daftarAnggota = new ArrayList<>();

    public void tambahAnggota(Anggota a) {
        daftarAnggota.add(a);
    }

    public void simpanData(String file) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(daftarAnggota);
            System.out.println("Data anggota berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data anggota.");
        }
    }

    public void bacaData(String file) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            daftarAnggota = (List<Anggota>) ois.readObject();
            System.out.println("\n=== DATA ANGGOTA ===");
            for (Anggota a : daftarAnggota) {
                System.out.println("ID: " + a.getId() +
                                   ", Nama: " + a.getNama());
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca data anggota.");
        }
    }
}


