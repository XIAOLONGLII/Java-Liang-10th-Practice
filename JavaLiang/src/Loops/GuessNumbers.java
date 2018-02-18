package Loops;

import java.util.Scanner;

public class GuessNumbers
{

	private static Scanner input;

	public static void main(String[] args)
	{
		int number = (int)(Math.random() * 100);
		input = new Scanner(System.in);
		System.out.println("Guess a magic nuber between 0 and 100");
		System.out.print("Enter your guess ");
		int guess = input.nextInt();
		while (guess != number)
		{
			
			 if ( guess > number)
			{
				System.out.println("Your guess is too high ");
				guess =input.nextInt();
			}
			else 
			{
				System.out.println("Your guess is too low");
				guess = input.nextInt();
			} 
		}
		System.out.println("Yes, the number is " + number);
	}
}
