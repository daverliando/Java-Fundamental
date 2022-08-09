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
//Superclass
public class Employee extends Person {

    private String employeeId;
    private String jobTitle;
    private int salary;

    public Employee(String employeeId, String jobTitle, int salary, String name, int age) {
        super(name, age);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //Method overriding, nama method, parameter dan return type pada subclass sama dengan superclass
    void perkenalkanDiri() {
        //Call parent class or super class attribure
        System.out.println("Hai nama saya : " + super.getName());
        System.out.println("Umur saya     : " + super.getAge());

        //Call child class or subclass attribure
        System.out.println("Employee Id   : " + employeeId);
        System.out.println("Job Tile      : " + jobTitle);
        System.out.println("Salary        : " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", jobTitle=" + jobTitle + ", salary=" + salary + '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
