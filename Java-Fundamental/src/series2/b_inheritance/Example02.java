/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.b_inheritance;

/**
 *
 * @author DevidBa
 */
public class Example02 {
    public static void main(String[] args) {
        Person dev = new Person();
        dev.name = "Dev";
        dev.age = 19;
        System.out.println("Hai nama saya : "+dev.name);
        System.out.println("Hai umur saya : "+dev.age);
       
        Person dev2 = new Person("Dev2", 21);
        dev2.perkenalkanDiri();
        
        System.out.println("=========================");
//=====================================================        
        System.out.println("INHERITANCE");
        Employee john = new Employee("14000", "Application Developer", 500, "John", 25);
        john.name = "John"; //super class attribute (Person.name)
        john.age = 29;      //super class attribute (Person.age)
        john.employeeId = "10729"; //sub class attribute
        john.jobTitle = "IT_PROG"; //sub class attribute
        john.salary = 5500;        //sub class attribute
        
        
        System.out.println("John = Person");
//        Call superclass method
        john.perkenalkanDiri();
        System.out.println("=========================");
        
        System.out.println("John = Employee");
//        Call subclass method
        john.perkenalkanDiriEmployee();
    }
}