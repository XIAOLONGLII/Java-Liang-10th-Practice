import java.util.Scanner;

public class Lottery
{
	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		int lottery = (int)(Math.random() * 1000);
		System.out.println("Enter a three-digit number to see if mathes the loterry ");
		int guess = input.nextInt();
		System.out.println("Lottery is " + lottery);
		System.out.println("Guessed number is " + guess);
	
		 //abc
		int c = lottery % 10;
		System.out.println("Lottery c = " + c);
		int newLottery = lottery / 10;
		int b = newLottery % 10;
		System.out.println("Lottery b = " + b);
		int a = newLottery / 10;
		System.out.println("Lottery a = " + a);
		System.out.println();

		//a1b1c1
		int c1 = guess % 10;
		System.out.println("Number c1 = " + c1);
		int newNumber = guess / 10;
		int b1 = newNumber % 10;
		System.out.println("Number b1 = " + b1);
		int a1 = newNumber / 10;
		System.out.println("Number a1 = " + a1);
		int award = 0;
		System.out.println("a = " + a + " b = "+ b + " c =  "+ c);
		System.out.println("a1 = " + a1 + " b1 = "+ b1 + " c1 = "+ c1);

		if( guess == lottery )
		{
			award = 10000;
		}
		else if (( a == b1 && b == c1 && c == a1 && a != a1 && b != b1 && c != c1 ) 
				|| (a == b1 && b == c1 && c == a1 && a != a1 && b != b1 && c != c1 ) 
				|| (a == a1 && b != b1 && a == a1))
		{
			award = 3000;	
		} 
		else if(((a == a1) && (a != b1) && (a != c1)&&
				(b != a1) && (b != b1)&&(b != c1) &&
				(c != a1)&&(c != b1) &&(c != c1)) 
				||
				((b == a1) && (b != b1) && (b != c1)&&
				(a != a1) && (a != b1)&&(a != c1) &&
				(c != a1)&&(c != b1) &&(c != c1))
				||
				((c == a1) && (c != b1) && (c != c1)&&
				(a != a1) && (a != b1)&&(a != c1) &&
				(b != a1)&&(b != b1) &&(b != c1))
				
				
				||
				((a != a1) && (a == b1) && (a != c1)&&
				(b != a1) && (b != b1)&&(b != c1) &&
				(c != a1)&&(c != b1) &&(c != c1)) 
				||
				((b != a1) && (b == b1) && (b != c1)&&
				(a != a1) && (a != b1)&&(a != c1) &&
				(c != a1)&&(c != b1) &&(c != c1))
				||
				((c != a1) && (c == b1) && (c != c1)&&
				(a != a1) && (a != b1)&&(a != c1) &&
				(b != a1)&&(b != b1) &&(b != c1))
				
				
				||
				((a != a1) && (a != b1) && (a == c1)&&
				(b != a1) && (b != b1)&&(b != c1) &&
				(c != a1)&&(c != b1) &&(c != c1)) 
				||
				((b != a1) && (b != b1) && (b == c1)&&
				(a != a1) && (a != b1)&&(a != c1) &&
				(c != a1)&&(c != b1) &&(c != c1))
				||
				((c != a1) && (c != b1) && (c == c1)&&
				(a != a1) && (a != b1)&&(a != c1) &&
			    (b != a1)&&(b != b1) &&(b != c1))
				)
				
		{
			award = 1000;	
		} 
		else
		{
			System.out.println("Wrong guess");
		}
		System.out.println(award);
		
	}
}



