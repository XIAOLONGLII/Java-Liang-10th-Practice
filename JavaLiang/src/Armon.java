import java.util.Scanner;

public class Armon {

	private static Scanner input;

	public static void main(String[] args)
	{
		
		input = new Scanner(System.in);
	    System.out.println("Type a number");
	    int num = input.nextInt();
	    String armon;
	    switch(num)
	    {
	        case 1: armon = "I";
	            break;
	        case 2: armon = "II";
	            break;
	        case 3: armon = "III";
	            break;
	        case 4: armon = "IV";
	            break;
	        case 5: armon = "V";
	            break;
	        case 6: armon = "VI";
	            break;
	        case 7: armon = "VII";
	            break;
	        case 8: armon = "VIII";
	            break;
	        case 9: armon = "IX";
	            break;
	        case 10: armon = "X";
	            break;
	        default: armon = "Number entered is not between 1 and 10";
	            break;
	        
	    }
	    System.out.println(armon);

	}

}

/*
 * 
 * class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Type a number");
	    int num = input.nextInt();
	    String armon;
	    switch(num)
	    {
	        case 1: armon = "I";
	            break;
	        case 2: armon = "II";
	            break;
	        case 3: armon = "III";
	            break;
	        case 4: armon = "IV";
	            break;
	        case 5: armon = "V";
	            break;
	        case 6: armon = "VI";
	            break;
	        case 7: armon = "VII";
	            break;
	        case 8: armon = "VIII";
	            break;
	        case 9: armon = "IX";
	            break;
	        case 10: armon = "X";
	            break;
	        default: armon = "Number entered is not between 1 and 10";
	            break;
	        
	    }
	    System.out.println(armon);
	    
	}
}
*/
