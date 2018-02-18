package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Scores
{
	private static Scanner input;

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int studentNum = input.nextInt();
		int[] sco = new int[studentNum];
		String grade = " ";
		int best = 0;
		System.out.print("Enter " + studentNum + " scores:  ");
		for (int i = 0; i < studentNum; i++)
		{
			sco[i] = input.nextInt();
		
			best = max(sco);
		}
		for (int i = 0; i < sco.length;i++)
		{
				if(sco[i] >= best -10)
				{
					grade = "A";
				}
				else if(sco[i] >= best -20)
				{
					grade = "B";
				}	
				else if(sco[i] >= best -30)
				{
					grade = "C";
					
				}
				else if(sco[i] >= best -40)
				{
					grade = "D";	
				}
				else
				{
					grade = "F";
				}			
			System.out.println("Student " + i + " score is " + sco[i] + " and grade is " +grade);			
			}
				
		}
	
	public static int max(int[] array)
	{
		int max = array[0];
		for (int i = 0; i < array.length;i++)
		{
			if(array[i] > max)
				max = array[i];
		}
		return max;
	}


}
