package Loops;
/*
 * 
 * check if it is prime, if it is then reverse, then check if it is still a prime.
 */
public class Emirp
{
	public static boolean isPrime(int num)
	{
		for(int divisor = 2; divisor <= num / 2; divisor++)
		{
			if(num % divisor == 0)
			{
				return false;
			}
			
		}
		return true;
	}
	public static int reverse(int num)
	{
		int reminder;
		
		int rev = 0;
		while(num != 0)
		{
			reminder = num % 10;
			rev = rev * 10 + reminder;
			num = num / 10;
			
		}
		return rev;
	}
	
	public static void main(String[] args)
	{
		int num = 10;
		int count = 0;
		while(count < 100)
		{
			if(isPrime(num))
			{
				int number = reverse(num);
				if(isPrime(number))
				{
					System.out.print(num + " ");
					count++;
					if(count % 10 == 0)
					{
						System.out.println();
					}
				}
			}
			num++;
		}
	}
}
