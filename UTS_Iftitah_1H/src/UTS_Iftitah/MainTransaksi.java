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

    public static void main(String[] abcd) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+************************ PERBANKAN -UTS ************************+");
        System.out.println("  1. Tampil Data Rekening");
        System.out.println("  2. Tampil Data Transaksi");
        System.out.println("  3. Mencari saldo > 500000");
        System.out.println("  4. Sorting by name");
        System.out.println("  5. Keluar");
        System.out.print("  Pilih: ");
        int pilihMenu = sc.nextInt();
        System.out.println("+****************************************************************+");
        System.out.println("");
        if (pilihMenu == 1) {
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~ Tampil Data Rekening ~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            RekeningService list = new RekeningService();
            Rekening m1 = new Rekening();
            Rekening m2 = new Rekening();
            Rekening m3 = new Rekening();
            Rekening m4 = new Rekening();
            Rekening m5 = new Rekening();

            m1.Rekening("160309273084","Aruffin","bin Abdul Salam","14582643263","ligula.Nullam@tacitisociosqu.edu");
            m2.Rekening("169712042416","Mohammad","Al Hafeezy","16834168323","ut.pellentesque@luctusutpellentesque.com");
            m3.Rekening("161007278862","bin Azzarudin","Ehsan","6505379","Proin.eget@velitegestaslacinia.ca");
            m4.Rekening("161807297229","Fadhullah","Jeanne Roselia","8638209","Pellentesque.ut.ipsum@neque.ca");
            m5.Rekening("169503136823","Nohara","Shinnosuke","5926919","tellus.justo.sit@commodoauctor.net");

            list.tambah(m1);
            list.tambah(m2);
            list.tambah(m3);
            list.tambah(m4);
            list.tambah(m5);
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        } else if (pilihMenu == 2) {
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~ Tampil Data Transaksi ~~~~~~~~~~~~~~~~~~~~~~~~~~+");

            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("");
        } else if (pilihMenu == 3) {
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~ Mencari Saldo > 500000 ~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.print(" Input Nominal      : Rp ");

            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("");
        } else if (pilihMenu == 4) {
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Sorting By Name ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.print(" Input Nominal      : Rp ");

            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("");
        }
    }
}
