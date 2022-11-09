import java.util.*;
class SalaryExpense1
  {
    public int savings(int sal[],int exp[])
    {
      int sav[]=new int[sal.length];
      int max=sav[0];
      for(int i=0;i<sal.length;i++)
        {
          sav[i]=sal[i]-exp[i];
          if(sav[i]>max)
          {
            max=sav[i];
          }
        }
      return max;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[3];
      int b[]=new int[3];
      System.out.println("Enter salaries:");
  
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter Expenses:");
      
      for(int i=0;i<b.length;i++)
        {
          b[i]=sc.nextInt();
        }
    
      SalaryExpense1 obj=new SalaryExpense1();
      int max=obj.savings(a,b);
      System.out.println("Maximum Saving is ="+max);
    }
  }