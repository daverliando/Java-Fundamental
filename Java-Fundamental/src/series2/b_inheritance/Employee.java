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
//Person -> Superclass
//Employee -> Sub Class
public class Employee extends Person {

    String employeeId;
    String jobTitle;
    int salary;

    public Employee(String employeeId, String jobTitle, int salary, String name, int age) {
//        [Alt 1] : set parent attribute 
        super.age = age;
        super.name = name;
        
//        [Alt 2] : call parent constructor
//        super(name, age);
        
        
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    
    void perkenalkanDiriEmployee(){
//        [Alt 1] Call parent class or super class attribure
        System.out.println("Hai nama saya : "+ name);
        System.out.println("Umur saya     : "+ age);
        
//        [Alt 2]Call parent method
//        super.perkenalkanDiri();
        
        //Call child class or subclass attribure
        System.out.println("Employee Id   : "+ employeeId);
        System.out.println("Job Tile      : "+ jobTitle);
        System.out.println("Salary        : "+ salary);
    }
    
}
