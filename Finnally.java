import java.util.*;
class Finnally {
  public static void main(String args[]) {
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    String name = "lalitha";
    try {
      System.out.println(Integer.parseInt(name)/0);
    }
    catch (NullPointerException obj) {
      System.out.println(obj);
    }
    catch(NumberFormatException e)
      {
        System.out.println(e);
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