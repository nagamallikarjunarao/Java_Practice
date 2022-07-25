/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

//main method
public static void main(String args[]) {

//declare varible
 String str, rev = "";
      
//take input from user
Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
      str = sc.nextLine();
   int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- ){
         rev = rev + str.charAt(i);
      }
/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/

  if (str.equals(rev)){
         System.out.println(str+" is a palindrome");
  }
      else {
        System.out.println(str+" is not a palindrome");
      }
}
}