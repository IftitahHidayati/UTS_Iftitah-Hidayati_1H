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
public class Rekening {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;
    
    void Rekening(String a, String b, String c, String d, String e){
        this.noRekening = a;
        this.nama = b;
        this.namaIbu = c;
        this.phone = d;
        this.email = e;
    }
    void TampilRek(){
        System.out.println("No Rekening\t : " + noRekening);
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Nama Ibu\t    : " + namaIbu);
        System.out.println("Phone\t\t : " + phone);
        System.out.println("Email\t\t " + email);
    }
}
