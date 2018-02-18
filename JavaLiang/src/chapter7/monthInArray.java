package chapter7;

import java.util.Scanner;

public class monthInArray
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String[] months = {"January", "February", "March","April","May",
				"June","July","August","September","October","November","December"};
		System.out.print("Enter a number ");
		int monthNumber = input.nextInt();
		System.out.println("The month is " + months[monthNumber -1]);
		for (String e: months)
		{
			System.out.print(e + " ");
		}
	}

}
