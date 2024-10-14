/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

public class RekeningKredit extends RekeningBank {
    private final double limitPenarikan;

    public RekeningKredit(String pemilikRekening, double saldo, double limitPenarikan) {
        super(pemilikRekening, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    public double getLimitPenarikan() {
        return limitPenarikan;
    }
}
