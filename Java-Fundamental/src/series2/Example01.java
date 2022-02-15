/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2;

import series2.entities.Employee;
import series2.entities.Person;

/**
 *
 * @author DevidBa
 */

//        Ctrl + Shift + I = Rapikan import
//        Ctrl + Shift + C = Comment
//        Ctrl + Shift + arrow down/up = Copy
//        Alt + Shift + F  = Format
//        Alt + Shift + arrow down/up  = Move
//        Alt + Shift + arrow right/left  = Block

public class Example01 {

    public static void main(String[] args) {
        Person dev = new Person();
        dev.setName("Dev");
        dev.setAge(22);
        System.out.println(dev);

        Person dev2 = new Person("Dev", 22);
        System.out.println(dev2);

//=============================================        
        Employee emp1 = new Employee();
//        Subclass attribute
        emp1.setEmployeeId("14045");
        emp1.setJobTitle("IT Trainer");
        emp1.setSalary(500);
//        Super class attribute
        emp1.setName("Dev");
        emp1.setAge(22);
        System.out.println(emp1);

        Employee emp2 = new Employee("14022", "Jagonya Ayam", 200, "KFC", 25);
        Person emp3 = new Employee("14045", "Jagonya Burger", 100, "McD", 30);

        System.out.println(emp2);
        System.out.println(emp3);
    }
}
