/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.e_abstraction.interfaces;

/**
 *
 * @author DevidBa
 */
public class ImplCalculator2 implements InterfaceCalculator{

    @Override
    public int penjumlahan(int a, int b) {
        int c = a+b;
        return c;
    }
    
}
