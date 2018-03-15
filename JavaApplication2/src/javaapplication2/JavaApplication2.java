/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author macstudent
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication2 j1 = new JavaApplication2();
        j1.pattern(4);
        JavaApplication2 j2 = new JavaApplication2();
        j2.newStarPattern(5);
        j2.main();
        double x = 1__000_0.0_0/1_00_000;
        System.out.println(x);
        
        String s1 = "Hello";
        String s2 = s1;
        String s3 = new String();
        s3="Hello";
        String s4= new String("Hello");
        if(s1.equals(s4)) //if(s1==s4) not equal
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    
        //int a[10]= {1,2,3,4,5,6,7,8,9,0,1}
           int a[] = {1,2,3};
           //int b[] = new int[3]{1,2,3};
           int []c = new int[]{1,2,3};
           int d[];
           d= new int[3];
           
           for(int i =0; i<3; i++)
           {
               System.out.println(c[i]);
           }
           
           
           
           Student std1 = new Student();
           
           
         
}
   public void pattern(int n)
    {
       
        for(int i =1 ; i<=n; i++)
        {
            //System.out.print(i);
            for(int j=1 ; j<=i ; j++)
            {
              // for(int k =1 ; k<=j ; k++ )
                 System.out.print(j);
                 
                
            }
            System.out.println(); 
        }
        System.out.println();
    } 
   
    public void starPattern(int n)
    {
       
        for(int i =1 ; i<=n; i++)
        {
            //System.out.print(i);
            for(int j=1 ; j<=i ; j++)
            {
              // for(int k =1 ; k<=j ; k++ )
                 System.out.print("*");
                 
   
            }
            System.out.println(); 
        }
        System.out.println();
    } 
    
     public void newStarPattern(int n)
    {
       
        for(int i =1 ; i<=n; i++)
        {
            
            for(int j=1 ; j<=n-i ; j++)
            {
                System.out.print("  ");
            }
            for(int k =1 ; k<=i ; k++ )
            {
                System.out.print("*   ");
            }
                System.out.println(); 
        }
           
    }
      
     public static void main()
    {
        System.out.println("hello world");
    }

    
} 


 
