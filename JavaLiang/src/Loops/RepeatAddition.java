package Loops;

import java.util.Scanner;

public class RepeatAddition 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		
		
		input = new Scanner(System.in);
		System.out.println("Guess the total of two random number:  ");
		
		int answer = input.nextInt();
		System.out.println("Random numbers are : " + num1 + " "+ num2);
		while ( answer != num1 + num2)
		{
			System.out.println("Wrong guess, try it again" );
			System.out.println("Guess the total of two random number:  ");
			answer = input.nextInt();
			System.out.println("Random numbers are : " + num1 + " "+ num2);
		}
		System.out.println("You got it!");
		
	}
	
}
