package Loops;

import java.util.Scanner;

/*prime numbers are: 
 * 2,3,5,7,11,13,17 
 * number > 2 
 * number % 2 > 0
 * number % 3 > 0
 * number % 4 > 0
 * boolean isPrime = false;
 * for ( int i = 2; i < number /2; i++) 
 * {
 * if(number % i == 0 ) isPrime = fase;
 * else isPrime == true;
 * }
 * 
 */
public class PrimeNum 
{
	
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = input.nextInt();
		boolean isPrime = false;
		
		if (num == 2)
		{
			System.out.println(num + "is prime");
		}
		
		for (int i = 2; i <= num/2; i++)
		{
			while (num % i == 0)
			{
				isPrime = false;
			} 
			
		}
		System.out.println(isPrime);
		
		if(isPrime)
		{
			System.out.println(num + " is prime");
		}
		else
		{
			System.out.println(num + " is not prime ");
		}
		
	}
	

}
