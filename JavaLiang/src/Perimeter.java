/*
 * Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge
* 
*/


import java.util.Scanner;

public class Perimeter 
{
	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Input three edges of a triangle: ");
		int edgea = input.nextInt();
		int edgeb = input.nextInt();
		int edgec = input.nextInt();
		
		int perimeter = 0;
		
		if(edgea <= 0 || edgeb <= 0 || edgec <= 0)
		{
			System.out.println("Invalid input");
		} 
		else if((( edgea + edgeb ) <= edgec) || (( edgea + edgec) <= edgea)|| (( edgeb + edgec) <= edgea))
		{
			System.out.println("Invalid input");
		} 
		else 
		{
			if(edgea == edgeb)
			{
				perimeter = edgea * 2 + edgec * 2;
			} 
			else if(edgea == edgec) 
			{
				perimeter = edgea * 2 + edgeb * 2;
			}
			System.out.println(perimeter);
		}
		
	}
}
