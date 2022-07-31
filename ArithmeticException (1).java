/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException {

    public static void main(String args[]) {
      int x =100, y = 0;
int z;
System.out.println("Hello world");
try
{
z = x/y;
System.out.println(z);
}
catch(Exception except)
{
System.out.println("Avoid dividing by integer 0" + except );
}
System.out.println("Hello class");
System.out.println("Hello there");
}
}

    