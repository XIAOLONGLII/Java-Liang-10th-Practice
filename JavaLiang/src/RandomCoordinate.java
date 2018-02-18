import java.util.Random;
import java.util.Scanner;

public class RandomCoordinate 
{
	public static Scanner input;
	public static void main(String[] args)
	{
		Random random = new Random();
		for (int i = 0; i < 10; i++) 
		{
			
			int x = random.nextInt(2);
			System.out.println(x);
		}
		
		
		int maxWidth = 50;
		int minWidth = -50;
		int newWidth = (int)(random.nextInt(maxWidth + 1 - minWidth) + minWidth);
		int maxHeight = 100;
		int minHeight = -100;
		int newHeight = (int)(random.nextInt(maxHeight + 1 - minHeight) + minHeight);
		
		System.out.print("x = " + newWidth + "\n" + "y = " + newHeight);
	}

}
