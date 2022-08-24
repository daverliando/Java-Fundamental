/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.d_encapsulation;

/**
 *
 * @author DevidBa
 */
public class Example04 {

    public static void main(String[] args) {
//        new Person() -> proses create new object, call constructor()
        Person dev = new Person("Dev", 22);

//        Cara lama sudah tidak bisa karena ada private access modifier
//        dev.name = "Dev";
//        dev.age = 19;
//        System.out.println(dev.name);
//        System.out.println(dev.age);
        dev.setAge(19);
        dev.setName("Dev");

        System.out.println("Hallo nama saya : " + dev.getName());
        System.out.println("Hallo umur saya : " + dev.getAge());

        System.out.println("=============");
    }
}
