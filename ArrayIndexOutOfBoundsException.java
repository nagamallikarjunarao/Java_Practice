/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/
import java.util.Arrays;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
int[] myArray = {897, 56, 78, 90, 12, 123, 75};
      System.out.println("Elements in the array are:: ");
       System.out.println(Arrays.toString(myArray));
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the index of the required element ::");
      try {
         int element = sc.nextInt();
         System.out.println("Element in the given index is :: "+myArray[element]);
      } 
      catch(Exception e) {
         System.out.println("The index you have entered is invalid");
         System.out.println("Please enter an index number between 0 and 6");
      }
   }
}