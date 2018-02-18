package chapter9;

import java.util.Scanner;

/*1. prompt input from user
 * 2. + - * / =  
 * 
 * 
 */
public class Caculator
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = input.nextInt();
		
		System.out.println("Enter one method:  + - * / ");
		String method = input.next();
		
		System.out.println("Enter the 2ndnumber");
		int num2 = input.nextInt();
		int result = 0;
		switch(method)
		{
		case "+" : result = (num1 + num2); break;
		case "-" : result = (num1 - num2); break;
		case "*" : result = (num1 * num2); break;
		case "/" : result = (num1 / num2); 
		}
		System.out.println(result);
	}

}
