// Write a JAVA program to enter a number and print its reverse.
import java.util.Scanner;
class Reverse
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      int rem=0;
      int reverse=0;
      while(num!=0)
        {
          rem = num%10;
          reverse = reverse*10 +rem;
          num = num/10;
        }
      System.out.print("The reverse of the number is "+reverse);
    }
  }