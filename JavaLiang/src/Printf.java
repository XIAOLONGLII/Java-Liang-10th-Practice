

// $%4.2f: I want a number that has are least 3 spaces total, 
//2 of which I want to go toward its value after the decimal point. 
public class Printf 
{

	public static void main(String[] args)
	{
		double amount = 1234.98;
		double rate = 0.13;
		double interest = amount * rate;
		System.out.println("Intrest is: " + interest);
		System.out.println("Accurate intrest is " + (int)(interest * 100) / 100.0);
		System.out.printf("The most accurate intrest is $%4.2f    ", interest);
		
		int count = 5;
		double amount1 = 45.56;
		System.out.printf("count is %d and amount is %f", count, amount1);
	}
}
