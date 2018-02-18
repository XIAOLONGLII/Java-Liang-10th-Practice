package Loops;

import java.util.Scanner;

public class CountVowels
{
	private static Scanner input;
	
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st = input.nextLine();
		int count = 0;
		int space = 0;
		for(int i = 0; i < st.length(); i++)
		{
			if(st.charAt(i) == 'A'||
					st.charAt(i) == 'a'||
					st.charAt(i) == 'E'||
					st.charAt(i) == 'e'||
					st.charAt(i) == 'U'||
					st.charAt(i) == 'u'||
					st.charAt(i) == 'I'||
					st.charAt(i) == 'i'||
					st.charAt(i) == 'O'||
					st.charAt(i) == 'o'||
					st.charAt(i) == 'U'||
					st.charAt(i) == 'u'
					) 
			{
				count++;
			} else if(st.charAt(i) == ' '){
				{
					space++;
				}
			}
		}
		System.out.println("The number of vowels is "+ count + "\nThe number of consonants is " + (st.length() - count-space));
	
	
	}
	
}
