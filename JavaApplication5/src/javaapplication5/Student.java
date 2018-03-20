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
public class Student extends Person{
    
    private String course;
    private int acad_year;
    private int total_credit;
    private String result;

    public Student() {
        super();
    }

    public Student(String course, int acad_year, int total_credit, String result, int id, String name, char gender) {
        super(id, name, gender);
        this.course = course;
        this.acad_year = acad_year;
        this.total_credit = total_credit;
        this.result = result;
    }

    
    public Student(int id, String name, char gender) {
        super(id, name, gender);
    }

    

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAcad_year() {
        return acad_year;
    }

    public void setAcad_year(int acad_year) {
        this.acad_year = acad_year;
    }

    public int getTotal_credit() {
        return total_credit;
    }

    public void setTotal_credit(int total_credit) {
        this.total_credit = total_credit;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Academic year: "+ this.acad_year);
        System.out.println("Course Name: "+ this.course);
        System.out.println("Total Credit: "+ this.total_credit);
        System.out.println("Result: "+ this.result);  
    }
    
    
}
