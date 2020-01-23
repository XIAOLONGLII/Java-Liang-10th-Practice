import java.util.*;
class TestForEach{
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("New York");
		collection.add("MTV");
		collection.add("Austin");
		collection.add("LA");

		collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
		

		Collection<Integer> collection1 = new ArrayList<>();
		collection1.add(1);
		collection1.add(3);
		collection1.add(2);
		collection1.add(4);
		collection1.forEach(e2 -> System.out.print((e2 + 2) + " "));

	}
}
