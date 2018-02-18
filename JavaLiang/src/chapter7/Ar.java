package chapter7;

import java.util.Arrays;

public class Ar
{

	public static void main(String[] args)
	{
		double[] array =  {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		double[] array2 =  {3, 5, 3, 3.5, 2.2, 1.9, 2};
		Arrays.parallelSort(array2);
		System.out.println(Arrays.toString(array2));
		
		char[] chars = {'a','A','4','F','D','P'};
		Arrays.sort(chars,1,3);
		System.out.println(Arrays.toString(chars));
		System.out.println();
		
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		System.out.println("1. Index is " + Arrays.binarySearch(list, 11));
		System.out.println("2. Index is " + Arrays.binarySearch(list, 12));
		System.out.println("3. Index is " + Arrays.binarySearch(list, 46));
		System.out.println();
		char[] chars1 = {'a', 'c', 'g', 'x', 'y', 'z'};
		System.out.println("4.Index is " + Arrays.binarySearch(chars1, 'a'));
		//-low -1
		System.out.println("5.Index is " + Arrays.binarySearch(chars1, 't'));
		System.out.println("6.Index is " + Arrays.binarySearch(chars1, 'w'));
		
		System.out.println("Equals");
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 10};
		int[] list3 = {4, 2, 7, 10};
		
		System.out.println(Arrays.equals(list1, list2));
		System.out.println(Arrays.equals(list1, list3));
		int[] list4 = {2, 4, 7,6, 10};
		System.out.println();
		System.out.println(Arrays.toString(list4));
		
		
	}
}
