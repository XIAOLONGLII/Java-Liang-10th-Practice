package Loops;

public class LeapYears
{
	public static void main(String[] args)
	{
		int count = 0;
	
		for(int i = 101; i < 2100; i++)
		{
			if (i % 4 == 0)
			{
				
				count++;
				
				if(count % 10 == 0)
				{
					System.out.println(i);
				}
					
				else
				{
					System.out.print(i + " ");
				}
			}	
		}
		System.out.println("\n Number of leap years = " + count);
	}
}
