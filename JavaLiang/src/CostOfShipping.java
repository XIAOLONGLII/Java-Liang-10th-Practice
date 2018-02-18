import java.util.Scanner;

public class CostOfShipping 
{
	public static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("What is the weight of your ackage: ");
		int weight = input.nextInt();
		double cost = 0;
		
		if(weight <= 1)
		{
			cost = 3.5;
		}
		else if(weight <= 3 && weight >1)
		{
			cost = 5.5;
			System.out.println("The cost is "+ cost);
		}
		else if(weight <= 10 && weight > 3)
		{
			cost = 8.5;
			System.out.println("The cost is "+ cost);
		}
		else if(weight < 20 && weight > 10)
		{
			cost = 10.5;
			System.out.println("The cost is "+ cost);
		}
		
		else 
		{
			System.out.println("Too heavy, cannot be ship");
		}
		
	}

}
