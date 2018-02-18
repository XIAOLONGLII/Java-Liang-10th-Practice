import java.util.Scanner;

public class LetsReview {

	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("How many strings? ");
		int number = input.nextInt();
		resolution(number);

	}

	private static void resolution(int number)
	{
		String[] array = new String[number];
		for(int i = 0; i < number;i++)
		{
			array[i] = input.next();
			
			for(int j = 0; j < array[i].length(); j = j + 2)
			{
				System.out.print(array[i].charAt(j));
			}
			System.out.print(" ");
			
			for(int h = 1; h < array[i].length(); h = h + 2)
			{
				System.out.print(array[i].charAt(h));
			}
			System.out.println();
		}
		
		
	}

}
