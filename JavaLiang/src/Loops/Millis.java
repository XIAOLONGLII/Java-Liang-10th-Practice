package Loops;

public class Millis
{
	public static String convertMillis(long millis)
	{
		long seconds = millis / 1000;
		
		
		long minutes =  seconds / 60;
		long hours =  minutes / 60;
		//System.out.println("Seconds is " + seconds);
		
		String s = Integer.toString((int) seconds);
		String m = Integer.toString((int) minutes);
		String h = Integer.toString((int) hours);
		//System.out.println("Seconds IS " + seconds);
		String st = "";
		if( seconds < 60)
		{
			seconds = millis / 1000;
			minutes = 0;
			hours = 0;
			st = "0:0:" + s;
		}
		else if( seconds > 60 && seconds < 3600)
		{
			minutes = seconds / 60;
			seconds = seconds % 60;
			hours = 0;
			st = "0:" + minutes+ ":" + seconds;
		}
		else 
		{
			hours = seconds / 3600;
			
			
			if((seconds % 3600) >= 60)
			{
				minutes = (seconds % 3600) / 60;
				seconds = (seconds % 3600) % 60;
				st = h + ":" + minutes + ":" + seconds;
			}
			else
			{
				minutes = 0;
				seconds = seconds % 3600;
				st = h + ":0" + ":" + s;
			}
			
			
		}
		
		
		
		//System.out.println("S is " + s);
		

		return st;
	}
	
	public static void main(String[] args)
	{
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));
	}

	
}
