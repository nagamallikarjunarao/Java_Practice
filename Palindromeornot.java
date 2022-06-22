import java.util.*;

class Palindromeornot
{
    public static void main (String[] args)
    {
      int num=0,r,sum=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
             num = sc.nextInt();
      r=num;
      while(num>0){
        r=num%10;
       int sun=(sum*10)+r;
        num=num/10;
      }
      if(r==sum)
        System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");   
      
      
    }
}