/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.e_abstraction;

import series2.e_abstraction.abstracts.ImplCalculatorAbs;
import series2.e_abstraction.abstracts.AbstractCalculator;
import series2.e_abstraction.interfaces.ImplCalculator;
import series2.e_abstraction.interfaces.InterfaceCalculator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DevidBa
 */
public class Example05 {
//    3 Komponnen Abstraction
//    1. Abstraction (Abstract Class / Interface)
//    2. Implementation (extends / implements)
//    3. Instance -> Abstract obj = new Impl()
    
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new LinkedList<>();
        
        ImplCalculator impC1 = new ImplCalculator();        //Non Interface
        ImplCalculatorAbs impC2 = new ImplCalculatorAbs();        //Non Interface
        
//        Interface obj = new ImplementClass();
        InterfaceCalculator ic = new ImplCalculator();   //Pengunaan Interface
        
//        Interface obj = new ImplementClass();
        AbstractCalculator ac = new ImplCalculatorAbs();   //Penggunaan Abstract Class
        
    }
}
