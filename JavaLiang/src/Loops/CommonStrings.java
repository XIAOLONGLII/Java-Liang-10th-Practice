package Loops;

import java.util.Scanner;

public class CommonStrings
{
	private static Scanner input;

	public static void main(String[] args)
	{
	
		input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s = input.nextLine();
		System.out.println("Enter the second string: ");
		String t = input.nextLine();
		String prefix = "";
		
		for(int i = 0; i < s.length() && i< t.length(); i++)
		{
				if( s.charAt(i) == t.charAt(i))
				{
					prefix = prefix + s.charAt(i);
				}

		}
		if(prefix.length() != 0)
		{
			System.out.println("The common is " + prefix);
		}
		else
		{
			System.out.println("There is no common");
		}
	
		
	}
}


/*for(int i = 0; i < s.length() && i< t.length(); i++)
{
		if( s.charAt(i) == t.charAt(i))
		{
			prefix = prefix + s.charAt(i);
		}

}
if(prefix.length() != 0)
{
	System.out.println("The common is " + prefix);
}
else
{
	System.out.println("There is no common");
}
*/



/* int index = 0;
while (s.charAt(index) == t.charAt(index))
{
	prefix = prefix + s.charAt(index);
	index++;
}
if(prefix.length() > 0)
{
	System.out.println("The common is " + prefix);
}
else
{
	System.out.println("There is no common");
}
*/