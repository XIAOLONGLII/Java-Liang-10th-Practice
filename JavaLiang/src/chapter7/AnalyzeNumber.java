package chapter7;

import java.util.Scanner;

public class AnalyzeNumber
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter the amount of numbers: ");
		int num = input.nextInt();
		int[] array = new int[num];
		System.out.print("Type these numbers: ");
		int sum = 0;
		int count = 0;
		for (int i = 0; i < num; i++)
		{
			array[i] = input.nextInt();
			sum = sum + array[i];
		}
		int average = sum / num;
		for ( int i = 0; i < num; i++)
		{
			if(array[i] >= average)
			{
				count++;
			}
		}
		
		System.out.println("Average of these" + num + " numbers are : " + average);
		System.out.println("Number above average are" + count);
		
		
	}

}
