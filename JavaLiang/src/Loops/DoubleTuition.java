package Loops;

/* year = 2017;
 * tuition = 10000
 * rate = 0.07;
 * tuition = tuition + tuition * rate;
 * year++;
 * 
 *  
 *  */ 

public class DoubleTuition
{
	public static void main(String[] args)
	{
		double tuition = 10000;
		double rate = 0.07;
		int year = 0;
		
		while (tuition < 20000)
		{
			tuition = tuition + tuition * rate;
			year++;
		}
		System.out.println("Tution is " + tuition);
		System.out.println(year);
		
	
		
		
	}

}
