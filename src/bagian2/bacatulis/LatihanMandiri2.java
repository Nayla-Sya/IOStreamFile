/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

/**
 *
 * @author Nayla Syazana Aziza 2410010547
 */
public class LatihanMandiri2 {
    public static void main(String[] args) {

        String namaFile = "hari.txt";

        try {
            // 1. Menulis 5 nama hari ke file
            BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile));
            writer.write("Senin");
            writer.newLine();
            writer.write("Selasa");
            writer.newLine();
            writer.write("Rabu");
            writer.newLine();
            writer.write("Kamis");
            writer.newLine();
            writer.write("Jumat");
            writer.close();

            System.out.println("Isi file setelah ditulis:");
            tampilkanIsiFile(namaFile);

            // 2. Menambahkan 2 nama hari lagi (append)
            BufferedWriter appendWriter = new BufferedWriter(new FileWriter(namaFile, true));
            appendWriter.newLine();
            appendWriter.write("Sabtu");
            appendWriter.newLine();
            appendWriter.write("Minggu");
            appendWriter.close();

            System.out.println("\nIsi file setelah ditambah:");
            tampilkanIsiFile(namaFile);

            // 3. Menghitung jumlah baris
            BufferedReader reader = new BufferedReader(new FileReader(namaFile));
            int jumlahBaris = 0;

            while (reader.readLine() != null) {
                jumlahBaris++;
            }

            reader.close();

            System.out.println("\nJumlah baris dalam file: " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    // Method untuk menampilkan isi file
    public static void tampilkanIsiFile(String namaFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(namaFile));
        String baris;

        while ((baris = reader.readLine()) != null) {
            System.out.println(baris);
        }

        reader.close();
    }
}
