/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author 62859
 */

public class Kamar {
    private String nomorKamar;
    private String tipeKamar;
    private boolean tersedia;
    private double harga;  
    public Kamar(String nomorKamar, String tipeKamar, boolean tersedia, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.tersedia = tersedia;
        this.harga = harga; 
    }
    public void tampilkanDetail() {
        System.out.println("--------------------------------------------");
        System.out.println(" Nomor Kamar  : " + nomorKamar);
        System.out.println(" Tipe Kamar   : " + tipeKamar);
        System.out.println(" Tersedia     : " + (tersedia ? "Ya" : "Tidak"));
        System.out.println(" Harga        : Rp" + harga);
        System.out.println("--------------------------------------------");
    }
    public double getHarga() {
        return harga;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
    public String getNomorKamar() {
        return nomorKamar;
    }
}

