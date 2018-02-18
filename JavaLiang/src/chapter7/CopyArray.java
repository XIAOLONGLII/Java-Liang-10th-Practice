package chapter7;

import java.util.Arrays;

public class CopyArray
{
	public static void main(String[] args)
	{
		int[] source = {3,4,5};
		int[] target = new int[source.length];
		//for(int i = 0; i < source.length;i++)
		//{
		//	target[i] = source[i];
		//}
		//System.out.println(Arrays.toString(target));
		
		System.arraycopy(source, 0, target, 0, source.length);
		System.out.println(Arrays.toString(target));
		
		int[] myList;
		myList = new int[10];
		System.out.println(myList.length);
		myList = new int[20];
		System.out.println(myList.length);
	}
}
