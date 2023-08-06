/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gometri;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Gometri {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun geometri:");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi Panjang");
        System.out.print("Masukkan pilihan (1/2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                hitungLingkaran();
                break;
            case 2:
                hitungPersegiPanjang();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    public static void hitungLingkaran() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jariJari);
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }

    public static void hitungPersegiPanjang() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        double luas = persegiPanjang.hitungLuas();
        double keliling = persegiPanjang.hitungKeliling();

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}
  
    

