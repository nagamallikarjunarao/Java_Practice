 import java.util.Scanner;

public class Max_three_num  
{  
    public static void main(String args[])  
    {  
        int a=160;
      int b=-50;
      int c=200;

      
      
      if (a >= b && a >= c)
        //print the maximum of three numbers 
         System.out.println( a + " is the maximum number.");
      else if (b >= a && b >= c)
         System.out.println( b + " is the maximum number.");
      else
         System.out.println( c + " is the maximum number.");
         
    }  
}  