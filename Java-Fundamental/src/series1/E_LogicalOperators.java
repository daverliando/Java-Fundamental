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
public class E_LogicalOperators {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
        
        
        int x = 7;
        int y = 3;
        
        boolean myCondition = x==y && true;
        System.out.println(myCondition);
        
        myCondition = x==y && false;
        System.out.println(myCondition);
        
        myCondition = !(x==y);
        System.out.println(myCondition);
    }
}
