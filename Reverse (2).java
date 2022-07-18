import java.util.*;

class Reverse
{
	public static void main(String args[])
	{

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
	 	str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str);

    		System.out.println("Reversed string(using StringBuffer) = "+sb.reverse());

		StringBuilder sbr = new StringBuilder(str);	
    sbr. split(str);	
   		System.out.println("Reversed string(using StringBuilder) = "+sbr.reverse());
	}    
}