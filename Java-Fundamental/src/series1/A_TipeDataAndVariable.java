/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series1;

/**
 *
 * @author DevidBa
 */
public class A_TipeDataAndVariable {

    
    /**
     * Contoh tipe data int, float, boolean, String
     * Deklarasi variable
     * format : tipedata namaVariable
     * 
     * Inisialisasi
     * format : namaVariable = value;
     * 
     * Deklarasi + Inisialisasi
     * format : tipedata namaVariable = value;
     * @param args 
     */
    public static void main(String[] args) {        
//        variable = tampungan untuk menyimpan data yang dinamis (dapat berubah)
//        Deklarasi Variable
        int angka;
        float ipk;
        boolean isActive;
        String nama;
//        Inisialisasi
        angka = 96;
        ipk = 3.5f;
        isActive = true;
        nama = "Dev";        
//        Print
        System.out.println(angka);
        System.out.println(ipk);
        System.out.println(isActive);
        System.out.println(nama);
        
//        Deklarasi + Inisialisasi
        int angka2 = 96;
        float ipk2 = 3.5f;
        boolean isActive2 = false;
        String nama2 = "Dev";
//        Print
        System.out.println(angka2);
        System.out.println(ipk2);
        System.out.println(isActive2);
        System.out.println(nama2);
        
        nama2 = "Devid";
        System.out.println("Data yang sudah dirubah");
        System.out.println(nama2);
    }
}
