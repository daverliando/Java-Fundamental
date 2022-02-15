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
