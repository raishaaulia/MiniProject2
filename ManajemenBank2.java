/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

import bank.CRUD;
import bank.RekeningBank;
import bank.RekeningKredit;
import bank.RekeningTabungan;
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenBank2 implements CRUD {
    private ArrayList<RekeningBank> daftarRekening = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void tambahRekening() {
        System.out.print("\nMasukkan Nama Pemilik Rekening: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Saldo Awal: ");
        double saldo = scanner.nextDouble();
        System.out.print("Pilih tipe rekening (1. Tabungan, 2. Kredit): ");
        int tipe = scanner.nextInt();

        RekeningBank rekening;
        if (tipe == 1) {
            System.out.print("Masukkan bunga: ");
            double bunga = scanner.nextDouble();
            rekening = new RekeningTabungan(nama, saldo, bunga);
        } else {
            System.out.print("Masukkan limit penarikan: ");
            double limitPenarikan = scanner.nextDouble();
            rekening = new RekeningKredit(nama, saldo, limitPenarikan);
        }
        
        scanner.nextLine(); 
        daftarRekening.add(rekening);
        System.out.println("Rekening berhasil dibuat!");
    }

    @Override
    public void tampilkanRekening() {
        if (daftarRekening.isEmpty()) {
            System.out.println("Tidak ada rekening yang tersedia.");
        } else {
            for (RekeningBank rekening : daftarRekening) {
                rekening.tampilkanInformasiRekening();
                System.out.println("-------------------");
            }
        }
    }

    @Override
    public void hapusRekening() {
        System.out.print("\nMasukkan Nomor Rekening yang akan dihapus: ");
        int nomorRekening = scanner.nextInt();
        boolean dihapus = daftarRekening.removeIf(rekening -> rekening.getNomorRekening() == nomorRekening);
        if (dihapus) {
            System.out.println("Rekening berhasil dihapus!");
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    @Override
    public void perbaruiSaldo() {
        System.out.print("\nMasukkan Nomor Rekening yang akan diperbarui: ");
        int nomorRekening = scanner.nextInt();
        boolean ditemukan = false;
        for (RekeningBank rekening : daftarRekening) {
            if (rekening.getNomorRekening() == nomorRekening) {
                System.out.print("Masukkan saldo baru: ");
                double saldoBaru = scanner.nextDouble();
                scanner.nextLine();
                rekening.setSaldo(saldoBaru);
                System.out.println("Saldo berhasil diperbarui!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Rekening tidak ditemukan.");
        }
    }
}
