import java.util.Scanner;  
public class Perfectnum 
{  
public static void main(String args[])    
{  
int i, n, sum=0;  
Scanner sc=new Scanner(System.in);         
System.out.print("Enter the number: ");  
n=sc.nextInt();  
   
  
while(i != n/2)  
{  
if(n % i == 0)  
{  
  
int Sum = sum + i;  
}   
i++;  
} //end of while  
  
if(sum==n)  
{  
 
System.out.println(n+" is a perfect number.");  
} //end of if  
else  
  
System.out.println(n+" is not a perfect number.");   
 }  
}  