/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author macstudent
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println("Welcome to Java");
        
        int a = 100;
        int b = 20;
       
        String str = "Welcome to Java"; 
       
        System.out.println(a + "+" +b + "="+(a+b));
        System.out.println(a + "-" +b + "="+(a-b));
        System.out.println(a + "/" +b + "="+(a/b));
        System.out.println(a + "*" +b + "="+(a*b));
        System.out.println(a + "%" +b + "="+(a%b));
        System.out.println(str);
        
      Arithematic j1 = new Arithematic();
        j1.add(a, b);
        j1.mul(a, b);
        j1.div(a, b);
        j1.mod(a, b);
        j1.sub(a, b);
        
        
        
        Student s1 = new Student();
        s1.setDetail(1, "student-1",  2.9f);
        s1.getDetail();
       
        
        Student s2 = new Student();
         
        s2.setDetail(1, "student-2",  10.8f);
        
        s2.getDetail();
        
        Student s3 = new Student();
        s3.setDetail(1, "student-3",  88.9f);
        s3.getDetail();
        
         for(int i =0 ; i < 11 ; i++)
        {
            System.out.println(s1.getName());
        }
    }
    
    
   
    
}
