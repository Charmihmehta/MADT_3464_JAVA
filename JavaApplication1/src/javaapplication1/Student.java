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
public class Student {
    
    private int sid;
    private String name;
    private float total;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
    public void getDetail()
    {
         System.out.println("Id:" + sid);
         System.out.println("Name:" + name);
         System.out.println("Total:" + total);
    }
    
    public void setDetail(int sid, String name, float total)
    {
        this.sid = sid;
        this.name = name;
        this.total = total;
                
    }
}
