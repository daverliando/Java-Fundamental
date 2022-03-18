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
public class H_LoopingFor {

    public static void main(String[] args) {
//        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
//        for (initialization; termination;
//                increment/decrement) {
//            statement(s)
//        }

//        #1 For Loop
        for (int i = 1; i < 10; i++) {
            System.out.println("Counter : " + i);
        }

//        #2 Enhanced For Loop
        int[] listAngka = {5, 2, 9, 12, 4};
        for (int i : listAngka) {
            System.out.println(i);
        }
    }
}
