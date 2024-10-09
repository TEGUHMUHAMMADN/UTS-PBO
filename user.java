/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author 62859
 */


public class user implements Info {
    private String nama;
    public user(String nama) {
        this.nama = nama;
    }
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
    }
    public String getNama() {
        return nama;
    }
}
