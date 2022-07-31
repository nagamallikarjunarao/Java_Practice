/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
    String[] arr = {"Rohit","Shikar","Virat","Dhoni"}; 
      for(int i=0;i<=arr.length;i++) {       
         System.out.println(arr[i]);      
          
        }  
    }
}

