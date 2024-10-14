/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

public class RekeningTabungan extends RekeningBank {
    private final double bunga;

    public RekeningTabungan(String pemilikRekening, double saldo, double bunga) {
        super(pemilikRekening, saldo);
        this.bunga = bunga;
    }

    public double getBunga() {
        return bunga;
    }
}