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
public class Person {
    //Attribute dengan access modifier private
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;   //this.name -> mengacu pada Person.name
        this.age = age;
    }

    void perkenalkanDiri() {
        System.out.println("Hai nama saya : " + name);
        System.out.println("Umur saya     : " + age);
    }

    public String getName() { //mengambil nilai dengan method getter
        return name;
    }

    public void setName(String name) { //memberikan nilai dgn method setter
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
}
