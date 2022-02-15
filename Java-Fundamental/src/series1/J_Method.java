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
public class J_Method {
    //void method
    public static void perkenalkanDiri() {
        System.out.println("Hai saya Dev");
    }

    public static void perkenalkanDiri(String nama) {
        System.out.println("Hai saya : " + nama);
    }

    //non-void method
    public static int penjumlahan(int a, int b){
        return a+b;
    }
    
    public static float pembagian(float a, float b){
        return a/b;
    }
    public static void main(String[] args) {
        perkenalkanDiri();
        perkenalkanDiri("Devid Erliando");
        
//        #1.1
        System.out.println(penjumlahan(5, 2));
//        #1.2
        int result = penjumlahan(5, 3);
        System.out.println(result);
        
//        #2.1
        System.out.println(pembagian(5, 2));
//        #2.2
        float result2 = pembagian(5, 3);
        System.out.println(result2);
    }
}
