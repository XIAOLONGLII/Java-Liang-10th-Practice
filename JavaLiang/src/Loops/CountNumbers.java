package Loops;

import java.util.Scanner;

public class CountNumbers
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = input.next();
		System.out.println(countLetters(s));
	}
	
	public static int countLetters(String s )
	{
		String t = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				count++;
				t = t + s.charAt(i);
				
			}
			
		}
		System.out.println(t);
		return count;
	}
	

}
