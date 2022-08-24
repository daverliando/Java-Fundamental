/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.c_polymorphism;

/**
 *
 * @author DevidBa
 */
//Superclass
public class Person {
//    Attribute or Properties
    String name;
    int age;

//    Contructor 1 & 2 => Method Overloading
//    Perkenalkan Diri 1 & 2 => Method Overloading
//    Karakteristik 1 kelas sama, nama method sama, beda parameter input
    public Person() { //Contructor 1
        System.out.println("Create new object");
    }

    public Person(String name, int age) { // Contructor 2
        this.name = name;   //this.name -> mengacu pada Person.name
        this.age = age;
    }

    void perkenalkanDiri() { //Perkenalkan Diri 1
        System.out.println("Hai nama saya : " + name);
        System.out.println("Umur saya     : " + age);
    }

    void perkenalkanDiri(String name, int age) { //Perkenalkan Diri 2
        System.out.println("Hai nama saya : " + name);
        System.out.println("Umur saya     : " + age);
    }
}
