package chapter7;

import java.util.Arrays;

public class SortSwap
{
	public static void main(String[] args)
	{
		int[] array = {3,9,5,4,8,2,6};
		
		for(int j = 0; j < array.length - 1; j++)
		{
			int minIndex = j;

			for(int i = j + 1; i < array.length; i++)
			{
				if (array[i] < array[j])
				{
					minIndex = i;
				}
			}
			if(minIndex != j)
			{
				int temp = array[j];
				array[j] = array[minIndex];
				array[minIndex] = temp;
			}
			
			
		}
		System.out.println(Arrays.toString(array));
			
				
			
			

	}
	

}
