/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author 62859
 */
public class  Admin extends user {
    public Admin(String nama) {
        super(nama);
    }
    public void tampilkanInfoKamar(Kamar kamar1, Kamar kamar2, Kamar kamar3, Kamar kamar4, Kamar kamar5) {
        System.out.println("=============== INFORMASI KAMAR ===============");
        kamar1.tampilkanDetail();
        kamar2.tampilkanDetail();
        kamar3.tampilkanDetail();
        kamar4.tampilkanDetail();
        kamar5.tampilkanDetail();
    }
    public void ubahStatusKetersediaan(Kamar kamar) {
        if (kamar.isTersedia()) {
            kamar.setTersedia(false);
            System.out.println("Kamar " + kamar.getNomorKamar() + " sekarang tidak tersedia.");
        } else {
            kamar.setTersedia(true);
            System.out.println("Kamar " + kamar.getNomorKamar() + " sekarang tersedia.");
        }
    }
}
