package Loops;

import java.util.Scanner;

/*
 * for loop from beginning, 
 * empty string then add odd char
 */
public class OddPosition
{

	private static Scanner input;

	public static void main(String[] args)
	{
	
		input = new Scanner(System.in);
		System.out.println("ENter a string: ");
		String st = input.nextLine();
		String odd = "";
		for (int i = 0; i < st.length();i = i+2)
		{
			odd = odd + st.charAt(i);
		}
		System.out.println(odd);
	}
	
}
