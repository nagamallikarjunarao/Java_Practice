import java.util.*;
class Coll4
  {
    public static void main(String args[])
    {
  LinkedList<Float> list=new LinkedList<Float>();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array elements");
      for(int i=0;i<3;i++)
      list.add(sc.nextFloat());
       list.addFirst(345.67f);
      list.add(2,456.45f);
      list.addLast(290.23f);
     
      System.out.println("elements are");
      for(Float f:list)
        {
          System.out.println(f);
        }
      list.remove(78.9f);
       System.out.println(" after removing elements are");
      for(Float f:list)
        {
          System.out.println(f);
        }
      LinkedList<Float> list1=new LinkedList<Float>();
      list1.addAll(list);
      System.out.println(list1);
      
      //
      if(list.contains(23.0f))
      {
        System.out.println("Found");
      }
      else
      {
        System.out.println("Not Found");
      }
        
        
    }
  }