/*
ATM Multi-Level Exception System

Create a program that simulates ATM withdrawal.

Requirements:
Take balance and withdrawal amount
If withdrawal > balance → handle exception
If withdrawal amount is negative → handle exception
If input is invalid (text instead of number) → handle exception
Expected Output:
Transaction Successful / Insufficient Balance / Invalid Input
*/
package JavaIgniteDay10;
import java.util.Scanner;

public class ATM_Check_System {
	public static void main(String[] argd) {
		
	Scanner sc = new Scanner(System.in);
	int balance,withdrawl,remain;
	try {
		System.out.println("Enter Balance :");
		balance = sc.nextInt();
		
		System.out.println("Enter Withdrawl Amount :");
		withdrawl = sc.nextInt();
		if(withdrawl > balance )
		{
			System.out.println("Invalid input");
		}
		if(withdrawl < 0 )
		{
			System.out.println("Withdrawl amount can't be negative");
		}
		remain = balance - withdrawl;
		System.out.println("Withdrawn Sucessfully \nRemaining Balance : "+ remain);
	}
	catch(Exception e) 
	{
		System.out.println("INVALID INPUT...PLEASE ENTER A VALID NUMBER");
	}
	sc.close();
	}
}
