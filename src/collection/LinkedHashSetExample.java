package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Object> names = new LinkedHashSet<>();
		names.add("Alice");
		names.add("Bob");
		names.add(123);
		names.add(45.67);
		names.add(true);
		names.add('Z');
		names.add(null);
		System.out.println("Names: " + names);
		// System.out.println("First name: " + names.get(2));
		System.out.println("List of names:");
		for (Object name : names) {
			System.out.println(name);

		}
		names.remove(true);
		System.out.println("After removing true: " + names);

	}

}
