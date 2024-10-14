/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

public abstract class RekeningBank implements Rekening{
    private final int nomorRekening;
    private String pemilikRekening;
    private double saldo;

    private static int penghitungRekening = 1000;

    public RekeningBank(String pemilikRekening, double saldo) {
        this.nomorRekening = penghitungRekening++;
        this.pemilikRekening = pemilikRekening;
        this.saldo = saldo;
    }

    @Override
    public final void tampilkanInformasiRekening() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Pemilik Rekening: " + pemilikRekening);
        System.out.println("Saldo: Rp" + saldo);
    }

    @Override
    public int getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilikRekening() {
        return pemilikRekening;
    }

    public void setPemilikRekening(String pemilikRekening) {
        this.pemilikRekening = pemilikRekening;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

