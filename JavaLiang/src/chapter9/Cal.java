package chapter9;

import java.util.Scanner;

public class Cal
{
	

	public static void main(String[] args)
	{
		Maths math = new Maths();
		
		double answer = 0;
		boolean done = false;
		Scanner input = new Scanner(System.in);
		
		
		while(!done)
		{
			System.out.print("Enter the 1st num ");
			int a = input.nextInt();
			System.out.print("Enter the operator");
			char operator = input.next().charAt(0);
			
			System.out.print("Enter the 2nd num ");
			int b = input.nextInt();
			
			switch(operator)
			{
				case '+': answer = math.add(a, b); break;
				case '-': answer = math.subtract(a, b); break;
				case '*': answer = math.multiply(a, b); break;
				case '/': answer = math.divid(a, b); break;
				case '^': answer = math.power(a, b);
		
			}
			System.out.println(answer);
			
		}
		
		input.close();
	}
	

}

class Maths
{
	double add(double a, double b)
	{
		return  a + b;
		
	}
	double subtract(double a, double b)
	{
		return a - b;
		
	}
	double multiply(double a, double b)
	{
		return a * b;
		
	}
	double divid(double a, double b)
	{
		return a / b;
		
	}
	double power(double a, double b)
	{
		return Math.pow(a, b);
		
	}
}
