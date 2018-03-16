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
public class Course {

    private String courseId;
    private String courseNm;
    private double marks;

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseNm=" + courseNm + ", marks=" + marks + '}';
    }

    public Course(String courseId, String courseNm, double marks) {
        this.courseId = courseId;
        this.courseNm = courseNm;
        this.marks = marks;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseNm() {
        return courseNm;
    }

    public void setCourseNm(String courseNm) {
        this.courseNm = courseNm;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

}
