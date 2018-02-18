package chapter7;

public class SwapArrays
{

	public static void swap(int a, int b)
	{
		int temp = a;
		a = b; 
		b = temp;
		
	}
	public static void swapp(int[] array)
	{
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,2};
		swap(a[0],a[1]);
		System.out.println(a[0] + " " + a[1]);
		
		swapp(a);
		System.out.println(a[0] + " " + a[1]);
	}
}
