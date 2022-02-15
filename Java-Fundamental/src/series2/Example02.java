/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2;

/**
 *
 * @author DevidBa
 */
class Mahasiswa {

    static String nama, nim, jurusan;

    static void perkenalan() {
        System.out.println("Hallo nama saya : " + nama);
    }
}

public class Example02 {

    public static void main(String[] args) {
        Mahasiswa aldo = new Mahasiswa();
        aldo.nama = "aldo";
        aldo.perkenalan();
        
        Mahasiswa harbi = new Mahasiswa();
        harbi.nama = "harbi";
        harbi.perkenalan();
//        aldo.perkenalan();

//        Mahasiswa.nama = "aldo";
//        Mahasiswa.perkenalan();
    }
}
