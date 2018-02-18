package Loops;

import java.util.Scanner;

public class OccurrenceOfMax
{
	private static Scanner input;
	
	public static void main(String[] args)
	{
		int max = 0;
		int count = 0;

		input = new Scanner(System.in);
		System.out.println("Enter numbers ");
		int num = input.nextInt();
		
		if(num ==0)
		{
			System.exit(1);
		}
		while(num != 0)
		{
			
			if(num > max)
			{
				count++;
				max = num;
			}
			else if(max == num)
				count++;
			num = input.nextInt();
			
		}
		System.out.println("The largest number is "+ max + " The occurrence is " + count);
	
		
	}

	
}


/* int max = 0;
int count = 0;

input = new Scanner(System.in);
System.out.print("Enter numbers: ");
int number = input.nextInt();

if(number == 0)
{
	System.exit(1);
}


while(number != 0)
{
	number = input.nextInt();
	if(number > max)
	{
		count++;
		max = number;
		
	}

}
System.out.println("The largest is " + max + " And its occurrence is "+ count); */
