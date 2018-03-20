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
public interface iDisplay {
    
    public void display();
    default void print(){
        System.out.println("I am in print method of idisplay");
    }
    
}
