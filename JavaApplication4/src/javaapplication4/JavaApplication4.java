/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.ArrayList;
/**
 *
 * @author macstudent
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String str1 = "Hello world";
        String str2 = new String("lambton College");
        String str3 = "";
        String str4 = "null"; // null

        str1 = str1.toUpperCase();
        System.out.println(str1.indexOf("ELLO"));
        System.out.println(str1.contains("ELLO"));
        System.out.println(str1.isEmpty());
        System.out.println(str3.isEmpty());
        if (str4 != null && str4.isEmpty() && str4.length() != 0 && !str4.isEmpty()) {
            System.out.println("A" + str4);
        }
//         if( str4.isEmpty() && str4.length() != 0 && !str4.isEmpty() && str4 != null)
//         {    
//          System.out.println(str4);
//         }

        System.out.println(str1.substring(0));
        String findStr = "College";
        if (str2.contains(findStr))
        {
               int index = str2.indexOf(findStr);
                System.out.println(index);
                String newstr = str2.substring(index, index + findStr.length());
                System.out.println(newstr);
        }
        
        StringBuilder sb = new StringBuilder("1-start");
        System.out.println(sb);
        sb.append("2- toronto");
        sb.reverse();
        
        System.out.println(sb);
        sb.append("3- lambton");
        
        String str5 = sb.toString();
        System.out.println(str5);
        str5.concat("4-hello");
        System.out.println(str5);
        System.out.println(sb);
        
         JavaApplication4 j1 = new JavaApplication4();
        j1.matrix(5);
        
        JavaApplication4 j2 = new JavaApplication4();
        j2.arrayListExample();
    }
    
    public void matrix(int n)
    {
        
        int a[][] = new int[n][n];
        int count = 1;
        int i,j;
        i=j=0;
        int start =0;
        int n1 = n;
        
      while(count<=n1*n1)
      {
        for(i=j= start; j< n; a[i][j] = count++, j++);
        for(i++,j--;i<n;a[i][j]= count++, i++);
        for(i--,j--; j>=start;a[i][j] = count++, j--);
        for(i--,j++; i>start; a[i][j] = count++, i--);
        start++;
        n--;
        
       
        
      }  
       for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }
    
    }
    
    private static void arrayListExample()
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("London");
        String index = arrayList.get(2);
        System.out.println(index.toString());
        for(String a: arrayList)
        {
            System.out.println(a);
        }
    }

}
