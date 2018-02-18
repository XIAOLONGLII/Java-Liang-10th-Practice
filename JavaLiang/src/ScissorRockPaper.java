import java.util.*;

public class ScissorRockPaper 
{
	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		Random random = new Random();
		int rNum = random.nextInt(3);
		//System.out.println("Random generate " + rNum);
		
		System.out.print("scissor(0), rock(1), paper(2): ");
		int num = input.nextInt();
		//B:
		String s = "";
		switch(rNum)
		{
		case 0: s = "scissor"; break;
		case 1: s = "rock"; break;
		case 2: s = "paper"; 
		}
		System.out.print("The computer is " + s);
		
		String s1 = "";
		switch(num)
		{
		case 0: s1 = "scissor"; break;
		case 1: s1 = "rock"; break;
		case 2: s1 = "paper"; 
		}
		System.out.print(". You are " + s1);
		
		if(rNum == num)
		{
			System.out.print(". It is a draw");
		}
		else {
			if(((rNum == 0) && (num == 1))
				||((rNum == 1) && (num == 2))
				|| ((rNum ==2) && (num == 0))) 
			{
				System.out.println(". You won");
			}
			else 
			{
				System.out.println(". You lost");
			}
		}
		/* A: 
		 * String s = "";
		switch(rNum)
		{
		case 0: s = "scissor"; break;
		case 1: s = "rock"; break;
		case 2: s = "paper"; 
		}
		if((rNum == 0 && num == 1))
		{
			System.out.println("The computer is " + s + ". You won");
		}
		else if((rNum == 1 && num == 2))
		{
			System.out.println("The computer is " + s + ". You won");
		}
		else if((rNum == 2 && num == 0))
		{
			System.out.println("The computer is " + s + ". You won");
		}
		else if((num == 0 && rNum == 1))
		{
			System.out.println("The computer is " + s + ". You lost");
		}
		else if((num == 1 && rNum == 2))
		{
			System.out.println("The computer is " + s + ". You lost");
		}
		else if((num == 2 && rNum == 0))
		{
			System.out.println("The computer is " + s + ". You lost");
		}
		else if((rNum == num))
		{
			System.out.println("The computer is " + s + ". You are " + s + " too. It is a draw");
		}*/
		
		
	}
	
}
