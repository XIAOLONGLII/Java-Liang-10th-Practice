class GenericSort {
	public static void main(String[] args) {
		Integer[] list = {new Integer(2), new Integer(5),new Integer(3),new Integer(1)};
		Character[] charArray = {new Character('a'), new Character('c'),new Character('b'),new Character('d')};
	    System.out.println("Before: ");

		printList(list);
		printList(charArray);
		
		sort(list);
		sort(charArray);
		System.out.println("After: ");
		printList(list);
		printList(charArray);
		
	}
	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;
		for(int i = 0; i < list.length - 1; i++) {
			currentMin = list[i];
			currentMinIndex = i;

			for(int j = i + 1; j < list.length; j++) {
				if(currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}

	}
	public static void printList(Object[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}	
		System.out.println();
	}
}
