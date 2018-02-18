
import java.util.Random;
import java.util.Scanner;

public class FlipCoin
{
	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter a guess, the coin is head or tail: ");
		String guess = input.next();
		//Random rand = new Random();
		//int number = rand.nextInt(1);
		/*int number = 0;
		
			if (Math.random() < 0.5)
			{
				number = 0;
			}
			else
			{
				number = 1 ;
			}
		*/
		Random random = new Random();
		int number = random.nextInt(2);
		
		if ((((number == 1) && guess.equals("head"))) || ((( number == 0) && guess.equals("tail"))))
		{
			System.out.println("The guess is " + guess + " and the random number is "+ number+ "\nIt is correct!");
		} 
		else
		{
			System.out.println("the random number is "+ number+"\nThe guess is wrong");
		}
		
	}
	
}
