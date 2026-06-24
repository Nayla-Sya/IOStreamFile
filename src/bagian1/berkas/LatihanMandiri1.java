/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.berkas;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Nayla Syazana Aziza 2410010547
 */
public class LatihanMandiri1 {
    public static void main(String[] args) {

        // 1. Mengecek laporan.txt
        File laporan = new File("laporan.txt");

        if (laporan.exists()) {
            System.out.println("laporan.txt ada.");
            System.out.println("Ukuran file: " + laporan.length() + " byte");
        } else {
            System.out.println("laporan.txt tidak ditemukan.");
        }

        // 2. Membuat folder arsip
        File folderArsip = new File("arsip");

        if (folderArsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        // 3. Membuat dan menghapus sementara.txt
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("\nStatus sebelum dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

            if (sementara.delete()) {
                System.out.println("File sementara.txt berhasil dihapus.");
            } else {
                System.out.println("File sementara.txt gagal dihapus.");
            }

            System.out.println("Status sesudah dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
