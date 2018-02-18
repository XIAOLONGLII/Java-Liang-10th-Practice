package Loops;

import java.util.Scanner;

public class IsUpperCase 
{

	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st = input.nextLine();
		int uppercase = 0;
		
		for(int i = 0; i < st.length();i++)
		{
			if(Character.isUpperCase(st.charAt(i)))
			{
				uppercase ++;
			}
		}
		System.out.println(uppercase);
	}
	
}
