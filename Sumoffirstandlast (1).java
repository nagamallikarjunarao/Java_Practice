//Write a JAVA program to find sum of first and last digit of a number.
import java.util.*;
class Sumoffirstandlast{
  public static void main(String args[]){
    int n, sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    n=sc.nextInt();
    int lastdigit=n%10;
    while(n>10){
      n=n/10;
    }
    sum=lastdigit+n;
    System.out.println("sum of first digit and last digit of given number is "+ sum);
  }
}