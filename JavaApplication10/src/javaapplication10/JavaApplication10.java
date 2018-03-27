
package javaapplication10;
/**
 * 
 * @author macstudent
 */
public class JavaApplication10 {

    public static void main(String[] args) {
       
        //wrapperClass();
        if(args.length == 2)
        {
            int a, b;
            a= Integer.parseInt(args[0]);
            b= Integer.parseInt(args[1]);
            
             int c = add(a,b);
             System.out.println("sum: " +c);
        }
       
    }
    /**
     * 
     * @throws NumberFormatException 
     */
    private static void wrapperClass() throws NumberFormatException {
        int a = 10;
        int b = Integer.max(10, 20);
        Integer c = Integer.max(13, 20);//AutoBoxing
        
        int d =c.intValue();
        c= a;
        int x = Integer.parseInt("100");
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(x);
    }
    /**
     * 
     * @param a is of type integer
     * @param b
     * @return 
     */
    public static int add(int a, int b)
    {
        return a+b;
    }
    
}
