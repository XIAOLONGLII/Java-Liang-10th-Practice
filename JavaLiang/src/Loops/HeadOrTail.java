package Loops;

public class HeadOrTail
{
	private static int guess;

	public static void main(String[] args)
	{
		guess = 0;
		int head = 0;
		int tail = 0;
		System.out.println("Head and Tail in 1 million will randomly come those times: ");
		for (int i = 1; i < 10; i++)
		{
			
			if(Math.random() > 0.5)
			{
				guess = 1;
				head++;
			}
			else
			{
				guess = 0;
				tail++;
			}
			
			
		}
		System.out.println("head is " + head + " \ntail is " + tail);
	}
	
}
