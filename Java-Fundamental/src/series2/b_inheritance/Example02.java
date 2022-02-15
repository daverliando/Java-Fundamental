/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.b_inheritance;

import series2.a_class_and_object.*;

/**
 *
 * @author DevidBa
 */
public class Example02 {
    public static void main(String[] args) {
//        new Person() -> proses create new object, call constructor()
        Person dev = new Person("Dev", 22);
        
        dev.perkenalkanDiri();
        System.out.println("=============");
//=====================================================        
        Employee john = new Employee("14000", "Application Developer", 500, "John", 25);
       
//        Call superclass method
        john.perkenalkanDiri();
        System.out.println("=============");
//        Call subclass method
        john.perkenalkanDiriEmployee();
    }
}