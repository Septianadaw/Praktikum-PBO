/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemBuku {

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private List<Buku> daftarBuku = new ArrayList<>();

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU SISTEM BUKU ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan ke File Teks (buku.txt)");
            System.out.println("3. Simpan ke File Serial (buku.ser)");
            System.out.println("4. Tampilkan dari File Teks");
            System.out.println("5. Tampilkan dari File Serial");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilDariFileTeks();
                case 5 -> tampilDariFileSerial();
                case 6 -> {
                    System.out.println("Keluar dari program...");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private void tambahBuku(Scanner scanner) {
        System.out.print("Judul buku: ");
        String judul = scanner.nextLine();

        System.out.print("Pengarang: ");
        String pengarang = scanner.nextLine();

        System.out.print("Tahun terbit: ");
        int tahun = scanner.nextInt();

        daftarBuku.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan!");
    }

    private void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : daftarBuku) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Kesalahan saat menulis file teks");
        }
    }

    private void simpanKeFileSerial() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Data berhasil diserialisasi ke buku.ser");
        } catch (IOException e) {
            System.out.println("Kesalahan saat serialisasi file");
        }
    }

    private void tampilDariFileTeks() {
        System.out.println("\n=== Daftar Buku dari File Teks ===");

        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File teks gagal dibaca atau belum ada.");
        }
    }

    private void tampilDariFileSerial() {
        System.out.println("\n=== Daftar Buku dari File Serial ===");

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {

            List<Buku> data = (List<Buku>) ois.readObject();
            for (Buku buku : data) {
                buku.tampilkanInfo();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File serial gagal dibaca atau belum ada.");
        }
    }
}

