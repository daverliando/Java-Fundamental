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
public class F_ConditionalIf {

    public static void main(String[] args) {
        boolean isActive = true;
        float ipk = 3.9f;
        float durasiPendidikan = 4;

//        #1 if
        if (isActive) {
            System.out.println("Aktif");
        }
//        #2 if-else
        if (!isActive) {
            System.out.println("Tidak Aktif");
        } else {
            System.out.println("Aktif");
        }
//        #3 if-elseif-else
        if (ipk > 3.9) {
            System.out.println("Mendapatkan beasiswa 100%");
        } else if (ipk > 3.5) {
            System.out.println("Mendapatkan beasiswa 80%");
        } else {
            System.out.println("Tidak mendapatkan beasiswa");
        }
//        #4 nestedIf
        if (durasiPendidikan < 4) {
            if (ipk > 3.9) {
                System.out.println("Lulus Cumlaude");
            } else if (ipk > 3.5) {
                System.out.println("Lulus berprestasi");
            }
        } else if (durasiPendidikan == 4) {
            System.out.println("Lulus Normal");
        } else {
            System.out.println("Lulus sedikit terlambat");
        }

    }
}
