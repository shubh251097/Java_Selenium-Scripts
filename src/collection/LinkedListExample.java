package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Object> names = new LinkedList<>();

		// Add elements to the ArrayList
		names.add("Alice");
		names.add("Bob");
		names.add("Bob");
		// names.add("David");
		names.add(123);
		names.add(45.67);
		names.add(true);
		names.add('Z');
		names.add(null);

// Print the ArrayList
		System.out.println("Names: " + names);

		// Access elements by index
		System.out.println("First name: " + names.get(2));

		// Remove an element
		names.remove("Bob");
		System.out.println("After removing Bob: " + names);

		// Loop through elements
		System.out.println("List of names:");
		for (Object name : names) {
			System.out.println(name);
		}
	}
}
