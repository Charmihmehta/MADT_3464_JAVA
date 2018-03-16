/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.college;

/**
 *
 * @author macstudent
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author moxdroid
 */
public class Student {

    private int studentId;
    private String name;
    private Date birtdate;
    private Course courseList[];
    private double total;
    private String result;
    private double per;

    public Student(int studentId, String name, Date birtdate, Course[] courseList) {
        this.studentId = studentId;
        this.name = name;
        this.birtdate = birtdate;
        this.courseList = courseList;
    }

    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirtdate() {
        return birtdate;
    }

    public void setBirtdate(Date birtdate) {
        this.birtdate = birtdate;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    public void setCourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    public double getTotal() {
        return total;
    }

    public String getResult() {
        return result;
    }

    public double getPer() {
        return per;
    }

    public void calculateTotal() {
        this.total = 0;
        for (int i = 0; i < courseList.length; i++) {
            this.total = this.total + this.courseList[i].getMarks();
        }

        /* for(Course c: courseList)
        {
            this.total = this.total + c.getMarks();
        } */
    }

    public void calculatePer() {
        this.per = this.total / this.courseList.length;
    }

    public void calculateResult() {
        this.result = "PASS";
    }

    @Override
    public String toString() {
        String s = "Student{" + "studentId=" + studentId + ", name=" + name + ", birtdate=" + birtdate + ",  total=" + total + ", result=" + result + ", per=" + per + '}';

        for (Course c : courseList) {
            s = s + c.toString() + "\n";
        }
        return s;
    }
    
    // Date formatter Function
    String date;
    public void dateFormatter()
    {
        
        //Date today = new Date();
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        date = DATE_FORMAT.format(this.birtdate);
       // System.out.println("Student name is : " +  date);
        
    
    }
    public void printStudentDetails() 
    {
        System.out.println("Student id is " + this.studentId);
        System.out.println("Student name is " + this.name);
        dateFormatter();
        System.out.println("Student name is : " +  date);
        calculateTotal();
        System.out.println("Student Marks total is " + this.total);
        calculatePer();
        System.out.println("Student Percentage is " + this.per);
        calculateResult();
        System.out.println("Student Result is " + this.result);
    }

}
