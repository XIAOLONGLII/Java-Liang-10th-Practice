package Loops;

import java.util.Scanner;

public class TestSpace {

	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Type the first day");
		int firstDay = input.nextInt();
		System.out.println("Number days a month");
		int numberOfDays = input.nextInt();
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		for (int i = 0; i < firstDay; i++)
		{
			System.out.print("   ");
		}
		for(int i = 1; i <= numberOfDays; i++)
		{
			
			
			if(i < 10)
			{
				System.out.print("   " + i);
			}
			else
			{
				System.out.print("  " + i);
			}
			if( (i + firstDay) % 7 == 0)
			{
				System.out.println( );
			}
			
		}
		System.out.println("");
		
	}
}
