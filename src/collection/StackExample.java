package collection;

import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		List<String> list = new Stack<>();
		list.add("Alice");
		list.add("Bob");
		list.add("Charlie");
		list.add("David");
		list.add("Eve");
		System.out.println("Vector: " + list);
		System.out.println("First element: " + list.get(0));
		list.remove("Charlie");
		System.out.println("After removing Charlie: " + list);
		System.out.println("List of names:");
		for (String name : list) {
			System.out.println(name);
		}
	}

}
