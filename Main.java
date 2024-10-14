/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat instance ManajemenBank yang mengimplementasikan interface CRUD
        ManajemenBank2 manajemen = new ManajemenBank2();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Bank ===");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Tampilkan Rekening");
            System.out.println("3. Perbarui Saldo");
            System.out.println("4. Hapus Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Memanggil metode tambahRekening dari interface CRUD yang diimplementasikan di ManajemenBank
                    manajemen.tambahRekening();
                    break;
                case 2:
                    // Memanggil metode tampilkanRekening dari interface CRUD
                    manajemen.tampilkanRekening();
                    break;
                case 3:
                    // Memanggil metode perbaruiSaldo dari interface CRUD
                    manajemen.perbaruiSaldo();
                    break;
                case 4:
                    // Memanggil metode hapusRekening dari interface CRUD
                    manajemen.hapusRekening();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem manajemen bank!");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
