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
        System.out.println("Counter : 1");
        System.out.println("Counter : 2");
        System.out.println("Counter : 3");
        System.out.println("Counter : 4");
        System.out.println("Counter : 5");
        System.out.println("Counter : 6");
        System.out.println("Counter : 7");
        System.out.println("Counter : 8");
        System.out.println("Counter : 9");

//        #1 while-do
        int counter=10;
        while (counter<10) {
            System.out.println("Counter : "+counter);
            counter++;
        }
        
//        #2 do-while
        counter = 10;
        do {
            System.out.println("Counter : "+counter);
            counter++;
        } while (counter<10);
    }
}
