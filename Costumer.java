/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author 62859
 */
public class Costumer extends user {
   private String tanggalPesan;
    private String tanggalCheckOut;
    private Kamar kamarYangDipesan; 
    public Costumer(String nama, String tanggalPesan) {
        super(nama);
        this.tanggalPesan = tanggalPesan;
    }
    public void checkIn(Kamar kamar) {
        if (kamar.isTersedia()) {
            this.kamarYangDipesan = kamar;  
            kamar.setTersedia(false);
            System.out.println("--------------------------------------------");
            System.out.println(" Kamar " + kamar.getNomorKamar() + " berhasil dipesan oleh " + getNama());
            System.out.println("--------------------------------------------");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }
    public void checkOut(String tanggalCheckOut) {
        this.tanggalCheckOut = tanggalCheckOut;
        System.out.println("Check-out pada tanggal: " + tanggalCheckOut);
    }
    public void tampilkanInfo() {
        System.out.println("=============================================");
        System.out.println("         INFORMASI Pemesanan ");
        System.out.println("=============================================");
        System.out.println("Nama               : " + getNama());
        System.out.println("Tanggal Pemesanan  : " + tanggalPesan);
        System.out.println("Tanggal Check-out  : " + (tanggalCheckOut != null ? tanggalCheckOut : "Belum check-out"));
        if (kamarYangDipesan != null) {
            System.out.println("Nomor Kamar        : " + kamarYangDipesan.getNomorKamar());
            System.out.println("Harga Kamar        : Rp" + kamarYangDipesan.getHarga());  
        } else {
            System.out.println("Kamar              : Belum memesan kamar.");
        }
        System.out.println("=============================================");
    }
}

