package chapter7;

import java.util.Arrays;

public class ReverseArray
{
	public static void main(String[] args)
	{
		int[] list = {1,2,3,4,5};
		int[] reversedList = new int[list.length];
		for(int i = 0, j = list.length - 1; i < list.length;i++,j--)
		{
			reversedList[j] = list[i];
		}
		System.out.println(Arrays.toString(reversedList));
	}

}
