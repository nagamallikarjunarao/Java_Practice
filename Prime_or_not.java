import java.util.*;
class Prime_or_not{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
  int num,count=0;
  System.out.println("Enter num");
  num=sc.nextInt();
  for(int i=1;i<=num;i++){
    if(num%i==0)
      count++;
  }
  if(count==2)
    System.out.println("Num is prime");
  else
  System.out.println("Num is not prime");
  
 }
}