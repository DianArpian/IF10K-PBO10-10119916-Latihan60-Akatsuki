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
public class PemimpinAkatsuki extends AsalAkatsuki{
     private String pemimpin;
    
    public PemimpinAkatsuki(String nama, String asal, String pasangan) {
        super(nama, asal, pasangan);
        this.nama=nama;
        this.asal=asal;
        this.pasangan=pasangan;
    }

    public String getPemimpin() {
        return pemimpin;
    }

    public void setPemimpin(String pemimpin) {
        this.pemimpin = pemimpin;
    }
    
}

