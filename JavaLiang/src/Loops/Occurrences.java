package Loops;

import java.util.Scanner;

public class Occurrences
{
	public static int count(String str, char a)
	{
		int count = 0;
		for (int i = 0; i < str.length();i++)
		{
			if(str.charAt(i) == a)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Type the string and cha to count how many of them");
		String str = input.next();
		char a = input.next().charAt(0);
		System.out.println(count(str, a));
		
	}
	
}
