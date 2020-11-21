/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119916.latihan60.akatsuki;

/**
 *
 * @author DIAN
 */
public class AnggotaAkatsuki extends AsalAkatsuki{
    private String anggota;
    
    public AnggotaAkatsuki(String nama, String asal, String pasangan) {
        super(nama, asal, pasangan);
        this.nama=nama;
        this.asal=asal;
        this.pasangan=pasangan;
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }
    
}
