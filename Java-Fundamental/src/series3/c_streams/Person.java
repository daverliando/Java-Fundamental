/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

/**
 *
 * @author DevidBa
 */
public class Person {

    private String name, phone, city;
    private int age;

    public Person() {
    }

    public Person(String name, String phone, String city, int age) {
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", phone=" + phone + ", city=" + city + ", age=" + age + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
