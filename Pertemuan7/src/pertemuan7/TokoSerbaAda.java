/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan Item Barang : ");
        int item = sc.nextInt();

        // Deklarasi Array untuk menampung data
        String[] kodeBarang = new String[item];
        String[] namaBarang = new String[item];
        int[] harga = new int[item];
        int[] jmlBeli = new int[item];
        int[] jmlBayar = new int[item];
        int totalBayar = 0;

        // Input Data
        for (int i = 0; i < item; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode        : ");
            kodeBarang[i] = sc.next();
            System.out.print("Masukkan jumlah Beli : ");
            jmlBeli[i] = sc.nextInt();

            // Penentuan Nama dan Harga berdasarkan Kode
            switch (kodeBarang[i]) {
                case "a001":
                    namaBarang[i] = "Buku";
                    harga[i] = 3000;
                    break;
                case "a002":
                    namaBarang[i] = "Pensil";
                    harga[i] = 4000;
                    break;
                case "a003":
                    namaBarang[i] = "Pulpen";
                    harga[i] = 5000;
                    break;
                default:
                    namaBarang[i] = "Barang Tidak Ada";
                    harga[i] = 0;
            }
            jmlBayar[i] = harga[i] * jmlBeli[i];
            totalBayar += jmlBayar[i];
        }

        // Output Tabel
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*****************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");
        
        for (int i = 0; i < item; i++) {
            System.out.printf("%-4d %-12s %-12s %-6d %-12d %-12d\n", 
                (i + 1), kodeBarang[i], namaBarang[i], harga[i], jmlBeli[i], jmlBayar[i]);
        }
        
        System.out.println("==============================================================");
        System.out.println("Total Bayar                                       " + totalBayar);
        System.out.println("==============================================================");
    }
}
