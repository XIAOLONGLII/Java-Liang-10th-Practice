package chapter7;

import java.util.Arrays;

public class SelectionSort
{
	public static int[] selectionSort(int[] array)
	{
		
		for (int i = 0; i < array.length - 1;i++)
		{
			int currentMinimum = array[i];
			int currentIndex = i;
			for(int j = i + 1; j < array.length;j++)
			{
				if(currentMinimum > array[j])
				{
					currentMinimum = array[j];
					currentIndex = j;
				}
			}
			if(currentIndex != i)
			{
				array[currentIndex] = array[i];
				array[i] = currentMinimum;
			}
		}
		return array;
	
	}
	public static void main(String[] args)
	{
		int[] array = {2, 9, 5, 4, 8, 1, 6};
		int[] array2 = selectionSort(array);
		System.out.println(Arrays.toString(array2));
	}
	

}
