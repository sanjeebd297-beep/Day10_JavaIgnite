/*
Banking System (Real-world Simulation)

Create a program that:

Takes account balance
Takes withdrawal amount
Rules:
If withdrawal > balance → throw and handle exception
If invalid input → handle exception
Output:
Withdrawal successful OR Insufficient balance
*/
package JavaIgniteDay10;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Banking_System {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int balance,withdrawl;
		
		try {
			System.out.println("Enter Balance :");
			balance=sc.nextInt();
			
			System.out.println("Enter Withdrawl Amount :");
			withdrawl=sc.nextInt();
			
			if(withdrawl > balance ) 
			{
				throw new Exception("Insufficent Balance");
			}
			System.out.println("Withdrawl success !");
			System.out.println("Remaining balance :"+ (balance-withdrawl));
		}
		
		catch(InputMismatchException e) 
		{
			System.out.println("In valid input");
		}
		
		catch(Exception e) 
		{
			System.out.println("In sufficent balance");
		}
		sc.close();
	}

}
