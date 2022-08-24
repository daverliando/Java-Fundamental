/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.e_abstraction.abstracts;

/**
 *
 * @author DevidBa
 */

//Abstract Class -> Partial Abstraction, isinya bisa abstract method,
//bisa method biasa, bisa juga menampung attribute
public abstract class AbstractCalculator {
    int result;                             //attribute
    
    abstract int penjumlahan(int a, int b); //abstract method
    
    int pengurangan(int a, int b){          //method biasa
        result = a-b;
        return result;
    }
}
