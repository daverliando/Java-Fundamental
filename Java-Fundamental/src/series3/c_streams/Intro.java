/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

/**
 *
 * @author DevidBa
 */
public class Intro {
    public static void main(String[] args) {
        //Immutable
        String nama = new String("Dev");
        nama = nama + " Erliando";  //re-assign
        
        //Mutable
        StringBuilder nama2 = new StringBuilder("Dev");
        nama2.append(" Erliando");  //
        
        System.out.println(nama);
        System.out.println(nama2);
    }
}
