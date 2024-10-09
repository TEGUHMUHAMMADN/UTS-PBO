/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.util.Scanner;

public class Hotel {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kamar kamar1 = new Kamar("1010", "Standar", true, 500000);
        Kamar kamar2 = new Kamar("1020", "ESKLUSIF", true, 750000);
        Kamar kamar3 = new Kamar("1030", "Reguler", true, 600000);
        Kamar kamar4 = new Kamar("1040", "VIP", true, 900000);
        Kamar kamar5 = new Kamar("1050", "VVIP", true, 1200000);       
        System.out.println("=============================================");
        System.out.println("      Selamat Datang di Hotel Singaperbangsa ");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("=============================================");
        System.out.println("                MENU UTAMA                   ");
        System.out.println("=============================================");
        System.out.println("1. (ADMIN) INFO RUANGAN & Atur Ketersediaan");
        System.out.println("2. (Customer) CHECK-IN");
        System.out.println("3. Keluar");
        System.out.println("=============================================");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  
        if (pilihan == 1) {
            Admin admin = new Admin("Admin");
            admin.tampilkanInfoKamar(kamar1, kamar2, kamar3, kamar4, kamar5);
            System.out.print("Masukkan nomor kamar yang ingin diubah ketersediaannya (1/2/3/4/5): ");
            int nomorKamarPilihan = scanner.nextInt();
            if (nomorKamarPilihan == 1) {
                admin.ubahStatusKetersediaan(kamar1);
            } else if (nomorKamarPilihan == 2) {
                admin.ubahStatusKetersediaan(kamar2);
            } else if (nomorKamarPilihan == 3) {
                admin.ubahStatusKetersediaan(kamar3);
            } else if (nomorKamarPilihan == 4) {
                admin.ubahStatusKetersediaan(kamar4);
            } else if (nomorKamarPilihan == 5) {
                admin.ubahStatusKetersediaan(kamar5);
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } else if (pilihan == 2) {
            System.out.println("=============================================");
            System.out.println("              INFORMASI PEMESAN                 ");
            System.out.println("=============================================");
            System.out.print("Masukkan Nama                : ");
            String namaCostumer = scanner.nextLine();
            System.out.print("Masukkan Tanggal Pemesanan (D/M/Y)  : ");
            String tanggalPemesan = scanner.nextLine();  
            Costumer costumer = new Costumer(namaCostumer, tanggalPemesan);
            System.out.println("=============================================");
            System.out.println("        PILIH KAMAR YANG TERSEDIA            ");
            System.out.println("=============================================");
            kamar1.tampilkanDetail();
            kamar2.tampilkanDetail();
            kamar3.tampilkanDetail();
            kamar4.tampilkanDetail();
            kamar5.tampilkanDetail();
            System.out.print("Pilih nomor kamar yang ingin dipesan (1/2/3/4/5): ");
            int nomorKamarPilihan = scanner.nextInt();
            if (nomorKamarPilihan == 1) {
                costumer.checkIn(kamar1);
            } else if (nomorKamarPilihan == 2) {
                costumer.checkIn(kamar2);
            } else if (nomorKamarPilihan == 3) {
                costumer.checkIn(kamar3);
            } else if (nomorKamarPilihan == 4) {
                costumer.checkIn(kamar4);
            } else if (nomorKamarPilihan == 5) {
                costumer.checkIn(kamar5);
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            scanner.nextLine();  
            System.out.print("Masukkan Tanggal Check-out (D/M/Y): ");
            String tanggalCheckOut = scanner.nextLine();
            costumer.checkOut(tanggalCheckOut);
            costumer.tampilkanInfo();
        } else if (pilihan == 3) {
            System.out.println("=============================================");
            System.out.println("          Terima kasih telah menggunakan     ");
            System.out.println("        layanan kami. Semoga harimu Menyenangkan!    ");
            System.out.println("=============================================");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        System.out.println();
        scanner.close();
    }
}

    

