package Loops;

import java.util.Scanner;

public class Calender
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("Type a year ");
		
		int year = input.nextInt();
		
		String months = "";
		System.out.println("the 1st day of the year : " );
		int dayFirstYear = input.nextInt();
		
		//String day = "";
		int numberDays = 0;
		for (int month = 1; month <= 12; month++)
		{
			switch(month)
			{
			case 1: 
				months = "January";
				numberDays = 31;
				System.out.println(months +"  "+  year);
				break;
			case 2: 
				months = "Febrary";
				if((year % 4 ==0 && year % 100 != 0)||(year % 400 == 0))
				{
					numberDays = 29;
				}
				else
				{
					numberDays = 28;
				}
				System.out.println(months +"  "+  year);
			    break;
			case 3: 
				months = "March";
				numberDays = 31;
				System.out.println(months +"  "+  year); 
				break;
			case 4: 
				months = "April"; 
				numberDays = 30; 
				System.out.println(months +"  "+  year);
				break;
			case 5: 
				months = "May";
				numberDays = 31; 
				System.out.println(months +"  "+  year);
				break;
			case 6: 
				months = "June";
				numberDays = 30; 
				System.out.println(months +"  "+  year);
				break;
			case 7: 
				months = "July";
				numberDays = 31; 
				System.out.println(months +"  "+  year);
				break;
			case 8: 
				months = "August";
				numberDays = 31; 
				System.out.println(months +"  "+  year);
				break;
			case 9: 
				months = "September";
				numberDays = 30; 
				System.out.println(months +"  "+  year);
				break;
			case 10: 
				months = "October";
				numberDays = 31; 
				System.out.println(months +"  "+  year);
				break;
			case 11: 
				months = "November";
				numberDays = 30; 
				System.out.println(months +"  "+  year);
				break;
			case 12: 
				months = "December";
				numberDays = 31; 
				System.out.println(months +"  "+  year);
			}

			System.out.println("––––––––––––––––––––––––––––––––––––––––––");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat" );
			
		
			for( int i = 0; i < dayFirstYear;i++)
			{
				System.out.print("    ");
			}
			for (int i = 1; i<= numberDays; i++)
			{
				if(i < 10)
				{
					System.out.print("   " + i);
				}
				else
				{
					System.out.print("  " + i);
				}
				if((i + dayFirstYear) % 7 == 0)
				{
					System.out.println();
				}
			}
			System.out.println("");
			dayFirstYear = (dayFirstYear + numberDays) %7;
		
	}

}
	
}
