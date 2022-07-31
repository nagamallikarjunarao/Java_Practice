import java.util.*;
class Map
  {
    public static void main(String args[])
  {
  Map<Integer,String> map=new HashMap<Integer,String>();
    map.put(12,"Mango");
    map.put(78,"Apple");
    map.put(45,"Orange");
    map.put(96,"Apple");
    map.put(null,null); 
    System.out.println(map);  
  }
  }