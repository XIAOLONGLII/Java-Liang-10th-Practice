package chapter7;

import java.util.Arrays;

public class SelectionSortDec
{

	public static double[] selectionSortD(double[] array)
	{
		//find the largest
		for(int i = 0; i < array.length -1 ;i++)
		{
			double currentLargest = array[i];
			int currentLargestIndex = i;
			for(int j = i + 1; j < array.length; j++ )
			{
				if(array[j] > currentLargest)
				{
					currentLargest = array[j];
					currentLargestIndex = j;
				}
			}
			if(currentLargestIndex != i)
			{
				array[currentLargestIndex] = array[i];
				array[i] = currentLargest;
			}
			
			
		}
		return array;
		
	}
	
	public static void main(String[] args)
	{
		double[] array =  {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
		System.out.println(Arrays.toString(array));
		double[] array1 = selectionSortD(array);
		System.out.println(Arrays.toString(array1));
	}
}
