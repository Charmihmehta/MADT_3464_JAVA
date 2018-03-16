/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Date;
import javaapplication3.college.Course;
import javaapplication3.college.Student;

/**
 *
 * @author macstudent
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student s = new Student();
        Course c1 = new Course("M-1", "Hindi", 70);
        Course c2 = new Course("M-2", "ENGLISH", 80);
        Course c3 = new Course("M-3", "Maths", 79);
        Course c4 = new Course("M-4", "Sci", 90);
        Course c5 = new Course("M-5", "SST", 69);

        Course courseArray[] = new Course[5];

        courseArray[0] = c1;
        courseArray[1] = c2;
        courseArray[2] = c3;
        courseArray[3] = c4;
        courseArray[4] = c5;

        s.setStudentId(1);
        s.setName("Charmi Mehta");
        s.setBirtdate(new Date());
        s.setCourseList(courseArray);
        s.calculateTotal();
        s.calculatePer();
        s.calculateResult();
        //System.out.println(s.toString());
        s.printStudentDetails();

    }

}
