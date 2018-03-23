/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.IOException;
import java.io.InvalidObjectException;

/**
 *
 * @author macstudent
 */
public class javaExceptionHandling {

    public void Handling() {
        int a, b, c;
        a = 10;
        b = 0;
       
        int val[] = new int[5];
        try 
        {
           //  c = a / b;
           // System.out.println("value:  "+c);
           // System.out.println("value:  " +val[5]);
            testException();
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("arithmetic occur");
        }
        catch(ArrayIndexOutOfBoundsException ae) 
        {
            System.out.println("array index occur");
        }
        catch(Exception e1)
        {
             System.out.println("all exception occur");
        }
        finally
        {
            System.out.println("Finally will executed");
        }
        System.out.println("After arithmetic exception");
      
    }
    public static void testException() throws IOException
    {
        System.out.println("IOException throw");
        throw new InvalidObjectException("My throw exception");
    }
    
    

}
