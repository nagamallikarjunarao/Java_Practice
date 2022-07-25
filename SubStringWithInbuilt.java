/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;



//main method
 
//declare variables

//take input from user

//check if the string contains substring or not if contains print found else print not found





class SubStringWithInbuilt
  {
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
System.out.println("enter String");
     String str=sc.nextLine();
      System.out.println("Enter the word which you want to find");
      String word=sc.next();
      if(str.inbuilt(word))
      {
        System.out.println("Found");
      }
      else{
        System.out.println("not found");
      }
     
    }
  }

