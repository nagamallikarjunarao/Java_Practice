class MultithereadingDemo implements Runnable{
  public void run(){
    Thread.currentThread();
    System.out.println("I am ");
    System.out.println(Thread.currentThread().getId());
  }
}
public class Multithereading{
  public static void main(String [] args){
    
    MultithereadingDemo obj1=new MultithereadingDemo();
    Thread obj=new Thread(obj1);
    obj.start();
  }
}