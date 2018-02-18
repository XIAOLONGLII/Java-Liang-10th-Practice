package Loops;
/*palindrome
 *prime:
 * divisor = 2; divisor < number / 2; divisor++
 * if number / divisor  == 0 isPrime = true;
 * else isPrime = false;
 * String s  = Integer.toString(number);
 * Palindrome:
 * for (int i = 0; i < s.lenght();i++)
 * {
 * if s.charAt(i) == s.charAt(s.length()-i-1) isPalindrome = true;
 *  * }
 */
public class PalindromePrime
{
	public static void main(String[] args)
	{
		int count = 0;
		int num = 2;
		while (count < 100)
		{	
			if(isPrime(num)&&isPalindrome(num))
			{
				System.out.print(num + " ");
				count++;
				if(count % 10 == 0)
				{
					System.out.println();
				}
				
			}
			num++;
			
		}

	}
	public static boolean isPrime(int num)
	{
		for(int divisor = 2; divisor <= num/2; divisor++)
		{
			if(num % divisor == 0)
			{
				return false;
			}
			
		}
		return true;
	}
	public static boolean isPalindrome(int num)
	{
		int n = num;
		int reverse = 0;
		while (n != 0)
		{
			int reminder = n % 10;
			reverse = reverse * 10 + reminder;
			n = n / 10;
		}
		if(reverse == num)
		{
			 return true;
		}
		else
		{
			return false;
		}
	}
}