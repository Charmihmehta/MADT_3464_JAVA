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
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("******Student1*********");
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("XYZ");
        s1.setAcad_year(2018);
        s1.setCourse("MOBT");
        s1.setGender('F');
        s1.setResult("Fail");
        s1.setTotal_credit(6);
        s1.display();
        
        System.out.println("******employee1*********");
        Employee e1 = new Employee();
        
        System.out.println("******Student2*********");
        Student s2 = new Student(2, "Charmi", 'F');
        s2.setAcad_year(2018);
        s2.setCourse("MAAT");
        s2.setResult("Pass");
        s2.setTotal_credit(5);
        s2.display();
        System.out.println("******Student3*********");
        Student s3 = new Student("MADT", 2018, 5, "Pass", 3, "vidhi", 'F');
        s2.display();
        
        System.out.println("******refstudent-1*********");
        //runtime reference
        iDisplay base;
        base = s1;
        base.display();
        System.out.println("******refemp-1*********");
        base =e1;
        base.display();
        if(base instanceof Student)
        {    System.out.println("******Studentrun time reference*********"); 
            base = (Student)s1;
            base.display();
        }
        else if (base instanceof Employee)
        {
            System.out.println("*****Employee runtime instance");
            base = (Employee)e1;
            base.display();
        }
    }
}
