//Write a JAVA program to find total number of alphabets, digits or special character in a string.
import java.util.*;
class Numofa_s_n{
  public static void main (String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the string");
    String str=sc .nextLine();
    int aplha=0;
    int num=0;
    int spl=0;
    for (int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z')
      {
        aplha++;
      }
     else if (ch>='0' && ch<='9') {
       num++;
     }
      else {
        spl++;
      }
    }
      System.out.println("alphabets :" +aplha);
      System.out.println("num :" +num);
      System.out.println("special character :" +spl);
    }
  }


















