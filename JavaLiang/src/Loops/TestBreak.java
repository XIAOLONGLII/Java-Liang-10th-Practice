package Loops;

public class TestBreak
{
	public static void main(String[] agrs)
	{
		int sum = 0;
		int number = 0;
		
		while(number < 20)
		{
			number++;
			sum = sum + number;
			System.out.println(sum);
			if(sum >= 100)
				break;
		}
		
		System.out.println(number);
		//System.out.println(sum);
		
	}
	
}
