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
//        [Alt 1] set data to object
        dev.name = "Dev";
        dev.age = 22;
//        get data
        System.out.println(dev.name + " "+dev.age);
//        call method
        dev.perkenalkanDiri();
//=====================================================        
//        [Alt 2] set data with constructor
        Person john = new Person("john", 25);
       
//        get data
        System.out.println(john.name + " "+john.age);

//        call method
        john.perkenalkanDiri();
    }
}