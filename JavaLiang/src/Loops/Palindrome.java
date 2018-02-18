package Loops;

import java.util.Scanner;

public class Palindrome 
{
	private static Scanner input;

	public static void main(String[] agrs)
	{
		input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String st = input.next();
		
		int firstIndex = 0;
		int lastIndex = st.length() -1;
		boolean isPalindrome = true;
		while(firstIndex < lastIndex)
		{
			if(st.charAt(firstIndex) != st.charAt(lastIndex)) {
				isPalindrome = false;
			}
			else
			{
				isPalindrome = true;
			}
			firstIndex++;
			lastIndex--;
		}
		if(isPalindrome)
		{
			System.out.println(st + " is a palindrome string");
		} 
		else
		{
			System.out.println(st + " is NOT palindrome string");
		}
			
		
		
		
		/*
		while (st.length() <= 2)
		{
			System.out.println("Invalid String, try ir again");
			st = input.next();
		}
	
			for( int i = 1; i < st.length()/2; i++ )
			{
				if (st.substring(0,i).equals(st.substring(st.length()-i)))
				{
					System.out.println(st + " is a palindrome string");
				}
				else 
				{
					System.out.println("It is not a palindrome string");
				}
			}

		*/
	}
	
	

}
