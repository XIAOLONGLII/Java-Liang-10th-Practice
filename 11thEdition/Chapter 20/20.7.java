import java.util.*;
class SortStringByLength{
	public static void main(String[] args) {
		String[] cities = {"NEW YORK", "LA", "NOLA", "San Fran", "San Jose"};
		Arrays.sort(cities, new MyComparator());
		for(String city: cities) {
			System.out.print(city + " ");
		}
		System.out.println();
	}
	private static class MyComparator implements Comparator<String> {
		@Override
		public int compare (String s1, String s2) {
			return s1.length() - s2.length();
		}
	}
}
