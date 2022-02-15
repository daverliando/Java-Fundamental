/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.b_inheritance;

import series2.entities.*;

/**
 *
 * @author DevidBa
 */
public class Person{
    //Attribute or Properties
    String name;
    int age;

    public Person() {
        System.out.println("Create new object");
    }
    
    public Person(String name, int age) {
        this.name = name;   //this.name -> mengacu pada Person.name
        this.age = age;
    }

    //Behaviour or Method
    void perkenalkanDiri(){
        System.out.println("Hai nama saya : "+ name);
        System.out.println("Umur saya     : "+ age);
    }
}
