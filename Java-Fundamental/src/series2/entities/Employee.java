/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series2.entities;

/**
 *
 * @author DevidBa
 */
public class Employee extends Person {

    private String employeeId;
    private String jobTitle;
    private int salary;

    public Employee() {
    }

    public Employee(String employeeId, String jobTitle, int salary) {
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String employeeId, String jobTitle, int salary, String name, int age) {
        super(name, age);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + 
                ", jobTitle=" + jobTitle + 
                ", salary=" + salary +
                ", name=" + super.getName() + 
                ", age=" + super.getAge() + 
                '}';
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
