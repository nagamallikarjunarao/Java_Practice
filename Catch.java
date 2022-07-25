import java.util.*;
class Catch {
  public static void main(String args[]) {
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    String name = "lalitha";
    try {
      System.out.println(Integer.parseInt(name));
    }
    catch (NullPointerException obj) {
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