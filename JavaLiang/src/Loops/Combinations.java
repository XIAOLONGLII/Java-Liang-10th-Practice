package Loops;

public class Combinations
{
	public static void main(String[] agrs)
	{
		
		int count = 0;
		for (int i = 1; i < 8; i++)
		{
			for (int j = i+1 ; j< 8; j++)
			{
				System.out.println(i + " " + (j));
				count++;
			}
			
		}
		System.out.println(count);
	}

}
