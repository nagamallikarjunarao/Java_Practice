import java.util.Scanner;
public class Amstrongrange {
   public static void main(String args[]){
      int n,a, b,temp=0, rem, sum = 0,count=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number ::");
      a = sc.nextInt();
      System.out.println("Enter the second number ::");
      b = sc.nextInt();

      for (int i = a; i<b; i++){
          count=0;
          temp = i;
         while(temp> 0) {
           temp = temp/ 10;
           count ++;
         }
        n=i;
        sum=0;
       while(n> 0) {
         rem=n%10;
         sum+=Math.pow(rem,count);
         n=n/10;
       }
        
         if(sum == i){
            System.out.println(i+" is an Armstrong number.");
         }
      }
   }
}