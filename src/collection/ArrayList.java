package collection;

public class ArrayList {
	public static void main(String[] args) {
		
		  // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Print the ArrayList
        System.out.println("Names: " + names);

        // Access elements by index
        System.out.println("First name: " + names.get(0));

        // Remove an element
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);

        // Loop through elements
        System.out.println("List of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

		
		
		
	}
	
	

	
}
