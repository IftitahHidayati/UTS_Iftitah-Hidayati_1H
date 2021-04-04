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
public class RekeningService {

    Rekening[] reks = new Rekening[14];
    Transaksi[] trans = new Transaksi[14];
    int idxRek = 0, idxTran;

    void tambahRek(Rekening m) {

        if (idxRek < reks.length) {
            reks[idxRek] = m;
            idxRek++;
        } else {
            System.out.println("Data Sudah Penuh");
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        }
    }

    void tambahTrans(Transaksi n) {

        if (idxTran < trans.length) {
            trans[idxTran] = n;
            idxTran++;
        } else {
            System.out.println("Data Sudah Penuh");
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        }
    }

    void tampilRekening() {
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        System.out.println("No Rek\t\tNama Lengkap\t\t\t  Phone\t\t Email");
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        for (Rekening m : reks) {
            System.out.println(m.noRekening + "\t" + m.nama + " " + m.namaIbu + "\t\t    " + m.phone + "\t\t" + m.email);
        }
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
    }

    void tampilTransaksi() {
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        System.out.println("No Rek\t\t Saldo\t\t SaldoAwal\t SaldoAkhir\t Type\t\t Tanggal");
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        for (int i = 0; i < trans.length; i++) {
            System.out.println(reks[i].noRekening + "\t " + trans[i].saldo + "\t " + trans[i].saldoAwal + "\t "
                    + trans[i].saldoAkhir + "\t " + trans[i].type + "\t " + trans[i].tanggalTransaksi);
        }
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
    }

    void FindSeqSearch(int cari) {
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        for (int i = 0; i < trans.length; i++) {
            if (trans[i].saldo > cari) {
                System.out.println(reks[i].noRekening + "\t " + trans[i].saldo + "\t " + trans[i].saldoAwal + "\t "
                        + trans[i].saldoAkhir + "\t " + trans[i].type + "\t " + trans[i].tanggalTransaksi);
            }
        }
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
    }

    void cek(String cari) {
        for (int i = 0; i < reks.length; i++) {
            if (reks[i].noRekening.equals(cari)) {
                System.out.println(" No Rekening   : " + reks[i].noRekening);
                System.out.println(" Nama Pemilik  : " + reks[i].nama + " " + reks[i].namaIbu);
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println(" Saldo\t\t SaldoAwal\t SaldoAkhir\t Tanggal\t\t Type");
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println(" " + trans[i].saldo + "\t " + trans[i].saldoAwal + "\t "
                        + trans[i].saldoAkhir + "\t " + trans[i].type + "\t " + trans[i].tanggalTransaksi);
            }
        }
    }

    void sorting(boolean bool) {
        int ukuran = reks.length;
        for (int i = 0; i < ukuran - 1; i++) {
            for (int j = i + 1; j < reks.length; j++) {
                if (bool == false) {
                    if (reks[i].nama.compareToIgnoreCase(reks[j].nama) > 0) {
                        String temp = reks[i].nama;
                        reks[i].nama = reks[j].nama;
                        reks[j].nama = temp;
                    }
                } else if (reks[i].nama.compareToIgnoreCase(reks[j].nama) < 0) {
                    String temp = reks[i].nama;
                    reks[i].nama = reks[j].nama;
                    reks[j].nama = temp;
                }
            }
        }
    }
}
