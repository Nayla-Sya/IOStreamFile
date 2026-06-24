/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Nayla Syazana Aziza 2410010547
 */
public class MainTugas {
     public static void main(String[] args) {

        String[] kategori = {
            "Elektronik",
            "Makanan",
            "Minuman"
        };

        System.out.println("=== KATEGORI BARANG ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(
                new Barang("Laptop", 7000000, 5));

        gudang.tambahBarang(
                new Barang("Mouse", 150000, 20));

        gudang.tambahBarang(
                new Barang("Keyboard", 300000, 15));

        gudang.tambahBarang(
                new Barang("Monitor", 2000000, 8));

        gudang.tambahBarang(
                new Barang("Flashdisk", 100000, 25));

        System.out.println("=== DATA AWAL ===");
        gudang.tampilkanSemua();

        System.out.println();
        gudang.simpanKeBerkas();

        System.out.println();

        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println();
        System.out.println("=== DATA HASIL MUAT BERKAS ===");

        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println(
                "Total Nilai Persediaan: Rp"
                        + gudangBaru.totalNilai());
    }
}
