package Loops;

import java.util.Scanner;

public class SumOfNumbers
{
	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = input.nextInt();
		int sum = 0;
		while (number != 0)
		{
			sum = sum + number;
			System.out.print("Enter a number ");
			number = input.nextInt();

		}
		System.out.println("The total sum is "+ sum);

	}

}
