/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.a_class_and_object;

/**
 *
 * @author DevidBa
 */
public class Example01 {
    public static void main(String[] args) {
//        new Person() -> proses create new object, call constructor()
        Person dev = new Person();
        dev.name = "Dev";
        dev.age = 22;
        
        dev.perkenalkanDiri();
//=====================================================        
        Person john = new Person("john", 25);
       
        john.perkenalkanDiri();
    }
}