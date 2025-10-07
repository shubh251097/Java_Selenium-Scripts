package constructor;

class Student {
	String name;
	int age;

	Student() {
		this("Unknown", 0); // calling another constructor
	}

	Student(String n, int a) {
		name = n;
		age = a;
	}

	void show() {
		System.out.println(name + " " + age);
	}
}

public class ConstructorOverloadingUsingThisKeyword {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Alice", 20);

		s1.show(); // Output: Unknown 0
		s2.show(); // Output: Alice 20

	}

}
