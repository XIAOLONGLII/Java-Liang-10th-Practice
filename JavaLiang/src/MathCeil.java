import java.util.Scanner;

public class MathCeil {

	public static Scanner input;
	public static void main(String[] args)
	{
		
		input = new Scanner(System.in);
		System.out.println(Math.ceil(-2.5));
		System.out.println(Math.max(2.5, 3));
		System.out.println(Math.abs(-2.9));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.sin( Math.PI));
		System.out.println(Math.round( 2.5));
		char letter = '\u0041';
		System.out.println(letter);
		
		char chi = 'a';
		System.out.println(++chi);
		
		System.out.println();
		
		System.out.println("He loves \"java\"");
		
		System.out.println();
		double c = 65.25;
		char ch = (char) c;
		System.out.println(ch);
		
		String s = " HelloWorld!";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.trim().length());
		String s11 = "NYC";
		System.out.println(s.concat(s11));
		
		System.out.println("ENter a line");
		String line = input.nextLine();
		System.out.println(line);
		
		String s1 = "Welcome to java";
		String s2 = "Welcome to Java";
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
	}
	
}
