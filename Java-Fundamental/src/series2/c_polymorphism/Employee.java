/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.c_polymorphism;

import series2.b_inheritance.*;
import series2.entities.*;

/**
 *
 * @author DevidBa
 */
//Sub Class
public class Employee extends Person {

    String employeeId;
    String jobTitle;
    int salary;

    public Employee(String employeeId, String jobTitle, int salary, String name, int age) {
        super(name, age);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    
    //Method overriding, nama method, parameter dan return type pada subclass sama dengan superclass
    @Override
    void perkenalkanDiri(){
        //Call parent class or super class attribure
        System.out.println("Hai nama saya : "+ name);
        System.out.println("Umur saya     : "+ age);
        
        //Call child class or subclass attribure
        System.out.println("Employee Id   : "+ employeeId);
        System.out.println("Job Tile      : "+ jobTitle);
        System.out.println("Salary        : "+ salary);
    }
    
}
