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
public class I_LoopingWhile {
    public static void main(String[] args) {
//        #1 while-do
        int counter=0; //ganti dengan angka 10 atau 1
        while (counter<10) {            
//            System.out.println(counter);
//            counter++;
            
            System.out.println(counter++);
        }
        
//        #2 do-while
        counter = 10; //ganti dengan angka 10 atau 1
        do {
            System.out.println(counter++);
        } while (counter<10);
    }
}
