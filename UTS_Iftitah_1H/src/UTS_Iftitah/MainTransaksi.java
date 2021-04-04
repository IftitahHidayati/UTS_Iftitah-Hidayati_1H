/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Iftitah;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class MainTransaksi {

    static Scanner sc = new Scanner(System.in);
    static RekeningService data = new RekeningService();

    public static void main(String[] abcd) {
        dataRekening();
        dataTransaksi();
        menu();
    }

    static void menu() {
        System.out.println("+========================================================+");
        System.out.println("+                   PERBANKAN - UTS                      +");
        System.out.println("+========================================================+");
        System.out.println("  1. Tampil Data Rekening");
        System.out.println("  2. Tampil Data Transaksi");
        System.out.println("  3. Mencari saldo > 500000");
        System.out.println("  4. Mencari data dengan No Rekening");
        System.out.println("  5. Sorting by name");
        System.out.println("  6. Keluar");
        System.out.print("  Pilih: ");
        int pilihMenu = sc.nextInt();
        System.out.println("+=========================================================+");
        System.out.println("");
        switch (pilihMenu) {
            case 1:
                data.tampilRekening();
                menu();
                break;
            case 2:
                data.tampilTransaksi();
                menu();
                break;
            case 3:
                System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
                System.out.println("+                              MENCARI DATA SALDO DI ATAS 500K                                    +");
                data.FindSeqSearch(500000);
                menu();
                break;
            case 4:
                findDataNoRekening();
                menu();
                break;
            case 5:
                boolean bool = sortingName();
                System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
                System.out.println("                    MENGURUTKAN DATA BERDASARKAN NAMA DENGAN SORT BY " + (bool == true ? "DESCENDING" : "ASCENDING"));

                data.sorting(bool);
                data.tampilRekening();
                menu();
                break;
            case 6:
                break;
            default:
                System.out.println("Opsi tidak ada!");
                break;
        }
    }

    static void dataRekening() {
        Rekening m1 = new Rekening("160309273084", "bin Abdul Salam", "Aruffi", "14582643263", "ligula.Nullam@tacitisociosqu.edu");
        Rekening m2 = new Rekening("169712042416", "Al Hafeezy", "Mohammad", "16834168323", "ut.pellentesque@luctusutpellentesque.com");
        Rekening m3 = new Rekening("161007278862", "bin Azzarudin", "Ehsan", "6505379", "Proin.eget@velitegestaslacinia.ca");
        Rekening m4 = new Rekening("161807297229", "Fadhullah", "Jeanne Roselia", "8638209", "Pellentesque.ut.ipsum@neque.ca");
        Rekening m5 = new Rekening("169503136823", "Nohara", "Shinnosuke", "5926919", "tellus.justo.sit@commodoauctor.net");
        Rekening m6 = new Rekening("168507083528", "Nohara", "Hiroshi\t", "11153397678", "dictum@nec.edu");
        Rekening m7 = new Rekening("160802059329", "Nohara", "Misae\t", "18917032664", "vel@ullamcorpermagna.co.uk");
        Rekening m8 = new Rekening("160806282695", "Nohara", "Himawari\t", "19786325110", "Aliquam.gravida@vestibulumMauris.net");
        Rekening m9 = new Rekening("161309092979", "Nobi", "Nobita\t", "8171766", "interdum.Curabitur.dictum@rutrumurna.edu");
        Rekening m10 = new Rekening("168902128688", "Takeshi", "Goda\t", "16754004501", "et.ultrices@a.co.uk");
        Rekening m11 = new Rekening("161410089963", "Kudo", "Shinichi\t", "5279085", "ut@aultriciesadipiscing.ca");
        Rekening m12 = new Rekening("165112227763", "Ai", "Haibara\t", "15644194285", "Proin.velit@Duisac.net");
        Rekening m13 = new Rekening("167206230943", "Mouri", "Ran\t", "9776690", "ac@nibhAliquamornare.com");
        Rekening m14 = new Rekening("167711267372", "Mouri", "Kogoro\t", "3535137", "cubilia.Curae.Phasellus@Duis.com");
        data.tambahRek(m1);
        data.tambahRek(m2);
        data.tambahRek(m3);
        data.tambahRek(m4);
        data.tambahRek(m5);
        data.tambahRek(m6);
        data.tambahRek(m7);
        data.tambahRek(m8);
        data.tambahRek(m9);
        data.tambahRek(m10);
        data.tambahRek(m11);
        data.tambahRek(m12);
        data.tambahRek(m13);
        data.tambahRek(m14);
    }

    static void dataTransaksi() {
        Transaksi n1 = new Transaksi(89821, 494048, 3587, "Deposit", "2021-03-09 07:54:42");
        Transaksi n2 = new Transaksi(770592, 334245, 444267, "Deposit", "2020-08-11 13:36:56");
        Transaksi n3 = new Transaksi(685302, 451002, 376442, "Deposit", "2020-05-23 07:34:53");
        Transaksi n4 = new Transaksi(297103, 396116, 779589, "Deposit", "2021-07-03 01:09:49");
        Transaksi n5 = new Transaksi(66190, 259150, 619774, "Deposit", "2021-09-09 03:57:30");
        Transaksi n6 = new Transaksi(234301, 278309, 547922, "Deposit", "2021-08-24 13:18:39");
        Transaksi n7 = new Transaksi(243306, 869468, 50283, "Deposit", "2021-03-12 03:40:16");
        Transaksi n8 = new Transaksi(371045, 991242, 602034, "Deposit", "2021-08-06 11:48:59");
        Transaksi n9 = new Transaksi(395170, 97058, 472273, "Deposit", "2021-05-02 10:53:31");
        Transaksi n10 = new Transaksi(862731, 561908, 109431, "Deposit", "2021-07-31 08:11:00");
        Transaksi n11 = new Transaksi(556798, 31387, 725426, "Deposit", "2021-03-27 06:18:20");
        Transaksi n12 = new Transaksi(873982, 896213, 846142, "Deposit", "2021-07-18 04:06:30");
        Transaksi n13 = new Transaksi(774247, 739406, 775848, "Deposit", "2020-10-24 01:39:00");
        Transaksi n14 = new Transaksi(66987, 823014, 868772, "Deposit", "2020-12-21 05:57:59");
        data.tambahTrans(n1);
        data.tambahTrans(n2);
        data.tambahTrans(n3);
        data.tambahTrans(n4);
        data.tambahTrans(n5);
        data.tambahTrans(n6);
        data.tambahTrans(n7);
        data.tambahTrans(n8);
        data.tambahTrans(n9);
        data.tambahTrans(n10);
        data.tambahTrans(n11);
        data.tambahTrans(n12);
        data.tambahTrans(n13);
        data.tambahTrans(n14);
    }

    static void findDataNoRekening() {
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        System.out.println("                                 Searching Berdasaran No Rekening");
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        System.out.print("+ Masukkan No Rekening : ");
        sc.nextLine();
        String norek = sc.nextLine();
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        data.cek(norek);
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
    }

    static boolean sortingName() {
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Sorting By Name ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        boolean bool = false;
        System.out.println("Sort By : ");
        System.out.println("1. Descending");
        System.out.println("2. Ascending");
        System.out.print("Pilih : ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                bool = true;
                break;
            case 2:
                bool = false;
                break;
            default:
                System.out.println("Opsi Tidak ditemukan");
                sortingName();
        }
        return bool;
    }
}
