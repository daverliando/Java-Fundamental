/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.e_abstraction;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DevidBa
 */
public class Example01 {
//    3 Komponnen Abstraction
//    1. Abstraction (Abstract Class / Interface)
//    2. Implementation (extends / implements)
//    3. Instance -> Abstract obj = new Impl()
    
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        ImplCalulator impC1 = new ImplCalulator();        //Non Interface
        ImplCalulator2 impC2 = new ImplCalulator2();        //Non Interface
        
//        Interface obj = new ImplementClass();
        InterfaceCalculator ic = new ImplCalulator();   //Pengunaan Interface
        
//        Interface obj = new ImplementClass();
        AbstractCalculator ac = new ImplCalulator2();   //Penggunaan Abstract Class
        
    }
}
