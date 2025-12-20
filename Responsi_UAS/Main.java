/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uas;

import java.util.*;
import java.io.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    static List<Buku> daftarBuku = new ArrayList<>();
    static Perpustakaan perpustakaan = new Perpustakaan();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Simpan Buku ke File Teks (buku.txt)");
            System.out.println("6. Tampilkan Buku dari File Teks");
            System.out.println("7. Simpan Buku ke File Serial (buku.ser)");
            System.out.println("8. Tampilkan Buku dari File Serial");
            System.out.println("9. Simpan Data Anggota (Serialisasi)");
            System.out.println("10. Baca Data Anggota (Serialisasi)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine(); // bersihkan buffer

            switch (pilihan) {
                case 1:
                    tambahAnggota();
                    break;
                case 2:
                    tambahBuku();
                    break;
                case 3:
                    pinjamBuku();
                    break;
                case 4:
                    kembalikanBuku();
                    break;
                case 5:
                    simpanBukuTeks();
                    break;
                case 6:
                    tampilBukuTeks();
                    break;
                case 7:
                    simpanBukuSerial();
                    break;
                case 8:
                    tampilBukuSerial();
                    break;
                case 9:
                    perpustakaan.simpanData("anggota.ser");
                    break;
                case 10:
                    perpustakaan.bacaData("anggota.ser");
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Perpustakaan Digital.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilihan != 0);
    }

    // FITUR

    static void tambahAnggota() {
        System.out.print("ID Anggota   : ");
        String id = input.nextLine();
        System.out.print("Nama Anggota : ");
        String nama = input.nextLine();

        perpustakaan.tambahAnggota(new Anggota(id, nama));
        System.out.println("Anggota berhasil ditambahkan.");
    }

    static void tambahBuku() {
        System.out.print("ID Buku   : ");
        String id = input.nextLine();
        System.out.print("Judul     : ");
        String judul = input.nextLine();
        System.out.print("Penulis   : ");
        String penulis = input.nextLine();

        daftarBuku.add(new Buku(id, judul, penulis));
        System.out.println("Buku berhasil ditambahkan.");
    }

    static void pinjamBuku() {
        boolean ada = false;

        System.out.println("\n=== DAFTAR BUKU TERSEDIA ===");
        for (Buku b : daftarBuku) {
            if (b.isTersedia()) {
                System.out.println(b.getInfo());
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada buku yang tersedia.");
            return;
        }

        System.out.print("Masukkan ID Buku yang ingin dipinjam: ");
        String idBuku = input.nextLine();

        Buku buku = cariBukuById(idBuku);

        if (buku == null) {
            System.out.println("Buku tidak ditemukan.");
        } else if (!buku.isTersedia()) {
            System.out.println("Buku sedang dipinjam.");
        } else {
            buku.setTersedia(false);
            System.out.println("Buku berhasil dipinjam.");
        }
    }

    static void kembalikanBuku() {
        boolean ada = false;

        System.out.println("\n=== DAFTAR BUKU DIPINJAM ===");
        for (Buku b : daftarBuku) {
            if (!b.isTersedia()) {
                System.out.println(b.getInfo());
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada buku yang sedang dipinjam.");
            return;
        }

        System.out.print("Masukkan ID Buku yang akan dikembalikan: ");
        String idBuku = input.nextLine();

        Buku buku = cariBukuById(idBuku);

        if (buku == null) {
            System.out.println("Buku tidak ditemukan.");
        } else if (buku.isTersedia()) {
            System.out.println("Buku sudah tersedia.");
        } else {
            buku.setTersedia(true);
            System.out.println("Buku berhasil dikembalikan.");
        }
    }

    // FILE TEKS
    static void simpanBukuTeks() {
        try (PrintWriter pw = new PrintWriter("buku.txt")) {
            for (Buku b : daftarBuku) {
                pw.println(b.getInfo());
            }
            System.out.println("Data buku disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku ke file teks.");
        }
    }

    static void tampilBukuTeks() {
        try (BufferedReader br = new BufferedReader(new FileReader("buku.txt"))) {
            String line;
            System.out.println("\n=== DATA BUKU (TEKS) ===");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File buku.txt belum tersedia.");
        }
    }

    // FILE SERIAL
    static void simpanBukuSerial() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("buku.ser"))) {

            oos.writeObject(daftarBuku);
            System.out.println("Data buku disimpan ke buku.ser");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku ke file serial.");
        }
    }

    static void tampilBukuSerial() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("buku.ser"))) {

            List<Buku> data = (List<Buku>) ois.readObject();
            System.out.println("\n=== DATA BUKU (SERIAL) ===");
            for (Buku b : data) {
                System.out.println(b.getInfo());
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca buku dari file serial.");
        }
    }

    static Buku cariBukuById(String id) {
        for (Buku b : daftarBuku) {
            if (b.getId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }
}



