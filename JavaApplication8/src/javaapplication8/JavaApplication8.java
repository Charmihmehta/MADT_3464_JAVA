/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author macstudent
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication8 j1 = new JavaApplication8();
        j1.phoneNumberValidation();
        j1.emailValidation();
        j1.passwordValidation();
        j1.creditCardNumberValidation();
        
        javaExceptionHandling j2 = new javaExceptionHandling();
        j2.Handling();
    }

    public void phoneNumberValidation() {
        String pattern = "^(\\d){10}$";
        String command = "0123456789";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(command);
        if (m.find()) {
            System.out.println("Matched");
        } else {
            System.out.println("Not matched");
        }

    }

    public void emailValidation() {
        String pattern = "^[A-za-z0-9.]+@[A-za-z]+\\.[a-zA-z]{2,3}$";
        String command = "charmi.mehta15@gmail.ca";
        //String command = "c0713149@mylambton.ca";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(command);
        if (m.find()) {
            System.out.println("Matched");
        } else {
            System.out.println("Not matched");
        }

    }

    public void passwordValidation() {
        String pattern = "^[A-Za-z0-9#$]{8,16}$";
        String command = "012$#asderk";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(command);
        if (m.find()) {
            System.out.println("Matched");
        } else {
            System.out.println("Not matched");
        }

    }

    public void creditCardNumberValidation() {
        String pattern = "^(\\d){16}$";
        // String pattern ="^([A-Z]{1}[\\d]{3})\\s([a-z]{1}[a-zA-Z0-9]{5})\\s([A-Z]{1}[\\d]{3}[a-zA-Z]{3})$";
        //String command ="A123 aa2345 B123abc";
        String command = "1234567890123456";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(command);
        if (m.find()) {
            System.out.println("Matched");
        } else {
            System.out.println("Not matched");
        }

    }
   
}
