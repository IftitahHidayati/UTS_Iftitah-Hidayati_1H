/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Iftitah;

/**
 *
 * @author Iftitah Hidayati
 */
public class Transaksi {

    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;

    Transaksi(double a, double b, double c, String d, String e) {
        this.saldo = a;
        this.saldoAwal = b;
        this.saldoAkhir = c;
        this.tanggalTransaksi = d;
        this.type = e;
    }
}
