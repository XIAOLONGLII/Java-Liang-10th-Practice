package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString
{

	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st = input.next();
		String reverse = "";
		for( int i = st.length() -1; i >= 0; i--)
		{
			reverse = reverse + st.charAt(i);
		}
		System.out.println(reverse);

	
		
	}
	
}

/*String s = "";
String t = "";
for (int i = 1; i <= st.length(); i++)
{
	s = st.substring(0, i);
	t = st.substring(st.length()-i);
	String temp = s;
	s = t;
	t = temp;
	System.out.println( s);
}*/



/*	String[] arr = st.split("");
//System.out.println(arr[arr.length-1]);
for (int i = 0; i < arr.length;i++)
{
	String temp = arr[arr.length-1-i];;
	arr[arr.length-1-i] = arr[i];
	arr[i] = temp;
	
	System.out.print(arr);
}

*/


/*String reverse ="";
for (int i = st.length()-1; i>= 0;i--)
{
	reverse = reverse + st.charAt(i);
}

System.out.println(reverse);*/