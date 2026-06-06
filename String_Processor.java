/*
String Processor with Exception Safety

Create a program that:

Takes a string input

Performs:

substring operation
charAt operation
Requirements:

Handle:

StringIndexOutOfBoundsException
Example:
Invalid index handled safely
*/
package JavaIgniteDay10;
import java.util.Scanner;

public class String_Processor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a String");
		str = sc.nextLine();
		
		System.out.println("Main is "+ str);
		
		try
		{
			System.out.println("Enter the index for substring(beg index / end index) ");
			int beg = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(str.substring(beg,end));
			System.out.println("Enter the index you want to view :");
			int index = sc.nextInt();
			System.out.println(str.charAt(index));
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("In valid index");
		}
		sc.close();
	}
	

}
