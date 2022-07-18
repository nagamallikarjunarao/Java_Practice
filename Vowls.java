//Write a JAVA program to count total number of vowels and consonants in a string
class Vowls
  {
    public static void main(String args[])
    {
     String str=new String("lalitha");
      int count=0;
      //int  consonant=0;
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);//i=0
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          {
            count++;
          }
         //  else 
         // {
         //   consonant++;
         // }
        }
      System.out.println(count );
   //  System.out.println("count:" );
    }
  }






















