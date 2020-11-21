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
public class AsalAkatsuki {
    protected String nama;
    protected String asal;
    protected String pasangan;
    
    public AsalAkatsuki(String nama, String asal, String pasangan){
        this.nama=nama;
        this.asal=asal;
        this.pasangan=pasangan;
       }
    
    public void tampilAnggota(){
        System.out.println("Nama : "+nama);
        System.out.println("Asal : "+asal);
        System.out.println("pasangan : "+pasangan);
    } 
}
