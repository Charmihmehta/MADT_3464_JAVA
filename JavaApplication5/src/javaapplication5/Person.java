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
public class Person implements iDisplay {
    
    private int id;
    private String name;
    private char gender;

    public Person() {
    }

    public Person(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
   public void display() {
        System.out.println("ID:" + this.id);
        System.out.println("Name:" + this.name);
        System.out.println("Gender:" + this.gender);
    }
    
    
    
}
