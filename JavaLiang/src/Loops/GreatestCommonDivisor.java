package Loops;

import java.util.Scanner;

/*  
 * gcd for 4 and 2 is 2;
 * gcd for 16 and 24 is 8, not 4
 * gcd for 100 and 25 is 25 not 5;
 * gcd for 81 and 18 is 9 not 3;
 * gcd for 121 and 
 * Thinking: 
 * 1. find out the two numbers
 * 2. (not working)number %2 == 0 or number %3 == 0; number % 5 == 0; 
 *    number % 7 ==0; number % 11 == 0; number % 13 ==0;
 * 3. (not working) number % 10 = 8 ---1; 18 % 10 = 8 ---1
 *    number % 10 = 10    25 % 10 = 2 ----5 
 *    
 * 4.  81 = 9^2, 3 ^4; 18 = 2 * 3^2;
 * 
 * 5. num1 > num2; num1 %num2 == 0; then num2, 81 / 18 = 4, 81 % 18 =  
 * */
public class GreatestCommonDivisor
{

	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.print("Enter the two numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("The two numbers are : " + num1 + " "+ num2);
		
		int gcd = 0;
		int k = 1;
		while (k <= num1 && k<= num2)
		{
			if(num1 % k == 0 && num2 % k ==0)
			{
				gcd = k;
			}
			k++;
		}
		System.out.println(num1 + " " + num2 + " Greatest Commone Divisor is " + gcd);
		
	}

}
