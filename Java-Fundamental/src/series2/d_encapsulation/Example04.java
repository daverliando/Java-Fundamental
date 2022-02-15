/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.d_encapsulation;

import series2.c_polymorphism.*;
import series2.b_inheritance.*;
import series2.a_class_and_object.*;

/**
 *
 * @author DevidBa
 */
public class Example04 {
    public static void main(String[] args) {
//        new Person() -> proses create new object, call constructor()
        Person dev = new Person("Dev", 22);
        
//        Call toString method
        System.out.println(dev);
        dev.perkenalkanDiri();
        System.out.println("=============");
//=====================================================        
        Employee john = new Employee("14000", "Application Developer", 500, "John", 25);
       
//        Call toString method
        System.out.println(john);
//        Call subclass method -> overriding
        john.perkenalkanDiri();
        System.out.println("=============");
    }
}