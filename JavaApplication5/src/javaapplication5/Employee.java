/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author macstudent
 */
public class Employee extends Person{
    
    private String dept;
    private double salary;
    private String designation;
    private String manager_name;

    public Employee(String dept, double salary, String designation, String manager_name, int id, String name, char gender) {
        super(id, name, gender);
        this.dept = dept;
        this.salary = salary;
        this.designation = designation;
        this.manager_name = manager_name;
    }
    

    public Employee(int id, String name, char gender) {
        super(id, name, gender);
    }

    public Employee() {
        super();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    @Override
    public void print() {
        super.print(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
