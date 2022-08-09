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
public class Person{
    //Attribute dengan access modifier private
    private String name;
    private int age;

    public Person() {
        System.out.println("Create new object");
    }
    
    public Person(String name, int age) {
        this.name = name;   //this.name -> mengacu pada Person.name
        this.age = age;
    }
    
    void perkenalkanDiri(){
        System.out.println("Hai nama saya : "+ name);
        System.out.println("Umur saya     : "+ age);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    //akses get data menggunakan method getter
    public String getName() {
        return name;
    }

    //akses set data menggunakan method setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
