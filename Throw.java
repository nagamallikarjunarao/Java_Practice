import java.util.*;
class Throw {
  public static void validate(int age)
  {
    if(age>18)
    {
      System.out.println("Person is elegible");
    }
    else
    {
      throw new ArithmeticException("Person is not eligible");
    }
  }
  public static void main(String args[]) {
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    String name = "lalitha";
    try {
      validate(12);
    }
    catch (Exception obj) {
      System.out.println(obj);
    }
    
    finally
    {
      System.out.println("Finally block executed always");
    }
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
  }
}