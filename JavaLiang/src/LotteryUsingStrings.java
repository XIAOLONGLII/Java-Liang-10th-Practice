import java.util.Scanner;

public class LotteryUsingStrings
{
	private static Scanner input;

	public static void main(String[] args)
	{
		String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
		input = new Scanner(System.in);
		System.out.println("Enter your guess");
		String guess = input.next();
		int award = 0;
		String l1 = lottery.substring(0,1);
		String l2 = lottery.substring(1);
		System.out.println(l1);
		System.out.println(l2);
		
		
		String g1 = guess.substring(0, 1);
		String g2 = guess.substring(1);
		System.out.println(g1);
		System.out.println(g2);
		
		if ( guess.equals(lottery) )
		{
			award = 10000;
			
		}
		else if( l1.equals(g2)  && l2.equals(g1) )
		{
			award = 3000;
			
		}
		else if (g1.equals(l1) || g1.equals(l2) || g2.equals(l1) || g2.equals(l2))
		{
			award = 1000;
			
		} 
		else
		{
			System.out.println("No match");
		}
		System.out.println(award);
		System.out.println("The random number is "+ lottery);
	}
}
