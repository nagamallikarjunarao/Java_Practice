/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
public static void main(String args[]){
  int a,b;
/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
Scanner sc=new Scanner(System.in);
/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
 System.out.println("enter a,b values");
   int a=sc.nextInt();
   int b=sc.nextInt();
   System.out.println("enter c,d values");
   int c=sc.nextInt();
   int d=sc.nextInt();
   System.out.println("enter e,f values");
   int e=sc.nextInt();
   int f=sc.nextInt();
   System.out.println("enter g value");
   int g=sc.nextInt();
    System.out.println("enter h,i values");
   int h=sc.nextInt();
   int i=sc.nextInt();
  
//calculate difference,product,division,increment and remainder 
    int difference=a-b;
    int product=c*d;
    int division=e/f;
    int increment=++g;
    int decrement=g--;
    int remainder=h%i;
//print appropriate result for all operations
 System.out.println("difference of "+a+","+b+ " is "+difference);
    System.out.println("product of "+c+","+d+" is "+product);
    System.out.println("division of "+e+","+f+" is "+division);
    System.out.println("increment of "+g+" is "+increment);
    System.out.println("decrement of "+g+" is "+decrement);
    System.out.println("remainder of "+h+"," +i+" is "+remainder);
  }
    
    
    
}
