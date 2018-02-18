package Loops;

public class WhileWelcome
{
	public static void main(String[] args)
	{
		/*String line = "Welcome to Java";
		for (int i = 0; i < 1; i++)
		{
			System.out.println(line);
		}
		System.out.println(); */
		
		int count = 1;
		while( count < 5 )
		{
			System.out.println("Welcome" + count);
			count++;
		}
		System.out.println("Welcome to USA");
	}
}
