/*Jagadish- 90000  34000 --savings
Vamsi - 120000   78000  --savings
Subhash
WAP read 6 values  from user,
first 3 values are salaries of J,V,S and next 3 values are expences of J,V,S*/

import java.util.*;
class Savings
  {
    public  int maxsavings(int sal[], int exp[])
    {
      int sav[]=new int[3];
      for(int i=0;i<sav.length;i++)
        {
          sav[i]=sal[i]-exp[i];
        }
      int maxSav=sav[0];
      for(int i=0;i<sav.length;i++)
        {
         if(maxSav<sav[i])
          {
            maxSav=sav[i];
          }
        }
      return maxSav;
    }
    public static void main(String args[])
    {
      int sal,exp;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Salaries:");
      int a[]=new int[3];
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter expenses");
      int b[]=new int[3];
      for(int i=0;i<b.length;i++)
        {
          b[i]=sc.nextInt();
        }
      Savings obj=new Savings();
      int max=obj.maxsavings(a,b);
      System.out.println("Maximum Saving is ="+max);
    }
  }