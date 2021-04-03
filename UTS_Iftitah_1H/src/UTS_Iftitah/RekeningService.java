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
    Rekening[][] rek = new Rekening[14][5];
    int idx = 0;

    void tambah(Rekening m) {

        if (idx < rek.length) {
            Rekening[idx] = m ;
            idx++;
            System.out.println("Tiket ke- "+ idx + " masih tersedia");
        } else {
            System.out.println("Tiket Sudah Penuh, Coba Kembali Nanti!");
            System.out.println("======================================================");
        }
    }
    
}
