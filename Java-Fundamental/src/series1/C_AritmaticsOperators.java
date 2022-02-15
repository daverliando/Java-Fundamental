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
public class C_AritmaticsOperators {

    public static void main(String[] args) {
        int x = 7;
        int y = 3;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        int angka3 = 5;
        System.out.println("Hasil Post Increment : " + angka3++); // Post-Increment
        angka3 = 5;
        System.out.println("Hasil Pre Increment : " + ++angka3); // Pre-Increment
        angka3 = 5;
        System.out.println("Hasil Post Decrement : " + angka3--); // Post-Decrement
        angka3 = 5;
        System.out.println("Hasil Pre Decrement : " + --angka3); // Pre-Increment

//        Bonus -> Assignment Operator
        x = 5;
        
        x += 2; // x = x+2
        System.out.println(x);
        x -= 2; // x = x-2
        System.out.println(x);
        x *= 2; // x = x*2
        System.out.println(x);
        x /= 2; // x = x/2
        System.out.println(x);
        x %= 2; // x = x%2
        System.out.println(x);
    }
}
