/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author Nayla Syazana Aziza 2410010547
 */
public class MainKontak {
    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(
                new Kontak(
                        "Andi",
                        "0811111",
                        "andi@gmail.com"));

        buku.tambahKontak(
                new Kontak(
                        "Budi",
                        "0822222",
                        "budi@gmail.com"));

        buku.tambahKontak(
                new Kontak(
                        "Citra",
                        "0833333",
                        "citra@gmail.com"));

        buku.tampilkanSemua();

        buku.simpanKeBerkas();

        System.out.println("\nCari Kontak:");
        buku.cariKontak("Budi");

        System.out.println("\nHapus Kontak:");
        buku.hapusKontak("Andi");

        System.out.println("\nData Setelah Dihapus:");
        buku.tampilkanSemua();

        System.out.println();

        BukuKontak bukuLain = new BukuKontak("kontak.txt");

        bukuLain.muatDariBerkas();

        System.out.println("\nData Dari Berkas:");
        bukuLain.tampilkanSemua();

        System.out.println(
                "Jumlah kontak: "
                        + bukuLain.jumlahKontak());
    }

}
